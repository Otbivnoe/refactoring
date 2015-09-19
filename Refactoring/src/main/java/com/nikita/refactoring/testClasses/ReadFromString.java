package com.nikita.refactoring.testClasses;

import com.nikita.refactoring.interfaces.IReadInterface;

/**
 * Created by nikita on 19/09/15.
 */
public class ReadFromString implements IReadInterface
{
    private String string;
    private int currentIndex = 0;

    public ReadFromString()
    {
        this.string = "default";
    }

    public ReadFromString(String string)
    {
        this.string = string;
    }

    public boolean isElementAvailable()
    {
        return (currentIndex < string.length());
    }

    public char readElement()
    {
        return (char)string.charAt(currentIndex++);
    }
}
