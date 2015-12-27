package com.nikita.refactoring.Handlers;

import com.nikita.refactoring.Context;
import com.nikita.refactoring.Guice.JsonHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by nikita on 27/12/15.
 */
public class MapHandlersHelper {

    private static final Logger log = LoggerFactory.getLogger(MapHandlersHelper.class);

    public static IHandler getCurrentHandlerForContext(Context context) {

        String currentLanguageMapHandlers = (String)JsonHelper.getObjectForKeyPath("CurrentMapHandlers");
        String currentStage = context.getCurrentStage().toString();
        char currentSymbol = context.getCurrentCharacter();

        String handlerPath = currentLanguageMapHandlers + "." + currentSymbol + "." + currentStage;
        String handlerName = (String)JsonHelper.getObjectForKeyPath(handlerPath);
        if (handlerName == null) {
            handlerPath = currentLanguageMapHandlers + "." + "others" + "." + currentStage;
        }

        try {
            Class handlerClass = Class.forName((String)JsonHelper.getObjectForKeyPath(handlerPath));
            return (IHandler)handlerClass.newInstance();
        } catch (ClassNotFoundException e) {
            log.error("ClassNotFoundException", e);
        } catch (InstantiationException e) {
            log.error("InstantiationException", e);
        } catch (IllegalAccessException e) {
            log.error("IllegalAccessException", e);
        }
        return null;
    }

}
