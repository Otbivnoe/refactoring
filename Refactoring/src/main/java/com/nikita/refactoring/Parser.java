package com.nikita.refactoring;

import com.nikita.refactoring.Handlers.IHandler;
import com.nikita.refactoring.LanguagesFactory.LanguageFactory;
import com.nikita.refactoring.interfaces.IReadInterface;
import com.nikita.refactoring.interfaces.IWriteInterface;
import java.util.List;

/**
 * Created by nikita on 19/09/15.
 */

public class Parser
{
    private int tabCount = 0;
    private char prevSymbol = ' ';

    public List<IHandler> handlers;

    public Parser(LanguageFactory factory)
    {
        this.handlers = factory.refactoringHandlers();
    }

    String currentSpaces()
    {
        String spaces = new String();
        for (int i = 0; i < tabCount; i++) {
            spaces += "\t";
        }

        return spaces;
    }

    public void startRefactoring(IWriteInterface write, IReadInterface reader)
    {
        Context context = new Context();

        while (reader.isElementAvailable()) {
            context.currentCharacter = reader.readElement();

            for (IHandler handler : this.handlers) {
                String newString = handler.handle(context);
                write.writeString(newString);
            }
        }
    }
}
