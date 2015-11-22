package com.nikita.refactoring.Guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import com.nikita.refactoring.LanguagesFactory.ILanguageFactory;
import com.nikita.refactoring.ReadFromFile;
import com.nikita.refactoring.WriteToFile;
import com.nikita.refactoring.interfaces.IReadInterface;
import com.nikita.refactoring.interfaces.IWriteInterface;

import java.io.IOException;


/**
 * Created by nikita on 04/11/15.
 */
public class RefactorModule extends AbstractModule {

    final static String OUTPUT_FILE_NAME = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/files/testOutput.txt";
    final static String FILE_NAME = "/Users/nikita/Documents/Projects/Universe/TRPO/gitRefactoring/Refactoring/src/main/java/com/nikita/refactoring/files/test2.txt";

    @Override
    protected void configure()
    {
        bind(ILanguageFactory.class).toProvider(ObjcFactoryProvider.class);
    }

    @Provides
    IWriteInterface provideWriteToFile() throws IOException
    {
        WriteToFile writer = new WriteToFile(OUTPUT_FILE_NAME);
        return writer;
    }

    @Provides
    IReadInterface provideReadFromFile() throws IOException
    {
        ReadFromFile reader = new ReadFromFile(FILE_NAME);
        return reader;
    }
}
