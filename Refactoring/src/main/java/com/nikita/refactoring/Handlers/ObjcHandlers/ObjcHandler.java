package com.nikita.refactoring.Handlers.ObjcHandlers;

import com.nikita.refactoring.Context;

/**
 * Created by nikita on 03/10/15.
 */
public class ObjcHandler
{
    String currentSpacesForContext(Context context)
    {
        String spaces = new String();
        for (int i = 0; i < context.spaceCount; i++) {
            spaces += context.spaceSize;
        }

        return spaces;
    }

    void setPrevCharacterForContext(Context context)
    {
        if (context.currentCharacter != ' ') {
            context.prevCharacter = context.currentCharacter;
        }
    }
}
