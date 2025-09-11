package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsInString {

    static String sortVowels(String s) {
        List<Character> vowelsList = new ArrayList<>();
        String vowels = "AEIOUaeiou";

        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1)
                vowelsList.add(c);
        }
        Collections.sort(vowelsList);

        StringBuilder res = new StringBuilder();
        int vIdx = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1)
                res.append(vowelsList.get(vIdx++));
            else
                res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {

        String s = "lEetcOde";
        System.out.println(sortVowels(s));

    }
}
