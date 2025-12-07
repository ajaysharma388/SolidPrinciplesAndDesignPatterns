package LowLevelDesignProblems.LibraryManagementSystem;

import java.lang.reflect.Member;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the correct Option.\n\t 1. Librarian \n\t 2. Member ");
        Account ac_operator;
        while (true) {
            int inp = sc.nextInt();
            if (inp == 1) {
                ac_operator = new Librarian();
                break;
            } else if (inp == 2) {
                ac_operator = new LibraryMember();
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
        RunOperations ro = new RunOperations(ac_operator);
    }
}
