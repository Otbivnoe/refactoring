package com.nikita.refactoring.Guice;

import com.nikita.refactoring.WriteToFile;
import com.nikita.refactoring.interfaces.IWriteInterface;

import javax.inject.Provider;
import java.io.IOException;

/**
 * Created by nikita on 29/11/15.
 */

public class WriteForFileProvider implements Provider<IWriteInterface> {

    public IWriteInterface get() {
        try {
            WriteToFile writer = new WriteToFile((String)JsonHelper.getObjectForKey("OutputFileName"));
            return writer;
        } catch (IOException e) {
            return null;
        }
    }
}
