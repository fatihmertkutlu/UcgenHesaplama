import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1.kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("Üçgenin 2.kenarını giriniz: ");
        b = input.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Üçgeninizin hipotenüs uzunluğu = "+c);

    }
}