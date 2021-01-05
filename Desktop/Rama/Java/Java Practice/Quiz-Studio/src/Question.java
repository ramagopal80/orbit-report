//package org.launchcode.java.studios.quiztime;

public abstract class Question {

    private String question;
    private int pointValue;

    public Question(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(this.question);
    }

    public void setPointValue(int x) {
        this.pointValue = x;
    }

    public int getPointValue() {
        return this.pointValue;
    }

    public abstract void displayAnswers();

    public abstract int getAnswers();


}




//public abstract class Question {
//     private String question;
//     private int pointsGained;
//
//
//
//    public Question(String question, int pointsGained) {
//        this.question = question;
//        this.pointsGained = pointsGained;
//    }
//
//    public void displayQuestion() {
//        System.out.println(this.question);
//    }
//
//    public void setPointValue(int x) {
//        this.pointsGained = x;
//    }
//
//    public int getPointValue() {
//        return this.pointsGained;
//    }
//
//    public abstract void displayAnswers();
//
//    public abstract int getAnswers();
//
//
//}





