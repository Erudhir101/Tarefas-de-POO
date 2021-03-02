import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // faz o mesmo que o scanf();
        double A, B, C, R1, R2, delta;
        System.out.print("Ler variavel \'A\': ");
        A = scan.nextDouble();
        System.out.print("Ler variavel \'B\': ");
        B = scan.nextDouble();
        System.out.print("Ler variavel \'C\': ");
        C = scan.nextDouble();
        delta = (B * B) - (4 * A * C);
        R1 = (double)(-B + Math.sqrt(delta))/(2*A);
        R2 = (double)(-B - Math.sqrt(delta))/(2*A);
        if(A == 0 || delta < 0) {
            System.out.print("Impossivel calcular\n");
            } else {
            System.out.print("R1 = "+ R1 +"\n");
            System.out.print("R2 = "+ R2 +"\n");
        }
    }
}
