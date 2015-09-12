package com.nikita.refactoring;

/**
 * Created by nikita on 09/09/15.
 */


import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public class Refactoring
{
    final static String FILE_NAME = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/test2.txt";
    final static String OUTPUT_FILE_NAME = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/testOutput.txt";

    static int tabCount = 0;
    static char prevSymbol = ' ';

    String newStringForCharacter(char symbol)
    {
        String newString = new String();

        switch (symbol)
        {
            case '{':
            {
                String spaces = currentSpaces();
                tabCount++;
                newString = "\n" + spaces + String.valueOf('{') + "\n";
                break;
            }
            case ';':
            {
                newString = String.valueOf(';') + "\n";
                break;
            }
            case '}':
            {
                tabCount--;
                newString = currentSpaces() + String.valueOf('}') + "\n";
                break;
            }
            case ' ':
            {
                newString = String.valueOf(symbol);
                break;
            }
            default:
            {
                if (prevSymbol == ';' || prevSymbol == '{' || prevSymbol == '}') {
                    newString = currentSpaces() + String.valueOf(symbol);
                } else {
                    newString = String.valueOf(symbol);
                }
                break;
            }
        }

        if (symbol != ' ') {
            prevSymbol = symbol;
        }
        return newString;
    }

    String currentSpaces()
    {
        String spaces = new String();
        for (int i = 0; i < tabCount; i++) {
            spaces += "\t";
        }

        return spaces;
    }

    public static void main(String... aArgs) throws IOException
    {
        Refactoring refactoring = new Refactoring();

        File iFile = new File(FILE_NAME);
        File oFile = new File(OUTPUT_FILE_NAME);
        oFile.createNewFile();

        try {
            FileOutputStream fos = new FileOutputStream(oFile);
            FileInputStream fis = new FileInputStream(iFile);
            char current;
            while (fis.available() > 0) {
                current = (char) fis.read();
                byte[] contentInBytes = refactoring.newStringForCharacter(current).getBytes();
                fos.write(contentInBytes);
            }
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
