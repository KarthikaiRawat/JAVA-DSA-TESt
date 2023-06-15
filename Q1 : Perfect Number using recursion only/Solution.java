import java.io.*;
import java.util.*;

class Solution {

 public ArrayList<Integer> perfect(int n) {
        // your solutions goes here..
         ArrayList<Integer> summ=new ArrayList<>();
        int i,x;
        for(i=2;i<=n;i++)
        {
           x= perfectt(i);
           if(x!=0)
             summ.add(x);

        }
       return summ;
    }

    public int perfectt(int x) {
        // your solutions goes here..
        int i,sum=0;
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            sum=sum+i;
        }
        if(sum==x){
       return sum;}

       else{
           return 0;
       }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.perfect(n);

        System.out.println(result);
    }
}
