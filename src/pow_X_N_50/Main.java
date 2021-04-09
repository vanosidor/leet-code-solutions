package pow_X_N_50;

import common.In;
import common.StdOut;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");
        String fileName = args[0];

        In in = new In("src/" + Main.class.getPackage().getName() + "/" + fileName);

        double x = in.readDouble();
        int n = in.readInt();

        Solution solution = new Solution();
        StdOut.println("result: " + solution.myPow(x, n));
        StdOut.println("true result " + Math.pow(x, n));
    }
}
