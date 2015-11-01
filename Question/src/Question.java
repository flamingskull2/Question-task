import java.util.Scanner;

public abstract class Question {
	
	public String answer;
	public String question;
	public abstract void askQuestion();
	public abstract boolean checkQuestion();
	public Scanner input = new Scanner(System.in);
	
}
