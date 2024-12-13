import java.util.Arrays;
import java.util.Scanner;

public class MaxSubsetSum {

    static int arrayLength = 0;
    static String userInput = "";

    public static void main(String[] args) {

        setArrayLength(getArrayLength());
        setArrayInput(getArrayInput());

        int[] userArray = new int[arrayLength];
        String[] arrayString = userInput.split(",");
        /** Convert arrayString[i] into an Integer and store it in the equivalent position inside userArray */
        for (int i = 0; i < userArray.length; i++){
            userArray[i] = Integer.parseInt(arrayString[i]);
        }

        System.out.println("Original Array: " + Arrays.toString(userArray));

        /** Begin creating Subset Array */
        Result result = findMaxSubsetSum(userArray);

        System.out.println("Maximum Subset Sum: " + result.sum);
        System.out.print("Subarray: [");

        for (int i = result.startIndex; i <= result.endIndex; i++) {
            System.out.print(userArray[i] + (i < result.endIndex ? ", " : ""));
        }

        System.out.println("]");
        System.out.println("Subarray start/end in main array: Start = userArray[" + result.startIndex + "], End = userArray[" + result.endIndex + "]");
    }

    /** arrayLength Getter/Setter | Author: Adrian Gilbert */
    public static int getArrayLength(){
        /** Ask the user how long they would like the array to be and store the answer as arrayLength */
        System.out.print("Please enter the length of the array you would like to create: ");
        Scanner array_lengthInput = new Scanner(System.in);

        return array_lengthInput.nextInt();
    }
    public static void setArrayLength(int a){
        arrayLength = a;

    }
    /** arrayInput Getter/Setter */
    public static String getArrayInput(){
        System.out.print("Please enter the values to be stored in the array: ");
        Scanner valueInput = new Scanner(System.in);
        String value = valueInput.nextLine();
        String[] values = value.split(",");
        while (values.length != arrayLength){
            System.out.print("Invalid input please try again: ");
            valueInput = new Scanner(System.in);
            value = valueInput.nextLine();
            values = value.split(",");
        }

        return value;
    }
    public static void setArrayInput(String a){
        userInput = a;
    }
    /** Find/Create Subset Array */
    public static Result findMaxSubsetSum(int[] a){
        /** findMaxSubsetSum input needs to be userArray in main */
        int currentSum = 0;
        int maxSum = 0;
        int startingNum = 0;
        int endingNum = 0;
        int tempStart = 0;

        Result result = new Result();

        for (int i = 0; i < a.length; i++){
            if (currentSum <= 0){
                currentSum = a[i];
                tempStart = i;
            }else{
                currentSum += a[i];
            }
            if (currentSum > maxSum){
                maxSum = currentSum;
                startingNum = tempStart;
                endingNum = i;
            }
        }
        /** Assign local variable values to result object variables */
        result.startIndex = startingNum;
        result.endIndex = endingNum;
        result.sum = maxSum;

        return result;
    }
    /** Methods/classes that don't require sorting */
    static class Result {
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
    }
}
