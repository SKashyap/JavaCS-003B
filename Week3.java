import java.util.*;

class Week3 {
    // Prompt user to input an age and a weight (in pounds) and display a 
    // message about which roller coaster they should ride.

    /*
    ------------------------------------------
    Age (years)  | Weight (pounds) | Roller Coaster
    ------------------------------------------
    < 0           | Any             | Error
    Any           | < 0             | Error
    Non-digit input | Any           | Error
    Any           | Non-digit input | Error
    0-10          | < 80            | Black
    0-10          | 80-200          | Green
    0-10          | > 200           | Yellow
    11-20         | < 80            | Silver
    11-20         | 80-200          | Red
    11-20         | > 200           | Purple
    21+           | Any             | Pink
    ------------------------------------------
    */
    public static void main1(String[] args) {       
        Scanner sc = new Scanner(System.in);
        int age = 0;
        double weight = 0;
        
        // Prompt user to provide age and weight
        try {
            System.out.println("Please input a whole number as your age:");
            age = sc.nextInt();
            System.out.println("Please input your weight in pounds:");
            weight = sc.nextDouble();
        } catch (InputMismatchException e) {
            // Handle the case where the user input is not a valid number
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            return;
        }

        // validate the value range 
        if (age < 0 ||  weight < 0) {
            System.out.println("Please enter positive values for age and weight");
            return;
        }
        
        // Conditional message based on age and weight
        if (age <= 10) {
            if (weight < 80) {
                System.out.println("This person needs to ride the black roller coaster.");
            } else if (weight <= 200) {
                System.out.println("This person needs to ride the green roller coaster.");
            } else {
                System.out.println("This person needs to ride the yellow roller coaster.");
            }
            
        } else if (age <= 20) {
            if (weight < 80) {
                System.out.println("This person needs to ride the silver roller coaster.");
            } else if (weight <= 200) {
                System.out.println("This person needs to ride the red roller coaster.");
            } else {
                System.out.println("This person needs to ride the purple roller coaster.");
            }
        } else {
            System.out.println("This person needs to ride the pink roller coaster.");
        }
    }


    // Write a program that defines an enum for the four seasons (Winter, Spring, Summer, Autumn) 
    // and uses a switch statement to print out a message based on the current season.

    // Define the enum
    public enum ESeason {
        WINTER, 
        SPRING, 
        SUMMER, 
        AUTUMN
    };
    
    public static void main(String[] args) { 
        ESeason currentSeason = ESeason.WINTER; // Change this to test cases
        currentSeason = GenerateRandomInput(); // Or generate random value each time

        switch(currentSeason) {
            case WINTER:
                System.out.println("It's cold and snowy. Time for skiing and drinking hot chocolate!"); 
                break;
            case SPRING:
                System.out.println("Flowers are blooming. A great time for hiking and enjoying nature! It's hot and sunny."); 
                break;
            case SUMMER:
                System.out.println("Perfect for going to the beach or having a barbecue!"); 
                break;
            case AUTUMN:
                System.out.println("Leaves are falling. Enjoy the cool breeze and go for a walk in the park!"); 
                break;
            default :
                System.out.println("Error"); 
                System.exit(1);
        };
    }
    
    public static ESeason GenerateRandomInput(){
        // Math.random() to obtain a random double value between 0.0 and 1.0, excluding 1.0.
        int randSeason = (int)(Math.random()*10);

        // Modulo 4 will ensure we have only 4 values : 0 1 2 3
        randSeason = randSeason%4;
        ESeason retVal = ESeason.WINTER;
        
        switch(randSeason) {
            case 0:
                retVal = ESeason.WINTER;
                break;
            case 1:
                retVal = ESeason.SPRING;
                break;
            case 2:
                retVal = ESeason.SUMMER;
                break;
            case 3:
                retVal = ESeason.AUTUMN;
                break;
            default :
                System.out.println("Error in Random Season Generation"); 
                System.exit(1);
        };
        return retVal;
    }
}