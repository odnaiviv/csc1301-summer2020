/*
 * Vivian Do
 * CSC 1301
 * July 03, 2020
 * 
 * Lab 4: Conditional Statement Execution
 *
 */
import java.lang.Math;
import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		//running the program (?)
		RollingDice();
		System.out.println();
		GradeReport(args);
		System.out.println();
	}

	public static void RollingDice() {
		
		int diceX=(int)(Math.random()*6+1);
		int diceY=(int)(Math.random()*6+1);
		int sumZ= diceX + diceY;
		
		System.out.println("The roll of Dice X is " +diceX);
		System.out.println("The roll of Dice Y is " +diceY);
		System.out.println("The total roll of Dice X and Y are " +sumZ);
		if (sumZ<6) {
			System.out.println("The total roll is less than 6.");
		}
		else if (sumZ>6 ) {
			System.out.println("The total roll is greater than 6.");
		}
		else if (sumZ==6) {
			System.out.println("The total roll is equal to 6.");
		}
	}
	
	
	
	public static void GradeReport(String[] args) {
		int grade;
		String gReport = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade as an interger from 0 to 100: ");
		grade = input.nextInt();
		
		switch (grade) {
		case 100: 
			//grade is 100
			gReport = "That's perfect! Execllent work!";
			break;
		case 99:
		case 98: 
		case 97: 
		case 96: 
		case 95: 
		case 94: 
		case 93: 
		case 92: 
		case 91: 
		case 90: 
			//grade is from 90 to 99
			gReport = "Great job! That was better than expected.";
			break;
		case 89: 
		case 88: 
		case 87: 
		case 86:
		case 85: 
		case 84: 
		case 83: 
		case 82: 
		case 81: 
		case 80:
			//grade is from 80 to 89
			gReport = "That was expected but it's still a good job.";
			break;
		case 79: 
		case 78: 
		case 77: 
		case 76: 
		case 75: 
		case 74: 
		case 73: 
		case 72: 
		case 71: 
		case 70: 
			//grade is from 70 to 79
			gReport = "Average... yet passing.";
			break;
		case 69:
		case 68: 
		case 67: 
		case 66: 
		case 65: 
		case 64: 
		case 63: 
		case 62: 
		case 61: 
		case 60: 
			//60-69
		case 59:
		case 58:
		case 57:
		case 56:
		case 55:
		case 54:
		case 53:
		case 52:
		case 51:
		case 50:
			//50-59
		case 49:
		case 48:
		case 47:
		case 46:
		case 45:
		case 44:
		case 43:
		case 42:
		case 41:
		case 40:
			//40-49
		case 39:
		case 38:
		case 37:
		case 36:
		case 35:
		case 34:
		case 33:
		case 32:
		case 31:
		case 30:
			//30-39
		case 29:
		case 28:
		case 27:
		case 26:
		case 25:
		case 24:
		case 23:
		case 22:
		case 21:
		case 20: 
			//20-29
		case 19:
		case 18:
		case 17:
		case 16:
		case 15:
		case 14:
		case 13:
		case 12:
		case 11:
		case 10: 
			//10-19
		case 9:
		case 8:
		case 7:
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: 
			//0-9
				//grades are below 70
					//honestly this took so long doing from 0 to 100... I really hope I did this correctly :(
			gReport = "Maybe you should go see the professor...";
			break;
		default: 
			gReport = "No! It has to be an integer between 0 and 100 >:(";
			break;
		}
		System.out.println("Your grade is a(n) " + grade + ". " + gReport);
	}
}
	
				
			
					
				
