import java.util.Formatter;
import java.util.Scanner;
public class Task_1 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Write a number: ");
        int number = in.nextInt();
        System.out.println(Integer.toBinaryString(number));
        //System.out.println(Integer.toOctalString(number));
        //System.out.println(Integer.toHexString(number));
        Formatter f = new Formatter();
        f.format("Hex: %x, Octal: %o",  number, number);
        System.out.println(f);
        Formatter a = new Formatter();
        a.format("%a", 0.01);
        System.out.println(a);

    }}
