import java.util.ArrayList;

public class Word {
  private String mWord;
  private ArrayList<String> mDefinitionList = new ArrayList<String>();

  public Word(String word, String definition) {
    mWord = word;
    mDefinitionList.add(definition);
  }

  public String getWord(){
    return mWord;
  }
}
