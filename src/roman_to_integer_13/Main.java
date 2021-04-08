package roman_to_integer_13;

import common.In;
import common.StdOut;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");

        String fileName = args[0];

        In in = new In("src/" + Main.class.getPackage().getName() + "/" + fileName);

        String roman = in.readLine();

        Solution solution = new Solution();
        StdOut.println(solution.romanToInt(roman));
    }
}
