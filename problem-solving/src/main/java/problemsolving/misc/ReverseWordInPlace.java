package problemsolving.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ariko on 11/27/2017.
 */
public class ReverseWordInPlace {

    public void solve(List<char[]> sentence){
        for(char[] word: sentence){
            rev(word);
        }
        for(int i=0;i<sentence.size()/2;i++){
            swap(sentence,i,sentence.size()-1-i);
        }
        sentence.forEach(x-> System.out.println(Arrays.toString(x)));
    }

    public void rev(char[] word) {

        for(int i=0;i<word.length/2;i++){
            swap(word,i,word.length-1-i);
        }
    }

    private void swap(char[] word, int i, int j) {
        char tmp = word[i];
        word[i] = word[j];
        word[j] = tmp;
    }

    private <T> void swap(List<T> word, int i, int j) {
        T tmp = word.get(i);
        word.set(i, word.get(j));
        word.set(j, tmp);
    }

}
