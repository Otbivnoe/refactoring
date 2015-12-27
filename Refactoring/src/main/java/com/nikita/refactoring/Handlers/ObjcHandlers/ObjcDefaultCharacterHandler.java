package com.nikita.refactoring.Handlers.ObjcHandlers;

import com.nikita.refactoring.Context;
import com.nikita.refactoring.Handlers.IHandler;

/**
 * Created by nikita on 27/12/15.
 */
public class ObjcDefaultCharacterHandler extends ObjcHandler implements IHandler {

    public String handle(Context context)
    {
        setPrevCharacterForContext(context);
        context.setCurrentStage(Context.HandlerStage.Default);
        return  String.valueOf(context.getCurrentCharacter());
    }
}
