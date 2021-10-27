package valid_parentheses_20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("src/"
                + Main.class.getPackage().getName() + "/" + args[0]));

        String input = r.readLine();
        r.close();

        Solution solution = new Solution();
        System.out.println(solution.isValid(input));
    }
}
