package com.nikita.refactoring.Handlers;

import com.nikita.refactoring.Context;

/**
 * Created by nikita on 02/10/15.
 */
public interface IHandler
{
    char OPEN_BRACE_CHARACTER = '{';
    char CLOSE_BRACE_CHARACTER = '}';
    char SEMICON_CHARACTER = ';';
    char SPACE_CHARACTER = ' ';

    String handle(Context context);
}
