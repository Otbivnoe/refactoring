package com.nikita.refactoring.Guice;

import com.google.inject.Provider;
import com.nikita.refactoring.Handlers.IHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.*;
import com.nikita.refactoring.LanguagesFactory.ILanguageFactory;
import com.nikita.refactoring.LanguagesFactory.ObjCFactory;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nikita on 04/11/15.
 */
public class ObjcFactoryProvider implements Provider<ILanguageFactory>
{
    public ILanguageFactory get()
    {
        List<IHandler> handlers = new LinkedList<IHandler>();
        handlers.add(new ObjcCharacterHandler());
        handlers.add(new ObjcSpaceHandler());
        handlers.add(new ObjcCloseBraceHandler());
        handlers.add(new ObjcOpenBraceHandler());
        handlers.add(new ObjcSemicolonHandler());

        return new ObjCFactory(handlers);
    }
}
