package merge_sorted_array_88;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args == null || args.length == 0) throw new IllegalArgumentException("File name is null");
        String fileName = args[0];

//        BufferedReader reader = new BufferedReader(new FileReader("src/" + Main.class.getPackage().getName() + "/" + fileName));
        Scanner sc = new Scanner(new FileReader("src/" + Main.class.getPackage().getName() + "/" + fileName));

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

//        String nums1String = reader.readLine().trim().replaceAll("\\s+",  "");
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sc.nextInt();
//            else if (i < m + n) nums2[i - m] = sc.nextInt();
        }

        for (int i = 0; i < n; i ++ ) {
            nums2[i] = sc.nextInt();
        }

//        String nums2String = reader.readLine().trim().replaceAll("\\s+",  "");
//        for (int i = 0; i < n; i++) {
//            sc.nextInt();
////            nums2[i] = Integer.parseInt(String.valueOf(nums2String.charAt(i)));
//        }

        sc.close();

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
    }
}
