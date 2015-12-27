package com.nikita.refactoring;

/**
 * Created by nikita on 19/09/15.
 */

import com.nikita.refactoring.interfaces.IWriteInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;

public class WriteToFile implements IWriteInterface
{
    private static final Logger log = LoggerFactory.getLogger(WriteToFile.class);

    private String fileName;
    private File file;
    private FileOutputStream fileOutputStream;

    public WriteToFile(String fileName) throws IOException {
        this.fileName = fileName;
        file = new File(fileName);
        file.createNewFile();

        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException e) {
            log.error("IOException", e);
        }
    }

    public void writeString(String str) {

        byte[] contentInBytes = str.getBytes();

        try {
            fileOutputStream.write(contentInBytes);
        } catch (IOException e) {
            log.error("IOException", e);
        }
    }

    protected void finalize() throws IOException  {
        fileOutputStream.close();
    }
}
