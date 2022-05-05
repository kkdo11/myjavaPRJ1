import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int n=in.nextInt();

         int aa[]=new int[n];

         for (int i=0; i<n; i++)
             aa[i]=in.nextInt();

        Arrays.sort(aa);
        System.out.println(aa[0]+" "+aa[n-1]);
    }
}
