import java.util.ArrayList;

public class Dictionary {
  private ArrayList<Word> mWordList;


  public Dictionary() {
    mWordList = new ArrayList<Word>();
  }

//setter

  public void add(Word newWord) {
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


  // public static ArrayList<Word> all() {
  //   return mWordList;
  // }

}
