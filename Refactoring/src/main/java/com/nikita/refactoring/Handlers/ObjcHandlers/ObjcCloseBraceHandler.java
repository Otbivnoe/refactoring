package com.nikita.refactoring.Handlers.ObjcHandlers;

import com.nikita.refactoring.Context;
import com.nikita.refactoring.Handlers.IHandler;

/**
 * Created by nikita on 02/10/15.
 */
public class ObjcCloseBraceHandler extends ObjcHandler implements IHandler
{
    public String handle(Context context)
    {
        if (context.currentCharacter != CLOSE_BRACE_CHARACTER) {
            return "";
        }

        context.spaceCount--;
        setPrevCharacterForContext(context);
        return currentSpacesForContext(context) + String.valueOf(CLOSE_BRACE_CHARACTER) + "\n";
    }
}
