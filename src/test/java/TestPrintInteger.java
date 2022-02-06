import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class TestPrintInteger {

   @Test
   public void testPrint() {
      InputStream stdin = System.in;

      int expectedYear=2099;

      String input=String.valueOf(expectedYear)+"\r\n";
      System.setIn(new ByteArrayInputStream(input.getBytes()));

      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(byteArrayOutputStream);
      PrintStream stdout = System.out;
      System.setOut(ps);

      MyYearOfBirth.main(new String[0]);

      System.setIn(stdin);
      System.setOut(stdout);

      String actual=byteArrayOutputStream.toString();

      String outStream="Adja meg a szuletesi evet:";
      String expected=outStream+String.valueOf(expectedYear);

      boolean goodMessage=actual.contains(input);
      Assertions.assertTrue(goodMessage,"Nem a megfelelo uzenet jelenik meg!");
   }
}
