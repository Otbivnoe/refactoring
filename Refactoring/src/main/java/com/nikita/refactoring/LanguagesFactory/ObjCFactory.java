package com.nikita.refactoring.LanguagesFactory;

import com.google.inject.Inject;
import com.nikita.refactoring.Handlers.IHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcCharacterHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcCloseBraceHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcOpenBraceHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcSemicolonHandler;
import com.nikita.refactoring.Handlers.ObjcHandlers.ObjcSpaceHandler;
import jdk.internal.org.objectweb.asm.Handle;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nikita on 02/10/15.
 */

public class ObjCFactory implements ILanguageFactory
{
    private final List<IHandler> handlers;

    public ObjCFactory(List<IHandler> handlers)
    {
        this.handlers = handlers;
    }

    public List<IHandler> refactoringHandlers()
    {
        return this.handlers;
    }
}
