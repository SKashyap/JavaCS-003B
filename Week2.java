import java.util.Scanner;
@SuppressWarnings("resource")

class Week2 {
    // Write a program to calculate the area of a regular pentagon given the length of its side.
    // Explore I/O commands in Java
    public static void main1(String[] args) {
        int side = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the pentagon: ");
        side = sc.nextInt();
        double area = Math.sqrt(5 *(5 + 2 * Math.sqrt(5))) * side * side / 4;
        System.out.println("Area of the pentagon is : " + area);
        System.out.println("End of Program");
    }

    // Please write a program that asks the base and height of a right triangle and prints the length of the diagonal 
    // LEsson : Explore Math Expressions in Java
    public static void main(String[] args) {
        double base = 0;
        double height = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        height = sc.nextDouble();
        
        double hypotenuse = Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
        
        System.out.println("Length of the hypotenuse is : " + hypotenuse);
        System.out.println("End of Program");
    }
}