import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word testWord = new Word("sauna");
    assertEquals(true, testWord instanceof Word);
  }

  //an ancient Finnish word referring to the traditional Finnish bath and to the bathhouse itself

} //end of WordTest