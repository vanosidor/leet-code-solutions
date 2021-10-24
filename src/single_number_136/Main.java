package single_number_136;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("src/"
                + Main.class.getPackage().getName() + "/" + "input.txt"));
        int n = Integer.parseInt(r.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++ ) {
            nums[i] = Integer.parseInt(r.readLine()) ;
        }

        r.close();

        Solution solution = new Solution();


        System.out.println(solution.singleNumber(nums));
    }
}
