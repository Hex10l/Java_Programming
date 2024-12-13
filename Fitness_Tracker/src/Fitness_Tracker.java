import java.util.Scanner;
public class Fitness_Tracker {
    //Set Constants
    public static double kilometersPerStep = .000762;
    public static double caloriesPerStep = .04;
    //Properties
    protected static String name = "";
    protected static int dailySteps = 0;
    protected static double distanceWalked = 0;
    protected static double caloriesBurned = 0;
    protected static int heartRate = 0;
    protected static double goalNum = 0;
    //Getters
    public static String getName(){
        System.out.println("Please enter your name: ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        return name;
    }
    public static int getDailySteps(){
        System.out.println("Please enter the number of steps taken today: ");
        Scanner stepsInput = new Scanner(System.in);
        int steps = stepsInput.nextInt();
        return steps;
    }
    public static int getHeartRate(){
        System.out.println("How many times can you feel your wrist or neck pulse in 15 seconds?: ");
        Scanner heartRateInput = new Scanner(System.in);
        return heartRateInput.nextInt();
    }

    //Setters
    public static void setName(String name){
        name = getName();
    }
    public static void setDailySteps(int initialSteps){
        dailySteps = dailySteps + getDailySteps();
    }
    public static void setHeartRate(int heartRateUncalculated){
        heartRateUncalculated = getHeartRate();
        heartRate += (heartRateUncalculated * 4);
    }

    //Methods
    public static int addSteps(int steps){
        System.out.println("Please enter the number of steps you would like to add to your total step count: ");
        Scanner addStepsInput = new Scanner(System.in);
        steps = addStepsInput.nextInt();
        dailySteps = dailySteps + steps;
        return steps;
    }
    public static double calculateDistance(){
        double distance = (dailySteps * kilometersPerStep);
        distanceWalked = distanceWalked + distance;
        return distance;
    }
    public static double calculateCalories(){
        double calories = (dailySteps * caloriesPerStep);
        caloriesBurned = caloriesBurned + calories;
        return calories;
    }
    public int updateHeartRate(int newHeartRate){
        newHeartRate = getHeartRate();
        heartRate = newHeartRate;
        return newHeartRate;
    }
    public static void resetDailyStats(){
        dailySteps = 0;
        distanceWalked = 0.0;
        caloriesBurned = 0.0;
        heartRate = 0;
    }
    public static int setGoalSteps(int goalSteps){
        System.out.println("Please enter the number of steps you'd like to take today: ");
        Scanner goalStepInput = new Scanner(System.in);
        goalSteps = goalStepInput.nextInt();
        return goalSteps;
    }
    public static String checkGoal(){
        String congMessage = "";;
        int remaining = (dailySteps - setGoalSteps(0));
        if (remaining >= 0){
            congMessage = "You have met you step goal for today, Congratulations!";
        }else {
            congMessage = "You have not met your daily step goal, Keep on going!";
        }
        return congMessage;
    }
    public static String proceed(){
        String proceed = "";
        Scanner proceedInput = new Scanner(System.in);
        proceed = proceedInput.nextLine();
        return proceed;
    }
}
