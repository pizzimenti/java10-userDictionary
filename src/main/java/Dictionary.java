import java.util.ArrayList;

public class Dictionary {
  private ArrayList<Word> mWordList;


  public Dictionary() {
    mWordList = new ArrayList<Word>();
  }

//setter

  public void add(Word newWord) {
    newWord.setWordID(genID());
    mWordList.add(newWord);
  }

//getters

  public ArrayList<Word> getWordList() {
    return mWordList;
  }

  public Word getFirstWord() {
    return mWordList.get(0);
  }

  public Word getSecondWord() {
    return mWordList.get(1);
  }

  public int getWordListSize() {
    return mWordList.size();
  }

  public Word getWordByID(int wordID) {
    try {
      return mWordList.get(wordID-1);
    } catch (IndexOutOfBoundsException iob) {
      return null;
    }
  }

  private int genID() {
    return mWordList.size();
  }
}
