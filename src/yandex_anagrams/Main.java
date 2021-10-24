package yandex_anagrams;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String A = r.readLine();
        String B = r.readLine();

        int[] alphabet = new int[26];

        for (int i = 0; i < A.length(); i++) {
            alphabet[A.charAt(i) - 'a']++;
        }

        for (int i = 0; i < B.length(); i++) {
            alphabet[B.charAt(i) - 'a']--;
        }

        for (int count : alphabet) {
            if (count != 0) {
                System.out.print("0");
                return;
            }
        }

        System.out.print("1");
    }
}