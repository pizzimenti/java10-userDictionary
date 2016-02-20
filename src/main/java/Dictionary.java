import java.util.ArrayList;

public class Dictionary {
  private ArrayList<Word> mWordList;


  public Dictionary() {
    mWordList = new ArrayList<Word>();
  }

  public ArrayList<Word> getWordList() {
    return mWordList;
  }

  public Word getFirstWord() {
    return mWordList.get(0);
  }

  public void add(Word newWord) {
    mWordList.add(newWord);
  }


  // public static ArrayList<Word> all() {
  //   return mWordList;
  // }

}
