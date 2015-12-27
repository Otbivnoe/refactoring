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
        context.setSpaceCount(context.getspaceCount()-1);
        context.setCurrentStage(Context.HandlerStage.SpecialSymbol);
        setPrevCharacterForContext(context);
        return currentSpacesForContext(context) + String.valueOf(context.getCurrentCharacter()) + "\n";
    }
}
