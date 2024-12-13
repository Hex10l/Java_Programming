import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class Main {

    static String formattedInput = "";
    static char[] userInputAsArray = formattedInput.toCharArray();
    static double totalValue = 0;
    static double decimalValue = 0;
    static String hexadecimalValue = "";
    static String octalValue = "";

    public static void main(String[] args) {

        setUserInput(getUserInput());
        checkUserInput();
        System.out.println("Input: " + formattedInput);
        inputToArray();
        inputArray(reverseArray(userInputAsArray));

        setDecimalValue(Binarytodecimal());
        decimalToHexadecimal();
        setOctalValue(decimalToOctal());

        System.out.println("Decimal value: " + decimalValue);
        System.out.println("Hexadecimal value: " + hexadecimalValue);
        System.out.println("Octal value: " + octalValue);
    };
    /** Acquire/Validate userInput for Array */
    public static String getUserInput() {
        System.out.print("Please input a string of 1-16 0's & 1's: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    };
    public static void setUserInput(String a){
        formattedInput = a;
    };
    public static boolean checkUserInput(){
        //Ensure formattedInput.length is atleast 1 but no greater than 16
        while (formattedInput.length() > 16 || formattedInput.isEmpty()){
            System.out.println("Invalid input, re-executing program.");
            setUserInput(getUserInput());
        }
        System.out.println("Valid Input, continuing program.");
        return true;
    };
    /** Create/Modify Values */
    public static void inputToArray(){
        userInputAsArray = formattedInput.toCharArray();
    }
    public static char[] reverseArray(char[] userInputArray){
        /** reverserArray should contain userInputAsArray | reverseArray(userInputAsArray) */
        int arrayStart = 0;
        int arrayEnd = userInputArray.length - 1;
        while (arrayStart <= arrayEnd){
            /** Simple swap | tempSwap = array[0], array[0] = array[1], array[1] = tempSwap */
            char tempSwap = userInputArray[arrayStart];
            userInputArray[arrayStart] = userInputArray[arrayEnd];
            userInputArray[arrayEnd] = tempSwap;
            arrayStart++;
            arrayEnd--;
        }

        return userInputArray;
    }
    private static void inputArray(char[] array){
        userInputAsArray = array;
    }
    /** Generate decimal Value based on Binary Value */
    public static double Binarytodecimal(){
        double tempDecimalValue = 0;
        for (int i = 0; i <= userInputAsArray.length - 1; i++){
            double x = Math.pow(2, i);
            double placeValue = 0;
            placeValue += x;
            if (userInputAsArray[i] == '0'){
                x = 0;
            }
            tempDecimalValue += x;
            System.out.println(userInputAsArray[i] + " is in the " + placeValue + " place.");
        };
        return tempDecimalValue;
    };
    private static void setDecimalValue(double value){
        decimalValue = value;
    };
    /** Generate hexadecimal value based on decimal value */
    public static char[] decimalToHexadecimal() {
        String tempHex = "";
        int toBDivided = (int) decimalValue;
        int[] remainderArray = new int[4];
        char[] hexArray = new char[4];
        for (int i = 0; toBDivided > 0; i++) {

            int remainder = (toBDivided % 16);
            toBDivided = (toBDivided / 16);
            remainderArray[i] = remainder;
            /** Create hexArray */
            switch (remainder){
                case 0:
                    hexArray[i] = '0';
                    break;
                case 1:
                    hexArray[i] = '1';
                    break;
                case 2:
                    hexArray[i] = '2';
                    break;
                case 3:
                    hexArray[i] = '3';
                    break;
                case 4:
                    hexArray[i] = '4';
                    break;
                case 5:
                    hexArray[i] = '5';
                    break;
                case 6:
                    hexArray[i] = '6';
                    break;
                case 7:
                    hexArray[i] = '7';
                    break;
                case 8:
                    hexArray[i] = '8';
                    break;
                case 9:
                    hexArray[i] = '9';
                    break;
                case 10:
                    hexArray[i] = 'A';
                    break;
                case 11:
                    hexArray[i] = 'B';
                    break;
                case 12:
                    hexArray[i] = 'C';
                    break;
                case 13:
                    hexArray[i] = 'D';
                    break;
                case 14:
                    hexArray[i] = 'E';
                    break;
                case 15:
                    hexArray[i] = 'F';
                    break;
            }
            tempHex += hexArray[i];
        }
        tempHex = Arrays.toString(reverseArray(hexArray));
        /** Remove brackets, commas, and spaces */
        tempHex = tempHex.toString().replace("[","");
        tempHex = tempHex.toString().replace("]","");
        tempHex = tempHex.toString().replace(",","");
        tempHex = tempHex.toString().replace(" ","");
        hexadecimalValue = tempHex;
        return hexArray;
    };
    /** Generate octal value based on  */

    public static String decimalToOctal(){
        String tempInt = "";
        int toBDivided = (int) decimalValue;
        int[] remainderArray = new int[6];
        char[] octalArray = new char[6];
        for (int i = 0; toBDivided > 0; i++){
            int remainder = (toBDivided % 8);
            toBDivided =(toBDivided / 8);
            remainderArray[i] = remainder;
            /** Create octalArray */
            switch (remainder){
                case 0:
                    octalArray[i] = '0';
                    break;
                case 1:
                    octalArray[i] = '1';
                    break;
                case 2:
                    octalArray[i] = '2';
                    break;
                case 3:
                    octalArray[i] = '3';
                    break;
                case 4:
                    octalArray[i] = '4';
                    break;
                case 5:
                    octalArray[i] = '5';
                    break;
                case 6:
                    octalArray[i] = '6';
                    break;
                case 7:
                    octalArray[i] = '7';
                    break;
            }
            tempInt += octalArray[i];
        }
        tempInt = Arrays.toString(reverseArray(octalArray));
        /** Remove brackets, commas, and spaces */
        tempInt = tempInt.toString().replace("[","");
        tempInt = tempInt.toString().replace("]","");
        tempInt = tempInt.toString().replace(",","");
        tempInt = tempInt.toString().replace(" ","");
        tempInt = tempInt.toString().replace("", "");
        return tempInt;
    };
    private static void setOctalValue(String value){
        octalValue = value;
    }
};
