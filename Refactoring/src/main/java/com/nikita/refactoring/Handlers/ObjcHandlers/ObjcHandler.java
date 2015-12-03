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
        for (int i = 0; i < context.getspaceCount(); i++) {
            spaces += context.getSpaceSize();
        }

        return spaces;
    }

    void setPrevCharacterForContext(Context context)
    {
        if (context.getCurrentCharacter() != ' ') {
            context.setPrevCharacter(context.getCurrentCharacter());
        }
    }
}
