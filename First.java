import java.util.Scanner;

public class First {
    public static void main(String[]args) {
        System.out.println("hello world");

        int age ;
        System.out.println("enter age");
        Scanner x;
        x= new Scanner(System.in);
        age =x.nextInt();
        if(age>20){
            System.out.println("you are older than 20");
        }
        else {
            System.out.println("you are younger  than 20");
        }

        }


}
