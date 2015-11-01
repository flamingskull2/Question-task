
import java.util.Scanner;

public class IntegerQuestion extends Question{
	public int correct;
	public IntegerQuestion(String question,int correct) {
		this.question=question;
		this.correct = correct;
	}
	@Override
	public void askQuestion() {
		System.out.println(question);
		answer= input.nextLine();
	}
	
	@Override
	public boolean checkQuestion() {
		int answer=Integer.parseInt(this.answer);
		if(answer == correct){
			System.out.println("Correct");
			return true;
		}else{
			System.out.println("Incorrect");
			return false;
		}
		
	}
}
