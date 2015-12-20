package com.nikita.refactoring.Guice;

import com.google.inject.Provider;
import com.nikita.refactoring.Handlers.IHandler;
import com.nikita.refactoring.LanguagesFactory.ILanguageFactory;
import com.nikita.refactoring.LanguagesFactory.ObjCFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by nikita on 04/11/15.
 */
public class ObjcFactoryProvider implements Provider<ILanguageFactory>
{
    private static final Logger log = LoggerFactory.getLogger(ObjcFactoryProvider.class);

    public ILanguageFactory get()
    {
        List<IHandler> handlers = new LinkedList<IHandler>();
        ArrayList<String> array = (JSONArray)JsonHelper.getObjectForKey("ObjcFactoryHandlers");

        for (String str : array) {
            try {
                Class handlerClass = Class.forName(str);
                handlers.add((IHandler) handlerClass.newInstance());
            } catch (ClassNotFoundException e) {
                log.error("Class not found", e);
            } catch (InstantiationException e) {
                log.error("InstantiationException", e);
            } catch (IllegalAccessException e) {
                log.error("IllegalAccessException", e);
            }
        }
        return new ObjCFactory(handlers);
    }
}
