package LowLevelDesignProblems.LibraryManagementSystem;

import java.util.Scanner;

public class LibraryMember extends Account {
    void checkoutBook() {}
    void returnBook() {}
    double checkFine() { return 0.0; }
    boolean payFine() { return false; }
    @Override
    void resetPwd() {}
    void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the correct Option." +
                "\n\t 1. Checkout Book " +
                "\n\t 2. Return Book " +
                "\n\t 3. Reset Pwd ");

        while (true) {
            int inp = sc.nextInt();
            if (inp == 1) {
                this.checkoutBook();
                break;
            } else if (inp == 2) {
                double fine = this.checkFine();
                if (fine >= 0.0) {
                    boolean paid = this.payFine();
                    if (paid) {
                        this.returnBook();
                    } else {
                        System.out.println("Unable to Pay the fine");
                    }
                } else {
                    System.out.println("No Fine Found");
                    this.returnBook();
                }
                break;
            } else if (inp == 3) {
                this.resetPwd();
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
