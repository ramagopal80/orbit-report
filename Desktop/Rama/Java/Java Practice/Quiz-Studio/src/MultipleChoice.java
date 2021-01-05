
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;


    public MultipleChoice(String question, int pointValue, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
    }


    @Override
    public void displayAnswers() {
        for (String answer : possibleAnswers) {
            System.out.println(answer);
        }
    }


    public boolean isCorrectAnswer(int possibleAnswer) {
        if (possibleAnswer == this.correctAnswer) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
        int userAnswer = answer.nextInt();
        if (isCorrectAnswer(userAnswer)) {
            return 1;
        } else {
            return 0;
        }
    }
}













//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MultipleChoice extends Question {
//
//
//    public MultipleChoice(String question, int pointsGained) {
//        super(question, pointsGained);
//    }
//
//    private ArrayList<String> possibleAnswers;
//    private int correctAnswer;
//
//    public MultipleChoice(String question, int pointsGained, ArrayList<String> possibleAnswers, int correctAnswer) {
//        super(question, pointsGained);
//        this.possibleAnswers = possibleAnswers;
//        this.correctAnswer = correctAnswer;
//    }
//
//    public void displayAnswers(){
//        for (String answer: possibleAnswers){
//            System.out.println(answer);
//        }
//    }
//
//    public boolean isCorrectAnswer(int possibleAnswer) {
//        if (possibleAnswer == this.correctAnswer) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public int getAnswers() {
//        Scanner answer = new Scanner(System.in);
//        System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
//        int userAnswer = answer.nextInt();
//        if (isCorrectAnswer(userAnswer)) {
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }

//}

