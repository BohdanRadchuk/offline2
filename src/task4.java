import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите первое число");
        int a = in.nextInt();
        System.out.println("введите второе число");
        int b = in.nextInt();
        boolean c = a == b;
        System.out.println("равны между собой? " + c);
        boolean d = a%b == 0;
        System.out.println("деление без остатка ? " + d ) ;
        boolean g = a>b;
        System.out.println("A>B = "+ g);
    }
}
