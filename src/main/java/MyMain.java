import java.util.Scanner;

// import sun.awt.www.content.audio.basic;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if ((a < b && b < c) || (c < b && b < a))
            return b;
        else if ((b < c && c < a) || (a < c && c < b))
            return c;
        else
            return a;    
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int d = Math.abs(a);
        int e = Math.abs(b);
        if (d < e)
            return b;
        else    
            return a;    
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double f = Math.pow(a,2)+ Math.pow(b,2);
        double g = Math.sqrt(f);
        return g;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String command = scan.next();

        if (command.equals("median")) { 
            System.out.println("What is the first number?");
            int k = scan.nextInt();
            System.out.println("What is the second numner?");
            int l = scan.nextInt();
            System.out.println("What is the third numner?");
            int m = scan.nextInt();
            System.out.println("The median is " + median (k, l, m)); 
        }
        else if(command.equals("magnitude")){
            System.out.println("What is the first number?");
            int n = scan.nextInt();
            System.out.println("What is the second numner?");
            int o = scan.nextInt();
            System.out.println("The magnitude is " + magnitude(n,o));
        }
        else { 
            System.out.println("What is the first number?");
            int p = scan.nextInt();
            System.out.println("What is the second numner?");
            int q = scan.nextInt();
            System.out.println("The pythagoras is " + pythagoras(p,q));
        }






        
    }
}
