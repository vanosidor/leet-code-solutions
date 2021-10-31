package house_robber_198;

import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Scanner sc = new Scanner(new File("src/" + Main.class.getPackageName() + "/" + fileName));

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        Solution solution = new Solution();
        System.out.print(solution.rob(nums));
    }

}
