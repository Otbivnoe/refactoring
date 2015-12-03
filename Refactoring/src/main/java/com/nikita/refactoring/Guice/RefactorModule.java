package com.nikita.refactoring.Guice;

import com.google.inject.AbstractModule;

import com.nikita.refactoring.LanguagesFactory.ILanguageFactory;
import com.nikita.refactoring.interfaces.IReadInterface;
import com.nikita.refactoring.interfaces.IWriteInterface;

import java.lang.ClassNotFoundException;

/**
 * Created by nikita on 04/11/15.
 */
public class RefactorModule extends AbstractModule {

    @Override
    protected void configure()
    {
        try {
            Class ILanguageFactoryProviderClass = Class.forName((String) JsonHelper.getObjectForKey("ILanguageFactoryProvider"));
            Class IWriteInterfaceProviderClass = Class.forName((String) JsonHelper.getObjectForKey("IWriteInterfaceProvider"));
            Class IReadInterfaceProviderClass = Class.forName((String) JsonHelper.getObjectForKey("IReadInterfaceProvider"));

            bind(ILanguageFactory.class).toProvider(ILanguageFactoryProviderClass);
            bind(IWriteInterface.class).toProvider(IWriteInterfaceProviderClass);
            bind(IReadInterface.class).toProvider(IReadInterfaceProviderClass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
