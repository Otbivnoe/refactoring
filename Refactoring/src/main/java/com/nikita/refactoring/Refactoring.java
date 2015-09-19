package com.nikita.refactoring;

/**
 * Created by nikita on 09/09/15.
 */


import java.io.IOException;

public class Refactoring
{
    final static String FILE_NAME = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/test2.txt";
    final static String OUTPUT_FILE_NAME = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/testOutput.txt";

    public static void main(String... aArgs) throws IOException
    {
        Parser parser = new Parser();
        WriteToFile writer = new WriteToFile(OUTPUT_FILE_NAME);
        ReadFromFile reader = new ReadFromFile(FILE_NAME);

        parser.startRefactoring(writer, reader);
    }

}
