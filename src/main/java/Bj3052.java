import java.util.Scanner;

public class Bj3052 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int a = 0;
        int count = 0;

        for ( int i = 0; i < 10; i++ ) {
            arr[i] = scanner.nextInt() % 42;
        }

        for ( int i = 0; i < 10; i++ ) {
            a = 0;
            for ( int k = i+1; k < 10; k++ ) {
                if ( arr[i] == arr[k] ) {
                    a ++;
                }
            }
            if ( a == 0 ) {
                count ++;
            }
        }

        System.out.println(count);

    }
}