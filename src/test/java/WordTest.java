import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word testWord = new Word("sauna","traditional Finnish bathhouse");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void Word_returnsWord_sauna() {
    Word testWord = new Word("sauna","traditional Finnish bathhouse");
    assertEquals("sauna", testWord.getWord());
  }

  @Test
  public void Word_returnsDefinition_saunaDef() {
    Word testWord = new Word("sauna","traditional Finnish bathhouse");
    assertEquals("traditional Finnish bathhouse", testWord.getDefinition());
  }

  @Test
  public void Word_setsAndReturnsTwoDefs_TwoSaunaDefs() {
    Word testWord = new Word("sauna","traditional Finnish bathhouse");
    testWord.addDef("the action of taking part in a sauna");
    assertEquals("the action of taking part in a sauna", testWord.getDefinition(1));
    assertEquals("traditional Finnish bathhouse", testWord.getDefinition());
  }

}
