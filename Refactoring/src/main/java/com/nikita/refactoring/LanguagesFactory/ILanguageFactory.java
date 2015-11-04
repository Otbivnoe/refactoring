package com.nikita.refactoring.LanguagesFactory;

import com.nikita.refactoring.Handlers.IHandler;

import java.util.List;

/**
 * Created by nikita on 04/11/15.
 */
public interface ILanguageFactory {
    List<IHandler> refactoringHandlers();
}
