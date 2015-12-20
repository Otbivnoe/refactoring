package com.nikita.refactoring;

/**
 * Created by nikita on 09/09/15.
 */

import com.nikita.refactoring.Guice.IoCManager;
import com.nikita.refactoring.LanguagesFactory.ILanguageFactory;
import com.nikita.refactoring.interfaces.IReadInterface;
import com.nikita.refactoring.interfaces.IWriteInterface;

import java.io.IOException;

public class Refactoring
{
    public static void main(String... aArgs) throws IOException
    {
        IoCManager iocManager = new IoCManager();

        ILanguageFactory factory = iocManager.getInstance(ILanguageFactory.class);
        Parser parser = new Parser(factory);

        IWriteInterface writer = iocManager.getInstance(IWriteInterface.class);
        IReadInterface reader = iocManager.getInstance(IReadInterface.class);

        parser.startRefactoring(writer, reader);
    }

}
