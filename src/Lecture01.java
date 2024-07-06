import java.util.*;

class Lecture01 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 01 \n");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #1 here:
        //
        // Copy and paste the output from when you first cloned (downloaded) and ran
        // this program
        // (in other words, when you run this program, what does it print?
        // Copy that output into this file, right here, in a comment
        // "Hello from lecture 01" is the output the program produces when I first download it.

        // Where in the textbook are the main topics for this question covered?
        // This is from all the way back in Chapter 1.1 in the book.

        // Put your answer for #2 here:
        System.out.println("Answer #2:");
        int endPoint = 100;
        for (int i = 1; i <= endPoint; i++) {
            System.out.print(i + " ");
        }
        // Where in the textbook are the main topics for this question covered?
        // This concept is from chapter 2.3.
        System.out.println("\n");

        // Put your answer for #3 here:
        System.out.println("Answer #3:");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Where in the textbook are the main topics for this question covered?
        // The main topics for this question are covered in chapter 2.3.
        System.out.println();

        // Put your answer for #4 here:
        System.out.println("Answer #4:");
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows would you like to print? ");
        int numRows = input.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Where in the textbook are the main topics for this question covered?
        // The introduction of our scanner interactive programs is in chapter 3.3.
        System.out.println();

        // Put your answer for #5 here:
        System.out.println("Answer #5:");
        System.out.print("How many grades would you like to store? ");
        int numberOfGrades = input.nextInt();
        double[] gradeBook = new double[numberOfGrades];
        double sum = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Next grade? ");
            gradeBook[i] = input.nextDouble();
        }

        for (int i = 0; i < gradeBook.length; i++) {
            sum += gradeBook[i];
        }

        System.out.println("The average of your grades is " + sum / numberOfGrades);
        // Where in the textbook are the main topics for this question covered?
        // The main topics for this question are covered in chapter 7.1 array basics,
        // 4.2 cumulative algorithms, and 2.3 loops.
        System.out.println();

        // Put your answer for #6 here:
        // Where in the textbook are the main topics for this question covered?
        // NOTE: The definition of the Food class should go OUTSIDE the Lecture01
        // class. A good place to put this is at the end of the file.
        // NOTE 2: Make sure that you create a couple of Food objects here in main()
        System.out.println("Answer #6");
        Food mediumFrenchFry = new Food("Medium French Frys", 320, 4.9);
        Food largeSprite = new Food("Large Sprite", 280, 4.5);
        Food hotAndSpicyMcchicken = new Food("Hot and Spicy McChicken", 380, 4.6);

        if (mediumFrenchFry.getCalories() < hotAndSpicyMcchicken.getCalories()) {
            System.out.println(mediumFrenchFry.getName() + " is the better diet food.");
        } else {
            System.out.println(hotAndSpicyMcchicken.getName() + " is the better diet food.");
        }

        mediumFrenchFry.print();

    }
}

// Placing the Food class below this line is a good place for it

class Food {
    private String name;
    private int calories;
    private double rating;

    public Food(String name, int calories, double rating) {
        this.name = name;
        this.calories = calories;
        this.rating = rating;
    }
    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    public double getRating() {
        return this.rating;
    }
    public void print() {
        System.out.println("Name: " + this.name + ", " + "Calories: " + this.calories + ", " + "Rating: " + this.rating);
    }
}