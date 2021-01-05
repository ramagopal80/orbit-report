//package org.launchcode.java.studios.quiztime;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;
    private int total;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = 0;
        this.total = 0;
        for (int i = 0; i < questions.size(); i++) {
            this.total = this.total + questions.get(i).getPointValue();
        }
    }

    public void addQuestion(Question newQuestion) {
        this.questions.add(newQuestion);
        this.total = this.total + newQuestion.getPointValue();
    }

    public void runQuiz() {
        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).displayQuestion();
            questions.get(i).displayAnswers();
            int pts = questions.get(i).getAnswers();
            updateScore(pts);
        }
    }

    public void updateScore(int x) {
        this.score = this.score + x;
    }

    public void gradeQuiz() {
        System.out.println("You finished the quiz! Your score is: " + score + "/" + total);
    }

}


//
//        import java.util.ArrayList;
//
//
//public class Quiz {
//
//    private ArrayList<Question> questions;
//    private int score;
//    private int total;
//
//    public Quiz(ArrayList<Question> questions) {
//        this.questions = questions;
//        this.score = 0;
//        this.total = 0;
//        for (int i = 0; i < questions.size(); i++) {
//            this.total = this.total + questions.get(i).getPointValue();
//        }
//    }
//
//    public void addQuestion(Question newQuestion) {
//        this.questions.add(newQuestion);
//        this.total = this.total + newQuestion.getPointValue();
//    }
//
//    public void runQuiz() {
//        for (int i = 0; i < questions.size(); i++) {
//            questions.get(i).displayQuestion();
//            questions.get(i).displayAnswers();
//            int pts = questions.get(i).getAnswers();
//            updateScore(pts);
//        }
//    }
//
//    public void updateScore(int x) {
//        this.score = this.score + x;
//    }
//
//    public void gradeQuiz() {
//        System.out.println("You finished the quiz! Your score is: " + score + "/" + total);
//    }
//}
//
//
//


//
//    public static void main(String[] args) {
//        String q1 = "What is the color of apples?\n"
//                + "(a) green/red\n(b) blue\n(c) yellow";
//        String q2 = "What is the color of banana?\n"
//                + "(a) purple\n(b)yellow\n(c)blue";
//        Question[] questions = {
//                new Question(q1, "a"),
//                new Question(q2, "b")
//        };
//        takeTest(questions);
//    }
//        public static void takeTest (Question[]questions){
//            int score = 0;
//            Scanner keyboardInput = new Scanner(System.in);
//            for (i = 0, i < questions.length, i ++) {
//                System.out.println(questions[i].prompt);
//                String answer = keyboardInput.nextLine();
//                if (answer.equals(questions[i].answer)) {
//                    score++;
//                }
//
//            } System.out.println("You got " + score + "/" + questions.length);
//        }


