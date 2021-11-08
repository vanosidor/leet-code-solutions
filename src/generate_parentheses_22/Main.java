package generate_parentheses_22;

import common.StdIn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/" + Main.class.getPackage().getName() + "/" + args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int n = Integer.parseInt(reader.readLine());
        Solution solution = new Solution();
        List<String> res = solution.generateParenthesis(n);
        res.forEach(result -> System.out.print(result + " "));
    }
}