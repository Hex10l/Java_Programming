import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = Fitness_Tracker.getName();
        //Call getDailySteps() method
        String continueProgram = "";
        boolean run = true;
        while (run) {
            Fitness_Tracker.resetDailyStats();
            Fitness_Tracker.setDailySteps(Fitness_Tracker.dailySteps);
            Fitness_Tracker.setHeartRate(Fitness_Tracker.heartRate);
            String stepGoal = Fitness_Tracker.checkGoal();
            System.out.println("Hello " + name + ", welcome to your fitness tracker statistics!");
            System.out.println("You have taken: " + Fitness_Tracker.dailySteps + " steps today!");
            System.out.println("You have walked: " + Fitness_Tracker.calculateDistance() + " kilometers!");
            System.out.println("You have burned: " + Fitness_Tracker.calculateCalories() + " kcal's!");
            System.out.println("Your current heart rate is: " + Fitness_Tracker.heartRate + " bpm");
            System.out.println(stepGoal);

            System.out.println("Would you like to add steps to your total?: ");
            if (Fitness_Tracker.proceed().equals("Y") || Fitness_Tracker.proceed().equals("y")) {
                int additionalSteps = Fitness_Tracker.addSteps(0);
                //recalculate statistics
                System.out.println("These are " + name + "'s new statistics'");
                System.out.println("You have taken: " + Fitness_Tracker.dailySteps + " steps today!");
                System.out.println("You have walked: " + Fitness_Tracker.calculateDistance() + " kilometers!");
                System.out.println("You have burned: " + Fitness_Tracker.calculateCalories() + " kcal's!");
                System.out.println("Your current heart rate is: " + Fitness_Tracker.heartRate + " bpm");
                //Always returns first value (Struggling to fix)
                System.out.println(stepGoal);
                run = false;
            }else{
                System.out.println("Ending Program...");
                run = false;
            }


        }
    }
}