import java.util.Scanner;
public class Square07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter value N = ");
        int N = sc.nextInt();

        for (int iOuter=1; iOuter<=N; iOuter++) {
            for (int i=1; i<=N; i++){
                System.out.print("*");
            }
        }

    }
}
