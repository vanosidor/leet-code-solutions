package intersection_two_arrays_349;

import common.In;
import common.StdOut;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");
        String fileName = args[0];

        In in = new In(new File("src/" + Main.class.getPackage().getName() + "/" + fileName));

        int n, m;
        int[] nums1, nums2;

        n = in.readInt();
        nums1 = new int[n];

        for (int i = 0; i < n; i++) {
            nums1[i] = in.readInt();
        }

        m = in.readInt();// Integer.parseInt(in.readLine());
        nums2 = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = in.readInt();
        }

        Solution solution = new Solution();

        int[] result = solution.intersection(nums1, nums2);

        for (int i : result) {
            StdOut.println(i);
        }

    }
}
