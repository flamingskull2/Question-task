import java.util.ArrayList;
import java.util.Random;
public class StandartTest implements Testing{
	
	ArrayList<String> questions = new ArrayList<String>(10);
	Random rand = new Random();
	public StandartTest() {
	
	}
	@Override
	public void makeList() {
	
	}
	
	@Override
	public void performTest() {
		for(int i=0;i<questions.size();i++){
			questions.add("question");
		}
	}
	
	@Override
	public void shuffleList() {
		
		for(int i = 0;i<questions.size();i++){
			int n = rand.nextInt(10);
			questions.remove(n);
			questions.
		}
	}
	public int numCorrectAnswers(){
		
		return 0;
	}

}
