/**
 * Created by nikita on 20/12/15.
 */
import static org.junit.Assert.assertEquals;

import com.nikita.refactoring.Guice.IoCManager;
import com.nikita.refactoring.LanguagesFactory.ILanguageFactory;
import com.nikita.refactoring.Parser;
import com.nikita.refactoring.testClasses.ReadFromString;
import com.nikita.refactoring.testClasses.WriteToString;
import org.junit.Test;

public class TestClass
{
    @Test
    public void testString()
    {
//        IoCManager iocManager = new IoCManager();
//
//        ILanguageFactory factory = iocManager.getInstance(ILanguageFactory.class);
//        Parser parser = new Parser();
//
//        WriteToString writer = new WriteToString();
//        ReadFromString reader = new ReadFromString("string(){cout << s;}");
//
//        parser.startRefactoring(writer, reader);
//
//        String refactoringString = "string()\n{\n\tcout << s;\n}\n";
//        System.out.print(refactoringString);
//        assertEquals(refactoringString, writer.string);
    }
}
