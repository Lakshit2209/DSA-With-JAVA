package basics;

import java.util.Scanner;
public class chardatatype {
    public static void main(String[] args) {
        System.out.print("Enter a character=");
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);


    }
}
