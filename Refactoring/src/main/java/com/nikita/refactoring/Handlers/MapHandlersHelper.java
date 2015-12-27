package com.nikita.refactoring.Handlers;

import com.nikita.refactoring.Context;
import com.nikita.refactoring.Guice.JsonHelper;

/**
 * Created by nikita on 27/12/15.
 */
public class MapHandlersHelper {

    public static IHandler getCurrentHandlerForContext(Context context) {

        String currentLanguageMapHandlers = (String)JsonHelper.getObjectForKeyPath("CurrentMapHandlers");
        String currentStage = context.getCurrentStage().toString();
        char currentSymbol = context.getCurrentCharacter();

        String handlerPath;
        if (currentSymbol == '{' || currentSymbol == '}' || currentSymbol == ';') {
            handlerPath = currentLanguageMapHandlers + "." + currentSymbol + "." + currentStage;
        } else {
            handlerPath = currentLanguageMapHandlers + "." + "others" + "." + currentStage;
        }

        try {
            Class handlerClass = Class.forName((String)JsonHelper.getObjectForKeyPath(handlerPath));
            return (IHandler)handlerClass.newInstance();
        } catch (ClassNotFoundException e) {

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
        return null;
    }

}
