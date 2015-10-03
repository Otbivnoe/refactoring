package com.nikita.refactoring.LanguagesFactory;

import com.nikita.refactoring.Handlers.IHandler;

import java.util.List;

/**
 * Created by nikita on 02/10/15.
 */
public abstract class LanguageFactory
{
       public abstract List<IHandler> refactoringHandlers();
}
