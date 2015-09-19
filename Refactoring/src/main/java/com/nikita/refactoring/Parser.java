package com.nikita.refactoring;

/**
 * Created by nikita on 19/09/15.
 */
public class Parser
{
    private int tabCount = 0;
    private char prevSymbol = ' ';

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

    public void startRefactoring(IWriteInterface write, IReadInterface reader)
    {
        while (reader.isElementAvailable()) {
            char element = reader.readElement();
            String newElement = newStringForCharacter(element);
            System.out.print(newElement);
            write.writeString(newElement);
        }
    }
}
