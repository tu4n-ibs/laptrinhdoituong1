import java.util.Scanner;

public class SOtochu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int number = sc.nextInt();

        switch (number) {
            case 0 :
                System.out.println("zero"); ;
            break;
            case 1:
                System.out.println("one");
            break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("night");
                break;
            case 10:
                System.out.println("teen");
                break;
        }
        switch (number) {
            case 11:
                System.out.println("eleven");
                break;
            case 12:
                System.out.println("twolve");
            case 13:
                System.out.println("thirteen");
                break;
            case 14:
                System.out.println("fourteen");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            case 16:
                System.out.println("sixteen");
                break;
            case 17:
                System.out.println("seventeen");
                break;
            case 18:
                System.out.println("eightteen");
                break;
            case 19:
                System.out.println("nightteen");
                break;
            case 20:
                System.out.println("twenty");
                break;
        }

    }
}
