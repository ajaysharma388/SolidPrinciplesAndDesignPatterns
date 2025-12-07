package LowLevelDesignProblems.LibraryManagementSystem;

import java.util.Scanner;

public class Librarian extends Account {
    void blockMember(String member) {
        System.out.println("Blocking Member: " + member);
    }
    void unblockMember(String member) {
        System.out.println("Unblocking Member: " + member);
    }
    void addBook() {}
    void takeBook() {}
    void assignBook() {}
    @Override
    void resetPwd() {}
    void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the correct Option." +
                "\n\t 1. Unblock User " +
                "\n\t 2. Block User " +
                "\n\t 3. Add Book " +
                "\n\t 4. Take Book " +
                "\n\t 5. Assign Book " +
                "\n\t 6. Reset Pwd ");

        while (true) {
            int inp = sc.nextInt();
            if (inp == 1) {
                String memberId = sc.next();
                this.unblockMember(memberId);
                break;
            } else if (inp == 2) {
                String memberId = sc.next();
                this.blockMember(memberId);
                break;
            } else if (inp == 3) {
                this.addBook();
                break;
            }
            else if (inp == 4) {
                this.takeBook();
                break;
            }
            else if (inp == 5) {
                this.assignBook();
                break;
            }
            else if (inp == 6) {
                this.resetPwd();
                break;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
