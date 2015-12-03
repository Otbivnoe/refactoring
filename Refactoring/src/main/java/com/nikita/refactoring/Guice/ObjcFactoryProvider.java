package com.nikita.refactoring.Guice;

import com.google.inject.Provider;
import com.nikita.refactoring.Handlers.IHandler;
import com.nikita.refactoring.LanguagesFactory.ILanguageFactory;
import com.nikita.refactoring.LanguagesFactory.ObjCFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;

/**
 * Created by nikita on 04/11/15.
 */
public class ObjcFactoryProvider implements Provider<ILanguageFactory>
{
    public ILanguageFactory get()
    {
        List<IHandler> handlers = new LinkedList<IHandler>();
        ArrayList<String> array = (JSONArray)JsonHelper.getObjectForKey("ObjcFactoryHandlers");

        for (String str : array) {
            try {
                Class handlerClass = Class.forName(str);
                handlers.add((IHandler) handlerClass.newInstance());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return new ObjCFactory(handlers);
    }
}
