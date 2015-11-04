package com.nikita.refactoring;

/**
 * Created by nikita on 09/09/15.
 */

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.nikita.refactoring.Guice.BillingModule;
import com.nikita.refactoring.interfaces.IReadInterface;
import com.nikita.refactoring.interfaces.IWriteInterface;

import java.io.IOException;

public class Refactoring
{
    public static void main(String... aArgs) throws IOException
    {
        Injector injector = Guice.createInjector(new BillingModule());
        Parser parser = injector.getInstance(Parser.class);

        IWriteInterface writer = injector.getInstance(IWriteInterface.class);
        IReadInterface reader = injector.getInstance(IReadInterface.class);

        parser.startRefactoring(writer, reader);
    }

}
