package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class anagram {

    public static void main(String[] args) {
        String name = "Harsh";
        List<Character> mylist = new ArrayList<>();
        for (char c : name.toCharArray()) {
            mylist.add(c);
        }
        System.out.println(mylist);
    }
}