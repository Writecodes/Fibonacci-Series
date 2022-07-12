/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

//import java.util.Random;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, sum = 0;
        System.out.print("Enter the number that sum of how many even f2n fibonacci numbers you want to calculate=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] fab = new int[2 * num + 1];
        fab[0] = 0;
        fab[1] = 1;
        System.out.print("Sum of numbers at even indexes : ");
        System.out.print(fab[0]);
        for (i = 2; i <= 2 * num; i++) {
            fab[i] = fab[i - 1] + fab[i - 2];
            if (i % 2 == 0) {
                sum += fab[i];
                    System.out.print("+" + fab[i]);
            }
        }
        System.out.println("=" + sum);
    }
}
    //     System.out.println("Press 1 for finding the Fibonacci series upto N.........\nPress 2 For a " +
    //             "given positive integer N,find the sum of of F2 + F4 + F6 +………+ F2n till N number........\nEnter the choice : ");
    //     Scanner sc=new Scanner(System.in);
    //     int choice=sc.nextInt();
    //     switch (choice){
    //         case 1:
    //             FabSeries();
    //         case 2:
    //             SumOfEvenFabNum ();
    //     }
    // }
    // static void FabSeries() {
    //     int i, a = 0, b = 1, sum;
    //     System.out.println("Fibonacci series upto n:");
    //     Scanner sc=new Scanner(System.in);
    //     int num=sc.nextInt();
    //     System.out.println(a + "\n" + b);
    //     for (i = 2; i <= num; i++) {
    //         sum = a + b;
    //         System.out.println(sum + " ");
    //         a = b;
    //         b = sum;
    //     }
    // }
    //     static void SumOfEvenFabNum () {
    //         int i, sum = 0;
    //         System.out.print("Enter the number that sum of how many even f2n fibonacci numbers you want to calculate=");
    //         Scanner sc = new Scanner(System.in);
    //         int num = sc.nextInt();
    //         int[] fab = new int[2 * num + 1];
    //         fab[0] = 0;
    //         fab[1] = 1;
    //         System.out.print("Sum of numbers at even indexes : ");
    //         System.out.print(fab[0]);
    //         for (i = 2; i <= 2 * num; i++) {
    //             fab[i] = fab[i - 1] + fab[i - 2];
    //             if (i % 2 == 0) {
    //                 sum += fab[i];
    //                 System.out.print("+" + fab[i]);
    //             }
    //         }
    //         System.out.println("=" + sum);
    //     }

    // }

