package com.nikita.refactoring;

/**
 * Created by nikita on 03/10/15.
 */
public class Context
{
    public char prevCharacter;
    public char currentCharacter;
    public String spaceSize;
    public int spaceCount;

    public Context()
    {
        defaultInitial();
    }

    public Context(char character)
    {
        defaultInitial();
        this.currentCharacter = character;
    }

    private void defaultInitial()
    {
        this.prevCharacter = ' ';
        this.currentCharacter = ' ';
        this.spaceSize = "\t";
        this.spaceCount = 0;
    }
}
