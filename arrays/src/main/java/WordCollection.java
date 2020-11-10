import java.util.Arrays;

public class WordCollection {
    private String[] words;

    public WordCollection() {
        this.words = new String[5];
    }


    public int getWordCount() {
//        System.out.println(Arrays.toString(this.words));
        return this.words.length;
    }

    public void add(String word) {
        this.words[0] = word;
    }
}
