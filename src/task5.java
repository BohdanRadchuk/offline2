import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите первое число");
        int a = in.nextInt();
        System.out.println("введите второе число");
        int b = in.nextInt();
        System.out.println("введите третье число");
        int c = in.nextInt();

        boolean z=a>b&a>c;
        System.out.println("является ли A наибольшим числом (true / false)" + z);
        boolean x = b>a & b>c;
        System.out.println("является ли B наибольшим числом (true / false)" + x);
        boolean v= c>a & c>b;
        System.out.println("является ли C наибольшим числом (true / false)" + v);
        boolean n= a<b & a<c;
        System.out.println("является ли A наименьшим числом (true / false)" + n);
        boolean m = b<a & b<c;
        System.out.println("является ли B наименьшим числом (true / false)" + m);
        boolean s= c<a & c<b;
        System.out.println("является ли C наименьшим числом (true / false)" + s);

        boolean d = (a>b & a<c) || (a<b & a>c);
        System.out.println("является ли A промежуточным числом между B и C (true / false)" + d );

        boolean f = (b>a & b<c) || (b<a & b>c);
        System.out.println("является ли B промежуточным числом между A и C (true / false)" + f );
        boolean g = (c>a & c<b) || (c<a & c>b);
        System.out.println("является ли C промежуточным числом между A и B (true / false) " + g);


        boolean h = (a==b) || (a==c);

        System.out.println("равняется ли A хотя бы одному из других чисел " + h);
        boolean j = (b==a) || (b==c);
        System.out.println("равняется ли B хотя бы одному из других чисел " + j);
        boolean k = (c==a) || (c==b);
        System.out.println("равняется ли C хотя бы одному из других чисел " + k);

        boolean l = (a>b) || (a>c);
        System.out.println("A больше хотя бы одного из других чисел " + l);
        boolean q = (b>a) || (b>c);
        System.out.println("B больше хотя бы одного из других чисел " + q);
        boolean w = (c>a) || (c>b);
        System.out.println("C больше хотя бы одного из других чисел " + w);

    }
}