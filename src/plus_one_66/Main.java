package plus_one_66;

import common.In;
import common.StdIn;
import common.StdOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/" + Main.class.getPackage().getName() + "/" + args[0]));
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        Solution solution = new Solution();
        int[] res = solution.plusOne(nums);

        for (int num : res) {
            StdOut.print(num + " ");
        }


    }
}
