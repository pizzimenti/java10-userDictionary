import java.util.ArrayList;

public class Word {
  private String mWord;
  private ArrayList<String> mDefinitionList = new ArrayList<String>();
  private int mID;

  public Word(String word, String definition) {
    mWord = word;
    mDefinitionList.add(definition);
  }

  public String getWord() {
    return mWord;
  }

  public void addDef(String newDef) {
    mDefinitionList.add(newDef);
  }

  public String getDefinition() {
    return mDefinitionList.get(0);
  }

  public String getDefinition(int DefIndex) {
    return mDefinitionList.get(DefIndex);
  }

  public ArrayList<String> getDefinitionList() {
    return mDefinitionList;
  }

  public int getWordID() {
    return mID;
  }

  public void setWordID(int wordID) {
    mID = wordID;
  }

}
