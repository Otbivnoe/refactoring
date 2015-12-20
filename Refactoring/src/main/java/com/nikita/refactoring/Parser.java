package com.nikita.refactoring;

import com.google.inject.Inject;
import com.nikita.refactoring.Handlers.IHandler;
import com.nikita.refactoring.interfaces.IReadInterface;
import com.nikita.refactoring.interfaces.IWriteInterface;
import com.nikita.refactoring.LanguagesFactory.ILanguageFactory;
import java.util.List;

/**
 * Created by nikita on 19/09/15.
 */

public class Parser
{
    private final List<IHandler> handlers;

    public Parser(ILanguageFactory factory)
    {
        this.handlers = factory.refactoringHandlers();
    }

    public void startRefactoring(IWriteInterface write, IReadInterface reader)
    {
        Context context = new Context();

        while (reader.isElementAvailable()) {
            context.setCurrentCharacter(reader.readElement());
            context.setRunNextHandler(true);

            for (IHandler handler : this.handlers) {
                String newString = handler.handle(context);
                write.writeString(newString);
                if (!context.isRunNextHandler()) {
                    break;
                }
            }
        }
    }
}
