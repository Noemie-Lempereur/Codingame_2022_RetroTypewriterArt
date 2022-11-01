import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String T = in.nextLine();
        String[] array = T.split(" ");
        String answer = "";
        for (String s : array) {
            int size = s.length();
            int iterator = 0;
            int repetition = 0;
            while (iterator < size - 1 && s.charAt(iterator) > 47 && s.charAt(iterator) < 58) {
                repetition = 10 * repetition + s.charAt(iterator) - 48;
                iterator++;
            }
            String valeur = "";
            if (iterator == size - 2) {
                if (s.charAt(size - 1) == 'p') {
                    valeur += ' ';
                }
                if (s.charAt(size - 1) == 'S') {
                    valeur += "\\";
                }
                if (s.charAt(size - 1) == 'Q') {
                    valeur += "'";
                }
                if (s.charAt(size - 1) == 'l') {
                    valeur += "\r\n";
                    System.out.println(answer);
                    answer="";
                }
            } else {
                valeur += s.charAt(size - 1);
            }
            for (int i = 0; i < repetition; i++) {
                answer += valeur;
            }
        }
        System.out.println(answer);
    }
}
