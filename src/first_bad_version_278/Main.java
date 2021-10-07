package first_bad_version_278;

import common.In;
import common.StdOut;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");
        String fileName = args[0];

        In in = new In(new File("src/" + Main.class.getPackage().getName() + "/" + fileName));

        int n = in.readInt();
        int bad = in.readInt();

        Solution solution = new Solution(bad);
        StdOut.print(solution.firstBadVersion(n));
    }
}
