import java.util.Scanner;

public class First {
    public static void main(String[]args) {
        System.out.println("hello world");

        int age;
        System.out.println("enter age");
        Scanner x;
        x = new Scanner(System.in);
        age = x.nextInt();
        if (age > 20) {
            System.out.println("you are older than 20");
        } else {
            System.out.println("you are younger  than 20");
        }
        int dayNumber;
        System.out.println("enter day number");
        Scanner y;
        y = new Scanner(System.in);
        dayNumber = y.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
                case 4:System.out.println("thursday");
                break;
            case 5:System.out.println("friday");
                break;
                case 6:System.out.println("saturday");
                break;

                case 7:System.out.println("sunday");
            default:
                System.out.println("invalid day number");

        }
        int i=0;
 while( i<5){
            System.out.println("*");
            i++;}
    }

    int[] nameArr = new int[10];
System.out.println(nameArr[5]);  // Output: 0 (default value)
System.out.println(nameArr[10]); // Error: ArrayIndexOutOfBoundsException





}