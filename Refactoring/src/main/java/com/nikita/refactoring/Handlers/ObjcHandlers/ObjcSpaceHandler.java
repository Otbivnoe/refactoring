package com.nikita.refactoring.Handlers.ObjcHandlers;

import com.nikita.refactoring.Context;
import com.nikita.refactoring.Handlers.IHandler;

/**
 * Created by nikita on 03/10/15.
 */
public class ObjcSpaceHandler extends ObjcHandler implements IHandler
{
    public String handle(Context context)
    {
        if (context.getCurrentCharacter() != SPACE_CHARACTER) {
            return "";
        }

        setPrevCharacterForContext(context);
        return String.valueOf(SPACE_CHARACTER);
    }
}
