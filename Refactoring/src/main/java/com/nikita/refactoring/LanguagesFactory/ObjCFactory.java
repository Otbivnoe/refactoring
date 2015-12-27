package com.nikita.refactoring.LanguagesFactory;

import com.nikita.refactoring.Handlers.IHandler;

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
