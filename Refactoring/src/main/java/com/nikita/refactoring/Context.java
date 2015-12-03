package com.nikita.refactoring;

/**
 * Created by nikita on 03/10/15.
 */
public class Context
{
    private char prevCharacter;
    private char currentCharacter;
    private int spaceCount;
    private String spaceSize;

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
        this.spaceCount = 0;
        this.spaceSize = "\t";
    }

    public char getPrevCharacter() {
        return prevCharacter;
    }

    public char getCurrentCharacter() {
        return currentCharacter;
    }

    public int getspaceCount() {
        return spaceCount;
    }

    public String getSpaceSize() {
        return spaceSize;
    }

    public void setPrevCharacter(char prevCharacter) {
        this.prevCharacter = prevCharacter;
    }

    public void setCurrentCharacter(char currentCharacter) {
        this.currentCharacter = currentCharacter;
    }

    public void setSpaceCount(int spaceCount) {
        this.spaceCount = spaceCount;
    }

    public void setSpaceSize(String spaceSize) {
        this.spaceSize = spaceSize;
    }
}