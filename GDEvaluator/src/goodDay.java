import java.util.Scanner;
public class goodDay {
    /**-------------------------------//
    //      Initialize Variables      //
    //--------------------------------*/
    protected static int temperature = 0;
    protected static double humidity = 0;
    protected static boolean isHomeworkDone = false;
    protected static String dinnerMeal = "";
    /**--------------------------------/
    // Methods Required by Instructor //
    //--------------------------------*/
    public static boolean isTodayGood() {
        /**If the user ate nothing OR didn't complete their homework, they had a "bad day"*/
        if (dinnerMeal.isEmpty() || isHomeworkDone == false){
             return false;
        }else{
            return true;
        }
    };
    public static String todayStatus(boolean e){
        String typeOfDay = "";
        switch(e){
            case false:
                typeOfDay = "Today hasn't been a good day, keep working hard!";
                break;
            case true:
                typeOfDay = "Today has been a good day, take a good rest!";
        };
        return typeOfDay;
    };
    public static boolean isWeatherGood() {
        if ((temperature >= 60 && temperature <= 80) && (humidity >= 30 && humidity <= 50)){
            return true;
        }else{
            return false;
        }
    };
    public static String weatherStatus(boolean f){
        String typeOfWeather = "";
        switch(f){
            case false:
                typeOfWeather = "Today's weathers isn't looking so great, prepare for a bit of discomfort.";
                break;
            case true:
                typeOfWeather = "Today's weather is looking wonderful, please dress comfortably!";

        };
        return typeOfWeather;
    };
    /**-------------------------------//
    //    Methods I Felt Necessary    //
    //--------------------------------*/
    public static int getTemp() {
        System.out.print("Please enter the current temperature: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    };
    public static double getHumidity() {
        System.out.print("Please enter the current humidity: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextDouble();
    };
    public static int setTemp(int a){
        temperature = a;
        return temperature;
    };
    public static double setHumidity(double b){
        humidity = b;
        return humidity;
    };
    public static boolean homeworkCheck() {
        /**Check if homework is completed*/
        boolean complete = false;
        System.out.println("Have you completed today's homework?");
        System.out.print("Please enter Y (Yes) or N (No): ");
        Scanner yesOrNo_Input = new Scanner(System.in);
        String y_Or_N = yesOrNo_Input.nextLine();
        /**While @y_Or_N isn't Y,y,N, or n, re-acquire userInput*/
        while (!(y_Or_N.equals("Y") || y_Or_N.equals("y")) && (!(y_Or_N.equals("N") || y_Or_N.equals("n")))) {
            System.out.println("Invalid response, Please enter Y (Yes) or N (No): ");
            Scanner userInput = new Scanner(System.in);
            y_Or_N = userInput.nextLine();
        };
            switch(y_Or_N){
                case "Y":
                    complete = true;
                    break;
                case "y":
                    complete = true;
                    break;
                case "N":
                    complete = false;
                    break;
                case "n":
                    complete = false;
            };
        return complete;
    }
    public static boolean setHomeworkStatus(boolean c){
        isHomeworkDone = c;
        return isHomeworkDone;
    };
    public static String getDinnerMeal(){
        System.out.print("Please enter what you plan on eating for your meal today: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    };
    public static String setDinnerMeal(String d){
        dinnerMeal = d;
        return dinnerMeal;
    };
}