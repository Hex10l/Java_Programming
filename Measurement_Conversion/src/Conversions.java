import java.util.ArrayList;
import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        //Create an arrayList of measurement types
        ArrayList measurementTypes = new ArrayList();
        measurementTypes.add("inches");
        measurementTypes.add("feet");
        measurementTypes.add("cubits");
        measurementTypes.add("steps");
        measurementTypes.add("yards");
        measurementTypes.add("miles");
        //Ask the user what the input unit is
        Scanner inputType = new Scanner(System.in);
        System.out.println("What would you like to convert from?");
        String input = inputType.nextLine();
        //Program ends when run = false;
        boolean run = true;
        while (run == true) {
            if (measurementTypes.contains(input)) {
                Scanner outputType = new Scanner(System.in);
                //Ask the user for the output unit
                System.out.println("What would you like to convert to?:");
                String output = inputType.nextLine();
                if (measurementTypes.contains(output)) {
                    //Ask user for the input length
                    System.out.println("What is the number you would like to convert from " + input + " to " + output);
                    Scanner valueInput = new Scanner(System.in);
                    double valueIn = valueInput.nextDouble();
                    //if input is inches
                    if (input.equals("inches") & output.equals("inches")) {
                        double valueOut = valueIn;
                        System.out.println(valueOut);
                    };
                    if (input.equals("inches") & output.equals("feet")) {
                        double valueOut = (valueIn / 12.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("inches") & output.equals("cubits")) {
                        double valueOut = (valueIn / 18.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("inches") & output.equals("steps")) {
                        double valueOut = (valueIn / 30.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("inches") & output.equals("yards")) {
                        double valueOut = (valueIn / 36.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("inches") & output.equals("miles")) {
                        double valueOut = (valueIn / 63360.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    //if input is feet
                    if (input.equals("feet") & output.equals("inches")) {
                        double valueOut = (valueIn * 12);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("feet") & output.equals("feet")) {
                        double valueOut = valueIn;
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("feet") & output.equals("cubits")) {
                        double valueOut = (valueIn / 1.5);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("feet") & output.equals("steps")) {
                        double valueOut = (valueIn / 2.5);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("feet") & output.equals("yards")) {
                        double valueOut = (valueIn / 3.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("feet") & output.equals("miles")) {
                        double valueOut = (valueIn / 5280.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    //If input is cubits
                    if (input.equals("cubits") & output.equals("inches")) {
                        double valueOut = (valueIn * 18);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("cubits") & output.equals("feet")) {
                        double valueOut = (valueIn * 1.5);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("cubits") & output.equals("cubits")) {
                        double valueOut = valueIn;
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("cubits") & output.equals("steps")) {
                        double valueOut = (valueIn * .6);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("cubits") & output.equals("yards")) {
                        double valueOut = (valueIn / 2);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("cubits") & output.equals("miles")) {
                        double valueOut = (valueIn / 3520.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    //if input is steps
                    if (input.equals("steps") & output.equals("inches")) {
                        double valueOut = (valueIn * 30);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("steps") & output.equals("feet")) {
                        double valueOut = (valueIn * 2.5);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("steps") & output.equals("cubits")) {
                        double valueOut = (valueIn / .6);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("steps") & output.equals("steps")) {
                        double valueOut = valueIn;
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("steps") & output.equals("yards")) {
                        double valueOut = (valueIn / 1.2);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("steps") & output.equals("miles")) {
                        double valueOut = (valueIn / 2112.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    //if input is yards
                    if (input.equals("yards") & output.equals("inches")) {
                        double valueOut = (valueIn * 36);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("yards") & output.equals("feet")) {
                        double valueOut = (valueIn * 3);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("yards") & output.equals("cubits")) {
                        double valueOut = (valueIn / 2);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("yards") & output.equals("steps")) {
                        double valueOut = (valueIn * 1.2);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("yards") & output.equals("yards")) {
                        double valueOut = valueIn;
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("yards") & output.equals("miles")) {
                        double valueOut = (valueIn / 1760.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    //if input is miles
                    if (input.equals("miles") & output.equals("inches")) {
                        double valueOut = (valueIn * 63360.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("miles") & output.equals("feet")) {
                        double valueOut = (valueIn * 5280.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("miles") & output.equals("cubits")) {
                        double valueOut = (valueIn * 3520.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("miles") & output.equals("steps")) {
                        double valueOut = (valueIn * 2112.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("miles") & output.equals("yards")) {
                        double valueOut = (valueIn * 1760.0);
                        System.out.println(valueOut);
                        run = false;
                    };
                    if (input.equals("miles") & output.equals("miles")) {
                        double valueOut = valueIn;
                        System.out.println(valueOut);
                        run = false;
                    };
                    //If output invalid
                    } else {
                        System.out.println("That measurement type is not supported, please enter a supported unit of measurement");
                        outputType = new Scanner(System.in);
                        output = outputType.nextLine();
                        if (measurementTypes.contains(output)) {
                            System.out.println("What is the number you would like to convert from " + input + " to " + output);
                            Scanner valueInput = new Scanner(System.in);
                            double valueIn = valueInput.nextDouble();
                            //if input is inches
                            if (input.equals("inches") & output.equals("inches")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                            };
                            if (input.equals("inches") & output.equals("feet")) {
                                double valueOut = (valueIn / 12.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("inches") & output.equals("cubits")) {
                                double valueOut = (valueIn / 18.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("inches") & output.equals("steps")) {
                                double valueOut = (valueIn / 30.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("inches") & output.equals("yards")) {
                                double valueOut = (valueIn / 36.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("inches") & output.equals("miles")) {
                                double valueOut = (valueIn / 63360.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //if input is feet
                            if (input.equals("feet") & output.equals("inches")) {
                                double valueOut = (valueIn * 12);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("feet")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("cubits")) {
                                double valueOut = (valueIn / 1.5);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("steps")) {
                                double valueOut = (valueIn / 2.5);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("yards")) {
                                double valueOut = (valueIn / 3.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("miles")) {
                                double valueOut = (valueIn / 5280.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //If input is cubits
                            if (input.equals("cubits") & output.equals("inches")) {
                                double valueOut = (valueIn * 18);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("feet")) {
                                double valueOut = (valueIn * 1.5);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("cubits")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("steps")) {
                                double valueOut = (valueIn * .6);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("yards")) {
                                double valueOut = (valueIn / 2);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("miles")) {
                                double valueOut = (valueIn / 3520.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //if input is steps
                            if (input.equals("steps") & output.equals("inches")) {
                                double valueOut = (valueIn * 30);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("feet")) {
                                double valueOut = (valueIn * 2.5);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("cubits")) {
                                double valueOut = (valueIn / .6);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("steps")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("yards")) {
                                double valueOut = (valueIn / 1.2);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("miles")) {
                                double valueOut = (valueIn / 2112.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //if input is yards
                            if (input.equals("yards") & output.equals("inches")) {
                                double valueOut = (valueIn * 36);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("feet")) {
                                double valueOut = (valueIn * 3);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("cubits")) {
                                double valueOut = (valueIn / 2);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("steps")) {
                                double valueOut = (valueIn * 1.2);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("yards")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("miles")) {
                                double valueOut = (valueIn / 1760.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //if input is miles
                            if (input.equals("miles") & output.equals("inches")) {
                                double valueOut = (valueIn * 63360.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("feet")) {
                                double valueOut = (valueIn * 5280.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("cubits")) {
                                double valueOut = (valueIn * 3520.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("steps")) {
                                double valueOut = (valueIn * 2112.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("yards")) {
                                double valueOut = (valueIn * 1760.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("miles")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };

                        } else {
                            System.out.println("Ending Program...");
                            run = false;
                        }
                    }
                    ;
                //If input Invalid
                } else {
                    System.out.println("That measurement type is not supported, please enter a supported unit of measurement.");
                    input = inputType.nextLine();
                    if (measurementTypes.contains(input)) {
                        Scanner outputType = new Scanner(System.in);
                        System.out.println("What would you like to convert to?:");
                        String output = outputType.nextLine();
                        if (measurementTypes.contains(output)){
                            //Ask user for the input length
                            System.out.println("What is the number you would like to convert from " + input + " to " + output);
                            Scanner valueInput = new Scanner(System.in);
                            double valueIn = valueInput.nextDouble();
                            //if input is inches
                            if (input.equals("inches") & output.equals("inches")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                            };
                            if (input.equals("inches") & output.equals("feet")) {
                                double valueOut = (valueIn / 12.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("inches") & output.equals("cubits")) {
                                double valueOut = (valueIn / 18.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("inches") & output.equals("steps")) {
                                double valueOut = (valueIn / 30.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("inches") & output.equals("yards")) {
                                double valueOut = (valueIn / 36.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("inches") & output.equals("miles")) {
                                double valueOut = (valueIn / 63360.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //if input is feet
                            if (input.equals("feet") & output.equals("inches")) {
                                double valueOut = (valueIn * 12);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("feet")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("cubits")) {
                                double valueOut = (valueIn / 1.5);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("steps")) {
                                double valueOut = (valueIn / 2.5);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("yards")) {
                                double valueOut = (valueIn / 3.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("feet") & output.equals("miles")) {
                                double valueOut = (valueIn / 5280.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //If input is cubits
                            if (input.equals("cubits") & output.equals("inches")) {
                                double valueOut = (valueIn * 18);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("feet")) {
                                double valueOut = (valueIn * 1.5);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("cubits")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("steps")) {
                                double valueOut = (valueIn * .6);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("yards")) {
                                double valueOut = (valueIn / 2);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("cubits") & output.equals("miles")) {
                                double valueOut = (valueIn / 3520.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //if input is steps
                            if (input.equals("steps") & output.equals("inches")) {
                                double valueOut = (valueIn * 30);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("feet")) {
                                double valueOut = (valueIn * 2.5);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("cubits")) {
                                double valueOut = (valueIn / .6);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("steps")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("yards")) {
                                double valueOut = (valueIn / 1.2);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("steps") & output.equals("miles")) {
                                double valueOut = (valueIn / 2112.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //if input is yards
                            if (input.equals("yards") & output.equals("inches")) {
                                double valueOut = (valueIn * 36);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("feet")) {
                                double valueOut = (valueIn * 3);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("cubits")) {
                                double valueOut = (valueIn / 2);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("steps")) {
                                double valueOut = (valueIn * 1.2);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("yards")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("yards") & output.equals("miles")) {
                                double valueOut = (valueIn / 1760.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            //if input is miles
                            if (input.equals("miles") & output.equals("inches")) {
                                double valueOut = (valueIn * 63360.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("feet")) {
                                double valueOut = (valueIn * 5280.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("cubits")) {
                                double valueOut = (valueIn * 3520.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("steps")) {
                                double valueOut = (valueIn * 2112.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("yards")) {
                                double valueOut = (valueIn * 1760.0);
                                System.out.println(valueOut);
                                run = false;
                            };
                            if (input.equals("miles") & output.equals("miles")) {
                                double valueOut = valueIn;
                                System.out.println(valueOut);
                                run = false;
                            };
                    } else {
                        System.out.println("Ending Program...");
                        run = false;
                    };
                };
            };
        };
    }
};