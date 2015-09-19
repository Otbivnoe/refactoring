package com.nikita.refactoring.testClasses;

import com.nikita.refactoring.interfaces.IWriteInterface;

/**
 * Created by nikita on 19/09/15.
 */
public class WriteToString implements IWriteInterface
{
    public String string = "";

    public void writeString(String str)
    {
        string += str;
    }
}
