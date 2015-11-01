


public class OpenQuestion extends Question{
	public String correct;
	public OpenQuestion(String question,String correct) {
		this.question=question;
		this.correct=correct;
	}
	@Override
	public void askQuestion() {
		System.out.println(question);
		answer=input.nextLine();
	}
	@Override
	public boolean checkQuestion() {
		if(answer.length()<255){
			if(answer.equals(correct)){
				System.out.println("Correct");
				return true;
			}else{
				System.out.println("Incorrect");
				return false;
			}
		}else{
			System.out.println("Size too big.");
			return false;
		}
	}

}
