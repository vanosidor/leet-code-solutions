package first_unique_character_387;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        reader.close();

        Solution solution = new Solution();
        int result = solution.firstUniqueChar(s);
        System.out.println(result);
    }
}
