package com.nikita.refactoring.Handlers;

import com.nikita.refactoring.Context;

/**
 * Created by nikita on 02/10/15.
 */
public interface IHandler
{
    public final char OPEN_BRACE_CHARACTER = '{';
    public final char CLOSE_BRACE_CHARACTER = '}';
    public final char SEMICON_CHARACTER = ';';
    public final char SPACE_CHARACTER = ' ';

    String handle(Context context);
}
