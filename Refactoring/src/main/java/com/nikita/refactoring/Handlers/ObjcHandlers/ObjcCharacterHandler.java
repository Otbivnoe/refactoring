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
        if (context.getPrevCharacter() == SEMICON_CHARACTER ||
            context.getPrevCharacter() == OPEN_BRACE_CHARACTER ||
            context.getPrevCharacter() == CLOSE_BRACE_CHARACTER) {
                setPrevCharacterForContext(context);
                return currentSpacesForContext(context) + String.valueOf(context.getCurrentCharacter());
        } else {
            setPrevCharacterForContext(context);
            return  String.valueOf(context.getCurrentCharacter());
        }
    }
}
