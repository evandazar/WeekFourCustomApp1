package edu.whccd.evaldez;

import java.util.Scanner;
/*
    The purpose of this application is to show the uses of if/else statements and switch statements.
    author: Evander Valdez
*/
public class Main {

    public static void main(String[] args) {
	System.out.println("Numeric grade to a letter grade using if-else statements");
	System.out.println("Enter a numeric integer grade (0-100):");
	//System.out.println();

	//Initiate variables
    int numericGrade = 0;
    char letterGrade;
    String numericGradeRange = "";
    Scanner sc = new Scanner(System.in);

    //user inputs
    numericGrade = sc.nextInt();
    if (numericGrade < 0 || numericGrade > 100)
        {
        System.out.println("Invalid Input");
        System.exit(0);
        }
    if (numericGrade >= 90)
        {
        letterGrade = 'A';
        }
    else if(numericGrade >= 80 && numericGrade < 90)
        {
        letterGrade = 'B';
        }
    else if(numericGrade >= 70 && numericGrade < 80)
        {
        letterGrade = 'C';
        }
    else if(numericGrade >= 60 && numericGrade < 70)
        {
        letterGrade = 'D';
        }
    else
        {
        letterGrade = 'F';
        }
    switch (letterGrade)
    {
        case 'A':
            numericGradeRange = "90-100%";
            break;
        case 'B':
            numericGradeRange = "80-89%";
            break;
        case 'C':
            numericGradeRange = "70-79%;";
            break;
        case 'D':
            numericGradeRange = "60-69%";
            break;
        default:
            numericGradeRange = "0-59%";
            break;
    }
    if (numericGradeRange != "")
    {
        String message = "Letter Grade: " + letterGrade + "\n" +
                "***********************************************"
                + "\n" + "Numeric Grade Range: " + numericGradeRange;
        System.out.println(message);
    }
    }
}
