import java.io.*;
import java.util.*;

class Solution {
   

    public static int octalToDecimal(int n) {
        int num = n;
        int dec_value = 0;

        // Initializing base value to 1, i.e 8^0
        int base = 1;

        int temp = num;
        while (temp != 0) {
            // Extracting last digit
            int last_digit = temp % 10;
            temp /= 10;

            // Multiplying last digit with appropriate base value and adding it to dec_value
            dec_value += last_digit * base;

            base *= 8;
        }
        return dec_value;
    }

    public static String convert(int N) {
        int n = octalToDecimal(N);
        char[] hexaDeciNum = new char[100];

        int i = 0;
        while (n != 0) {
            int temp = 0;

            temp = n % 16;

            if (temp < 10) {
                hexaDeciNum[i] = (char) (temp + 48);
                i++;
            } else {
                hexaDeciNum[i] = (char) (temp + 55);
                i++;
            }
            n /= 16;
        }

        String ans = "";

        for (int j = i - 1; j >= 0; j--) {
            ans += hexaDeciNum[j];
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        
        Solution solution = new Solution();
        String result = solution.convert(n);
        System.out.println(result);
    }
}
