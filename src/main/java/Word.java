import java.util.ArrayList;

public class Word {
  private String mWord;
  private static ArrayList<Word> wordList = new ArrayList<Word>();

  public Word(String word) {
    mWord = word;
    wordList.add(this);
  }

  public String getWord() {
    return mWord;
  }

  public static ArrayList<Word> all() {
    return wordList;
  }

}
