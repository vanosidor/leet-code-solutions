package remove_element_27;

import common.StdOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/" + Main.class.getPackage().getName() + "/" + args[0]));
        int val = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        Solution solution = new Solution();
        StdOut.print(solution.removeElement(nums, val));
        StdOut.print("\n");
        for (int num : nums) {

            StdOut.print(num+ " ");
        }
    }
}
