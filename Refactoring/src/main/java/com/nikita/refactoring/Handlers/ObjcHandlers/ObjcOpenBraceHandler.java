package com.nikita.refactoring.Handlers.ObjcHandlers;

import com.nikita.refactoring.Context;
import com.nikita.refactoring.Handlers.IHandler;

/**
 * Created by nikita on 02/10/15.
 */
public class ObjcOpenBraceHandler extends ObjcHandler implements IHandler
{
    public String handle(Context context)
    {
        if (context.currentCharacter != OPEN_BRACE_CHARACTER) {
            return "";
        }

        String spaces = currentSpacesForContext(context);
        context.spaceCount++;
        setPrevCharacterForContext(context);
        return "\n" + spaces + String.valueOf(OPEN_BRACE_CHARACTER) + "\n";
    }
}