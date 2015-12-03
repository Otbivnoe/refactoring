package com.nikita.refactoring.Guice;

import com.nikita.refactoring.ReadFromFile;
import com.nikita.refactoring.interfaces.IReadInterface;

import javax.inject.Provider;

/**
 * Created by nikita on 29/11/15.
 */
public class ReadFromFileProvider implements Provider<IReadInterface> {

    public IReadInterface get() {
        ReadFromFile reader = new ReadFromFile((String)JsonHelper.getObjectForKey("InputFileName"));
        return reader;
    }
}
