package com.nikita.refactoring;

/**
 * Created by nikita on 19/09/15.
 */

import com.google.inject.Inject;
import com.nikita.refactoring.interfaces.IWriteInterface;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;

public class WriteToFile implements IWriteInterface
{
    private String fileName;
    private File file;
    private FileOutputStream fileOutputStream;

    @Inject
    public WriteToFile(String fileName) throws IOException {
        this.fileName = fileName;
        file = new File(fileName);
        file.createNewFile();

        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeString(String str)
    {
        byte[] contentInBytes = str.getBytes();

        try {
            fileOutputStream.write(contentInBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void finalize() throws IOException
    {
        fileOutputStream.close();
    }
}
