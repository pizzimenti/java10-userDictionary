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
    Word returnedWord = testDictionary.getFirstWord();    
    assertEquals("sauna", returnedWord.getWord());
  }


  // @Test
  // public void all_returnsWordList_twoWords() {
  //   Dictionary testDictionary = new Dictionary();
  //   testDictionary.add("sauna");
  //   testDictionary.add("sweatlodge");
  //   assertEquals("sauna", testDictionary.getWord(wordList[0]));
  //   assertEquals("sweatlodge", testDictionary.getWord(wordList[1]));
  // }

}
