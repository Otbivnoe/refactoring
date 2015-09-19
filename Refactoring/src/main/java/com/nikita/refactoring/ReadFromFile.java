package com.nikita.refactoring;

/**
 * Created by nikita on 19/09/15.
 */

import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;

public class ReadFromFile implements IReadInterface
{
    private String fileName;
    private File file;
    private FileInputStream fileInputStream;

    public ReadFromFile(String fileName)
    {
        this.fileName = fileName;
        file = new File(fileName);

        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementAvailable()
    {
        try {
            return (fileInputStream.available() > 0);
        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public char readElement()
    {
        try {
            return (char) fileInputStream.read();
        } catch (IOException e) {
            return ' ';
        }
    }

    protected void finalize() throws IOException
    {
        fileInputStream.close();
    }
}
