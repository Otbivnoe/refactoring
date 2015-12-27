package com.nikita.refactoring.Guice;

import com.google.inject.AbstractModule;

import com.nikita.refactoring.interfaces.IReadInterface;
import com.nikita.refactoring.interfaces.IWriteInterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.ClassNotFoundException;

/**
 * Created by nikita on 04/11/15.
 */
public class RefactorModule extends AbstractModule {

    private static final Logger log = LoggerFactory.getLogger(RefactorModule.class);

    @Override
    protected void configure()
    {
        try {
            Class IWriteInterfaceProviderClass = Class.forName((String) JsonHelper.getObjectForKey("IWriteInterfaceProvider"));
            Class IReadInterfaceProviderClass = Class.forName((String) JsonHelper.getObjectForKey("IReadInterfaceProvider"));

            bind(IWriteInterface.class).toProvider(IWriteInterfaceProviderClass);
            bind(IReadInterface.class).toProvider(IReadInterfaceProviderClass);

        } catch (ClassNotFoundException e) {
            log.error("Class not found", e);
        } catch (NullPointerException e) {
            log.error("Null pointer", e);
        }
    }
}
