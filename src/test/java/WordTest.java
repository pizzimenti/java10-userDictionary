import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word testWord = new Word("sauna","traditional Finnish bathhouse");
    assertEquals(true, testWord instanceof Word);
  }

  // @Test
  // public void Word_returnsWord_sauna() {
  //   Word testWord = new Word("sauna");
  //   assertEquals("sauna", testWord.getWord());
  // }
  //
  // @Test
  // public void all_returnsWordList_twoWords() {
  //   Word testWord1 = new Word("sauna");
  //   Word testWord2 = new Word("sweatlodge");
  //   assertTrue(Word.all().contains(testWord1));
  //   assertTrue(Word.all().contains(testWord2));
  // }

}
