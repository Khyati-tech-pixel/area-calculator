// calculate area of circle , rectangle,square.

import java.util.Scanner;
public class basics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println("the area of circle is "+ area);
        System.out.println("Enter the length and breadth of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area1 = l * b;
        System.out.println("the area of rectangle is "+ area1);
        System.out.println("Enter the side of square");
        int s = sc.nextInt();
        System.out.println("the area of square is "+ s * s);
        sc.close();
        System.out.println("thank you");

    }
}
