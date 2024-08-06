import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int number;
    Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        number = inp.nextInt();

        for(int i=number;i>=1;i--){
            for(int j = 1;j<=(2*i)-1;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}