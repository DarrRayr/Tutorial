import java.util.*;
public class TutorialTester {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Java \"Baby\" Tutorial \n\n Please enter the number of the corresponding choice: \n \n 1) Variables \n 2) Objects \n 3) Conditionals \n 4) Iterations\n\n");

        int choice = in.nextInt();

        Tutorial tutorialObject = new Tutorial(choice);
        System.out.print(tutorialObject.giveInfo());



    }
}
