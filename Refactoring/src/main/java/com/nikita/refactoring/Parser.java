package com.nikita.refactoring;

import com.nikita.refactoring.Handlers.IHandler;
import com.nikita.refactoring.Handlers.MapHandlersHelper;
import com.nikita.refactoring.interfaces.IReadInterface;
import com.nikita.refactoring.interfaces.IWriteInterface;

/**
 * Created by nikita on 19/09/15.
 */

public class Parser
{
    public void startRefactoring(IWriteInterface write, IReadInterface reader) {
        Context context = new Context();

        while (reader.isElementAvailable()) {
            context.setCurrentCharacter(reader.readElement());

            IHandler handler = MapHandlersHelper.getCurrentHandlerForContext(context);
            String newString = handler.handle(context);
            write.writeString(newString);
        }
    }
}
