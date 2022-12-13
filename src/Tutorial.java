/**
 * The Tutorial class takes in the choices of the user for which topic they want to learn
 * and what their answer is, it assists the TutorialTester class.
 * @author Darryl Rayray
 * @version 1.0
 * @since 2022-12-12
 */

public class Tutorial {
    private int choice;
    private int answerChoice;


    public Tutorial(int choice){this.choice = choice;}

    /**
     * This method returns a string which gives info on the user's chosen topic.
     * @return A string which gives the info of the chosen topic
     */
    public String giveInfo(){
        //Variable Info
        if(choice == 1){return ("Variables are containers for storing data values. \n In Java, there are different types of variables, for example: \n\n String - stores , such as \"Hello\". String values are surrounded by double quotes \n int - stores integers (whole numbers), without decimals, such as 123 or -123 \n float - stores floating point numbers, with decimals, such as 19.99 or -19.99 \n char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes \n boolean - stores values with two states: true or false \n\n");}
        //Object Info
        else if(choice == 2){return ("Java is an object-oriented programming language.\n" +
                "\n" +
                "Everything in Java is associated with classes and objects, along with its attributes and methods. \nFor example: in real life, a car is an object. \nThe car has attributes, such as weight and color, and methods, such as drive and brake.\n" +
                "\n" +
                "A Class is like an object constructor, or a \"blueprint\" for creating objects. \n\n ");}
        //Comparison Operators
        else if(choice == 3){return ("Less than: a < b\n" +
                "Less than or equal to: a <= b\n" +
                "Greater than: a > b\n" +
                "Greater than or equal to: a >= b\n" +
                "Equal to a == b\n" +
                "Not Equal to: a != b\n" +
                "You can use these conditions to perform different actions for different decisions. \n\n ");}
        //Looping/Iteration Info
        else if(choice == 4){return ("Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true. \nJava provides three ways for executing the loops. \nWhile all the ways provide similar basic functionality, they differ in their syntax and condition checking time.\n\n");}
        return("Error!");
    }

    /**
     * Quizzes/gives the user a question on their given topic
     * @return A string that is a question quizzing them on their topic
     */
    public String giveQuestion(){
        if(choice == 1){return "Variables store what? \n\n 1) Memory Locations \n 2) You're \n 3) Data Values \n 4) Humans \n\n";}
        else if(choice == 2){return "Objects have what? \n\n 1) Methods & Attributes \n 2) Viruses \n 3) Central Processing \n 4) Nothing \n\n";}
        else if(choice == 3){return "Conditionals help to do what? \n\n 1) Get a drivers permit  \n 2) Different actions for different situations \n 3) Get smarter \n 4) Become a straight A student \n\n";}
        else if(choice == 4){return "Looping/Iteration does what? \n\n 1) Cures cancer \n 2) Nothing  \n 3) Repeats a set of instructions \n 4) Cooks food \n\n";}
        return "Error!";
    }

    /**
     * Checks the user's answer and if it lines up with the correct answer of the according question.
     * @return A boolean determining whether the user got the question right or not.
     */
    public boolean checkAnswer(){
        if(choice == 1 && answerChoice == 3){return true;}
        else if(choice == 1 && answerChoice == 3){return true;}
        else if(choice == 1 && answerChoice == 3){return true;}
        else if(choice == 1 && answerChoice == 3){return true;}
        return false;
    }

    /**
     * Sets the instance variable answerChoice to the user's answer.
     * @param answerChoice The users choice to the given question
     */
    public void setAnswerChoice(int answerChoice){this.answerChoice = answerChoice;}
}
