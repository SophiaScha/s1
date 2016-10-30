import java.util.Scanner;

/**
 * Created by user on 16/10/30.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Enter first number:");
            String str1 = scanner.nextLine();
            float number = Float.valueOf(str1);

            System.out.println("Enter second number:");
            String str2 = scanner.nextLine();
            float number2 = Float.valueOf(str2);

            if( number == number2) {
                break;
            }

        }
        System.out.println("Finished");

//        if (str1.equals(str2)) {
//           System.out.println("@");
//       }
//      else{
//               System.out.println("&");
//          }
//        }
    }


}
