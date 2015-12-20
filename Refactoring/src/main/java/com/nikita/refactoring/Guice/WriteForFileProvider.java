package com.nikita.refactoring.Guice;

import com.nikita.refactoring.WriteToFile;
import com.nikita.refactoring.interfaces.IWriteInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Provider;
import java.io.IOException;

/**
 * Created by nikita on 29/11/15.
 */

public class WriteForFileProvider implements Provider<IWriteInterface> {

    private static final Logger log = LoggerFactory.getLogger(WriteForFileProvider.class);

    public IWriteInterface get() {
        try {
            WriteToFile writer = new WriteToFile((String)JsonHelper.getObjectForKey("OutputFileName"));
            return writer;
        } catch (IOException e) {
            log.error("IOException", e);
        }
        return null;
    }
}
