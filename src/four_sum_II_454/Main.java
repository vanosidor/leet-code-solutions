package four_sum_II_454;


import common.In;
import common.StdOut;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");
        String fileName = args[0];

        In in = new In(new File("src/" + Main.class.getPackage().getName() + "/" + fileName));

        int n = Integer.parseInt(in.readLine());


        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] D = new int[n];

        for (int i = 0; i < n; i++) {

            A[i] = in.readInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = in.readInt();
        }

        for (int i = 0; i < n; i++) {
            C[i] = in.readInt();
        }

        for (int i = 0; i < n; i++) {
            D[i] = in.readInt();
        }

        Solution solution = new Solution();
        StdOut.print(solution.fourSumCount(A, B, C, D));
    }
}
