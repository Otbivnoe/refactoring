package com.nikita.refactoring.Handlers.ObjcHandlers;

import com.nikita.refactoring.Context;
import com.nikita.refactoring.Handlers.IHandler;

/**
 * Created by nikita on 02/10/15.
 */
public class ObjcSemicolonHandler extends ObjcHandler implements IHandler
{
    public String handle(Context context)
    {
        setPrevCharacterForContext(context);
        context.setCurrentStage(Context.HandlerStage.SpecialSymbol);
        return String.valueOf(context.getCurrentCharacter()) + "\n";
    }
}
