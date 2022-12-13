import java.util.*;

/**
 * The TutorialTester class gives a tiny bit of info about a certain aspect of Java,
 * then testing the user on that information.
 * @author Darryl Rayray
 * @version 1.0
 * @since 2022-12-12
 */
public class TutorialTester {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Java \"Baby\" Tutorial \n\n Please enter the number of the corresponding choice: \n \n 1) Variables \n 2) Objects \n 3) Comparison \n 4) Iterations\n\n");

        int choice = in.nextInt();

        Tutorial tutorialObject = new Tutorial(choice);
        System.out.print(tutorialObject.giveInfo());

        //Gives the question and tells the user to answer until they get it correct.

        System.out.println(tutorialObject.giveQuestion());
        int userAnswer = in.nextInt();
        tutorialObject.setAnswerChoice(userAnswer);
        tutorialObject.checkAnswer();
        while(tutorialObject.checkAnswer() == false){
            System.out.println("Wrong Answer! Try Again!: ");

            userAnswer = in.nextInt();
            tutorialObject.setAnswerChoice(userAnswer);
        }
        System.out.println("Good Job! You've finished the tutorial!");





    }
}
