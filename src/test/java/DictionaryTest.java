import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;


public class DictionaryTest {

  @Test
  public void Dictionary_instantiatesCorrectly_true() {
    Dictionary testDictionary = new Dictionary();
    assertEquals(true, testDictionary instanceof Dictionary);
  }

  @Test
  public void Dictionary_returnsWord_sauna() {
    Dictionary testDictionary = new Dictionary();
    Word testWord = new Word("sauna","traditional Finnish bathhouse");
    testDictionary.add(testWord);
    assertEquals("sauna", testDictionary.getFirstWord().getWord());
  }

  @Test
  public void all_returnsWordList_twoWords() {
    Dictionary testDictionary = new Dictionary();
    Word testWord1 = new Word("sauna","traditional Finnish bathhouse");
    Word testWord2 = new Word("sweatlodge","native american sauna");
    testDictionary.add(testWord1);
    testDictionary.add(testWord2);
    assertEquals("sauna", testDictionary.getFirstWord().getWord());
    assertEquals("sweatlodge", testDictionary.getSecondWord().getWord());
  }

}
