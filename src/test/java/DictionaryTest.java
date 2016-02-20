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
  public void Dictionary_returnsTwoWords_twoWords() {
    Dictionary testDictionary = new Dictionary();
    Word testWord1 = new Word("sauna","traditional Finnish bathhouse");
    Word testWord2 = new Word("sweatlodge","native american sauna");
    testDictionary.add(testWord1);
    testDictionary.add(testWord2);
    assertEquals("sauna", testDictionary.getFirstWord().getWord());
    assertEquals("sweatlodge", testDictionary.getSecondWord().getWord());
  }

  @Test
  public void Dictionary_returnsTwoDefinitions() {
    Dictionary testDictionary = new Dictionary();
    Word testWord1 = new Word("sauna","traditional Finnish bathhouse");
    Word testWord2 = new Word("sweatlodge","native american sauna");
    testDictionary.add(testWord1);
    testDictionary.add(testWord2);
    assertEquals("traditional Finnish bathhouse", testDictionary.getFirstWord().getDefinition());
    assertEquals("native american sauna", testDictionary.getSecondWord().getDefinition());
  }

  @Test
  public void Dictionary_returnsWordID_0and1() {
    Dictionary testDictionary = new Dictionary();
    Word testWord1 = new Word("sauna","traditional Finnish bathhouse");
    Word testWord2 = new Word("sweatlodge","native american sauna");
    testDictionary.add(testWord1);
    testDictionary.add(testWord2);
    assertEquals(0, testDictionary.getFirstWord().getWordID());
    assertEquals(1, testDictionary.getSecondWord().getWordID());
  }

  @Test
  public void Dictionary_returnsWordByID_correctWord() {
    Dictionary testDictionary = new Dictionary();
    Word testWord1 = new Word("sauna","traditional Finnish bathhouse");
    testDictionary.add(testWord1);
    Word testWord2 = new Word("sweatlodge","native american sauna");
    testDictionary.add(testWord2);
    Word testWord3 = new Word("hammam","middle eastern sauna");
    testDictionary.add(testWord2);
    assertEquals(testWord2, testDictionary.getWordByID(2));
  }

  @Test
  public void Dictionary_returnsWordByID_THROWEXCPETION() {
    Dictionary testDictionary = new Dictionary();
    Word testWord1 = new Word("sauna","traditional Finnish bathhouse");
    testDictionary.add(testWord1);
    Word testWord2 = new Word("sweatlodge","native american sauna");
    testDictionary.add(testWord2);
    Word testWord3 = new Word("hammam","middle eastern sauna");
    testDictionary.add(testWord2);
    assertEquals(null, testDictionary.getWordByID(0));
  }
}
