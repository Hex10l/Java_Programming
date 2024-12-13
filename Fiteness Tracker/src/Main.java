import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(getName());
        System.out.println(dailySteps());
        System.out.println(distanceWalked());
    }
            //Method that receives the first & last name of the user and stores the full name.
            static String getName(){
                System.out.println("Please enter your first name: ");
                Scanner firstName = new Scanner(System.in);
                String firstName_str = firstName.nextLine();
                System.out.println("Please enter your last name: ");
                Scanner lastName = new Scanner(System.in);
                String lastName_str = lastName.nextLine();
                String fullName = firstName_str + " " + lastName_str;
                return fullName;
            }
            //Method that receives the users total number of steps
            static int dailySteps(){
                System.out.println("Please enter the number of steps taken today: ");
                Scanner NumberOfSteps = new Scanner(System.in);
                int NumberOfSteps_int = NumberOfSteps.nextInt();
                return NumberOfSteps_int;
            }
            //Method that receives the users total distance walked.
            static double distanceWalked(){
                double distanceWalked_double =
                return distanceWalked_double;
            }
            static double caloriesBurned(){
                System.out.println("");
            }
        }


