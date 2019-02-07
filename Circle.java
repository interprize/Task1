import java.util.Scanner;
public class Circle {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Write radius: " );
        int R = in.nextInt();
        System.out.println("Square: ");
        System.out.println(Math.PI * Math.pow(R, 2));
        System.out.println("Length: ");
        System.out.print(2*Math.PI * R);

    }
}
