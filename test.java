import java.util.Scanner;
public class test {
    final int SETPASS = 7869;
    int password;
    int counter = 0;
    String answer;
    int newcounter =0;
    Scanner scanner = new Scanner(System.in);

    public void getpassword() {

        System.out.println("what is your password?: ");
        password = scanner.nextInt();

        while (password != SETPASS && counter < 2) {
            System.out.println("Your password is incorrect, please try again: ");
            password = scanner.nextInt();
            counter++;
        }

        if (password != SETPASS || counter == 3) {
            System.out.println("You are out of tries, would you like to try again? ");
            answer = scanner.next();
            if (answer == "yes") {
                System.out.println("what is your password?: ");
                password = scanner.nextInt();
                     while (password != SETPASS && newcounter < 2) {
                     System.out.println("Your password is incorrect, please try again: ");
                     password = scanner.nextInt();
                     newcounter++;
                    }
            }
            else if (password == SETPASS && newcounter <= 3) {
                System.out.println("Welcome");

            }
            else if (answer == "no") {
                System.out.println("goodbye");
            }
        }

        if (password == SETPASS && newcounter <= 3) {
                System.out.println("Welcome");
            }
    }


    public static void main(String[] args) {
        test obj = new test();
        obj.getpassword();
    }
}

