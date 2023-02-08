import java.util.Scanner;

public class DAYinMONTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your want a month: ");
        int month = sc.nextInt();

        switch (month){
            case 2:
                System.out.println( " the month "+ month + " has 28days or 29days");
                break;
            case 1 :
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" the month " + month + " has 31days");
                break;
            case 4:
            case 6:
            case 11:
                System.out.println(" the month " + month + " has 30days");
                break;
            default:
                System.out.println("no data");
        }
    }
}
