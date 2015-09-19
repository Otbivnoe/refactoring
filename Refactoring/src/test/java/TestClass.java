/**
 * Created by nikita on 19/09/15.
 */

import static org.junit.Assert.assertEquals;

import com.nikita.refactoring.Parser;
import com.nikita.refactoring.ReadFromFile;
import com.nikita.refactoring.WriteToFile;
import com.nikita.refactoring.testClasses.ReadFromString;
import com.nikita.refactoring.testClasses.WriteToString;
import org.junit.Test;

public class TestClass
{
    @Test
    public void testString()
    {
        Parser parser = new Parser();
        WriteToString writer = new WriteToString();
        ReadFromString reader = new ReadFromString("string(){cout << s;}");

        parser.startRefactoring(writer, reader);

        String refactoringString = "string()\n{\n\tcout << s;\n}\n";
        System.out.print(refactoringString);
        assertEquals(refactoringString, writer.string);
    }
}
