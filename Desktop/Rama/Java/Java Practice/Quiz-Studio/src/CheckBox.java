//package org.launchcode.java.studios.quiztime;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Question {

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    public CheckBox(String question, int pointValue, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(question, pointValue);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void displayAnswers() {
        for (String answer : this.possibleAnswers) {
            System.out.println(answer);
        }
    }

    public int checkAnswers(ArrayList<Integer> check) {
        int answersCorrect = 0;
        for (int i = 0; i < check.size(); i++) {
            if (correctAnswers.contains(check.get(i))) {
                answersCorrect++;
            }
        }
        return answersCorrect;
    }

    @Override
    public int getAnswers() {
        ArrayList<Integer> usersAnswers = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers. To begin answering the question, enter 'y'.");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while (goingToContinue.indexOf('y') >= 0 && usersAnswers.size() <= possibleAnswers.size()) {
            System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            usersAnswers.add(option);

            System.out.println("For this question, there are multiple correct answers. To continue answering the question, enter 'y'. To stop, enter 'n'");
            goingToContinue = userContinue.nextLine();
        }

        return checkAnswers(usersAnswers);
    }

}

//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CheckBox extends Question{
//
//
//    private ArrayList<String> possibleAnswers;
//    private ArrayList<String> correctAnswers;
//    public CheckBox(String question, int pointsGained) {
//        super(question, pointsGained);
//        this.possibleAnswers = possibleAnswers;
//        this.correctAnswers = correctAnswers;
//    }
//    @Override
//    public void displayAnswers() {
//        for(String answer: this.possibleAnswers) {
//            System.out.println(answer);
//        }
//    }
//
//    public int checkAnswers(ArrayList<Integer> check) {
//        int answersCorrect = 0;
//        for (int i = 0; i < check.size(); i++) {
//            if (correctAnswers.contains(check.get(i))) {
//                answersCorrect++;
//            }
//        }
//        return answersCorrect;
//    }
//
//
//    @Override
//    public int getAnswers() {
//        ArrayList<Integer> usersAnswers = new ArrayList<>();
//        System.out.println("For this question, there are multiple correct answers. To begin answering the question, enter 'y'.");
//        Scanner userContinue = new Scanner(System.in);
//        String goingToContinue = userContinue.nextLine();
//        while (goingToContinue.indexOf('y') >= 0 && usersAnswers.size() <= possibleAnswers.size()) {
//            System.out.println("What will your answer be? Enter the number of the option you believe is correct. For example, to select the first option, enter 1");
//            Scanner userAnswer = new Scanner(System.in);
//            String answer = userAnswer.nextLine();
//            int option = Integer.parseInt(answer);
//            usersAnswers.add(option);
//
//            System.out.println("For this question, there are multiple correct answers. To continue answering the question, enter 'y'. To stop, enter 'n'");
//            goingToContinue = userContinue.nextLine();
//        }
//
//        return checkAnswers(usersAnswers);
//    }
//
//
//
//
//}
