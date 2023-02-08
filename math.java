import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c ;
        System.out.println("a: ");
        a = sc.nextDouble();
        System.out.println("b: ");
        b = sc.nextDouble();
        System.out.println("c: ");
        c = sc.nextDouble();
         if (a!=0){
             double king = (c-b)/a;
             System.out.println("equation pass with x = " + king);
         }else if (b==0) {
             System.out.println("the solution is all x!");
         }else {
             System.out.println("no data");
         }
    }
}
