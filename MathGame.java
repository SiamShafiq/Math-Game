import java.util.Random;
import java.util.Scanner;
class MathGame{
	
	public static void main(String[] args){

		System.out.println("How many questions do you want?");
		Scanner in = new Scanner(System.in);
		int rounds = in.nextInt();

		Random generator = new Random();
		generator.nextInt();

		int correct = 0;
		int wrong = 0;
		int difficulty = 0;

		System.out.println("What difficulty would you like?");
		System.out.println("1.Easy 2.Medium 3.Hard");
		int difficulty1 = in.nextInt();

			if(difficulty1 == 1){
			difficulty = 10;
			} 	else if(difficulty1 == 2){
			difficulty = 30;
			} 	else if (difficulty1 == 3){
			difficulty = 100;
		}

		System.out.println("Answer the following questions");
		for(int i = 0; i < rounds; i++) {

			int random1 = generator.nextInt(difficulty);
			int random2 = generator.nextInt(difficulty);
			
			int random3 = generator.nextInt(3);
			 
			 if(random3 == 1){
			 	System.out.println("What is : " + random1 + "-" + random2 + " =");
			 	int answer = in.nextInt();
				 if(answer == random1 - random2) {
					System.out.println("Your answer is correct!");
					random1 = 0;
					random2 = 0;
					correct += 1;	

				} else {
					System.out.println("Aw that's incorrect!");
					System.out.println("The correct answer was " + (random1 - random2));
					random1 = 0;
					random2 = 0;
					wrong += 1;
			 	}
			} 	  else if(random3 == 2){
					System.out.println("What is : " + random1 + "+" + random2 + " =" );
					int answer = in.nextInt();
					if(answer == random1 + random2) {
					System.out.println("Your answer is correct!");
					random1 = 0;
					random2 = 0;
					correct += 1;	

				} else {
					System.out.println("Aw that's incorrect!");
					System.out.println("The correct answer was " + random1 + random2);
					random1 = 0;
					random2 = 0;
					wrong += 1;
				}
			} 	  else {
					System.out.println("What is : " + random1 + "*" + random2 + "= ");
					int answer = in.nextInt();
					if(answer == random1 * random2) {
					System.out.println("Your answer is correct!");
					random1 = 0;
					random2 = 0;
					correct += 1;	

				} else {
					System.out.println("Aw that's incorrect!");
					System.out.println("The correct answer was " + random1 * random2);
					random1 = 0;
					random2 = 0;
					wrong += 1;
				}
			}

		}
		System.out.println("Your final score is, Correct : " + correct + " Incorrect : " + wrong );
		if(correct == rounds){
			System.out.println("Flawless!");
		} else if (wrong == rounds){
			System.out.println("Burned Out!");
		}

	}
}
