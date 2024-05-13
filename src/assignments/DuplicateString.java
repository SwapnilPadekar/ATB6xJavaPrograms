package assignments;

import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String word = sc.nextLine();

        StringBuilder rem_duplicate = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int dup = 0;
            for (int j = 0; j < rem_duplicate.length(); j++) {
                if (word.charAt(i) == rem_duplicate.charAt(j) || word.charAt(i) == ' ') {
                    dup = 1;
                    break;
                }
            }
            if (dup != 1) {
                rem_duplicate.append(word.charAt(i));
            }
        }
        System.out.println(rem_duplicate);
    }
}