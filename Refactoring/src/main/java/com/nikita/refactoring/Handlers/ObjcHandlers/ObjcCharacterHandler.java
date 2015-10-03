package com.nikita.refactoring.Handlers.ObjcHandlers;

import com.nikita.refactoring.Context;
import com.nikita.refactoring.Handlers.IHandler;

/**
 * Created by nikita on 02/10/15.
 */
public class ObjcCharacterHandler extends ObjcHandler implements IHandler
{
    public String handle(Context context)
    {
        if (context.currentCharacter == OPEN_BRACE_CHARACTER ||
            context.currentCharacter == CLOSE_BRACE_CHARACTER ||
            context.currentCharacter == SEMICON_CHARACTER ||
            context.currentCharacter == SPACE_CHARACTER) {
            return "";
        }

        if (context.prevCharacter == SEMICON_CHARACTER ||
            context.prevCharacter == OPEN_BRACE_CHARACTER ||
            context.prevCharacter == CLOSE_BRACE_CHARACTER) {
                setPrevCharacterForContext(context);
                return currentSpacesForContext(context) + String.valueOf(context.currentCharacter);
        } else {
            setPrevCharacterForContext(context);
            return  String.valueOf(context.currentCharacter);
        }
    }
}
