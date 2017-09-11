import java.util.Scanner;

public class offline2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float A;
        float B;
        System.out.println("введите первое значение");
        A = in.nextFloat();
        System.out.println("введите второе значение значение");
        B = in.nextFloat();
        System.out.println(A + "+" + B + "=" + (A+B) );

        System.out.println("введите первую сторону прямоугольника");
        float c = in.nextFloat();
        System.out.println("введите вторую сторону прямоугольника");
        float d = in.nextFloat();
        System.out.println("площадь прямоугольника = " + (d*c));

        System.out.println("введите 1 сторону треугольника" );
        float e = in.nextFloat();
        System.out.println("введите 2 сторону треугольника" );
        float f = in.nextFloat();
        System.out.println("введите 3 сторону треугольника" );
        float g = in.nextFloat();
        float p = (e + f + g)/2;
        float s = (float)Math.sqrt(p*(p-e)*(p-f)*(p-g));
        System.out.println("плоадь треугольника = " + s );






    }

}
