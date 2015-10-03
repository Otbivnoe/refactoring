package com.nikita.refactoring.LanguagesFactory;

import com.nikita.refactoring.Handlers.IHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcCharacterHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcCloseBraceHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcOpenBraceHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcSemicolonHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcSpaceHandler;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nikita on 02/10/15.
 */

public class ObjCFactory extends LanguageFactory
{
    @Override
    public List<IHandler> refactoringHandlers()
    {
        List<IHandler> handlers = new LinkedList<IHandler>();
        handlers.add(new ObjcCharacterHandler());
        handlers.add(new ObjcSpaceHandler());
        handlers.add(new ObjcCloseBraceHandler());
        handlers.add(new ObjcOpenBraceHandler());
        handlers.add(new ObjcSemicolonHandler());

        return handlers;
    }
}
