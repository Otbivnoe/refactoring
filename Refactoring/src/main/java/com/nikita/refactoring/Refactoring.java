package com.nikita.refactoring;

/**
 * Created by nikita on 09/09/15.
 */


import com.nikita.refactoring.LanguagesFactory.ObjCFactory;

import java.io.IOException;

public class Refactoring
{
    final static String FILE_NAME = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/files/test2.txt";
    final static String OUTPUT_FILE_NAME = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/files/testOutput.txt";

    public static void main(String... aArgs) throws IOException
    {
        WriteToFile writer = new WriteToFile(OUTPUT_FILE_NAME);
        ReadFromFile reader = new ReadFromFile(FILE_NAME);

        Parser parser = new Parser(new ObjCFactory());
        parser.startRefactoring(writer, reader);
    }

}
