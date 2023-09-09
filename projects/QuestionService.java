package projects;

import java.util.Scanner;

public class QuestionService {
    Question questions[] = new Question[5];
    String answersChoosen[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Size of int", "1", "2", "4", "8", "4");
        questions[1] = new Question(2, "Size of long", "1", "2", "4", "8", "8");
        questions[2] = new Question(3, "Size of char", "1", "2", "4", "8", "1");
        questions[3] = new Question(4, "Size of byte", "1", "2", "4", "8", "1");
        questions[4] = new Question(5, "Size of short", "1", "2", "4", "8", "2");
    }

    public void playQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question eachQuestion : questions) {
            System.out.println("Question Number. " + eachQuestion.getId());
            System.out.println(eachQuestion.getQuestion());
            System.out.println("Type one of the options: ");
            System.out.println(eachQuestion.getOpt1() + " " + eachQuestion.getOpt2() + " " + eachQuestion.getOpt3()
                    + " " + eachQuestion.getOpt4());
            answersChoosen[eachQuestion.getId() - 1] = scanner.nextLine();
        }
        scanner.close();
    }

    public int calculateScore() {
        int counter = 0;
        for (Question eachQuestion : questions) {
            if (eachQuestion.getAnswer().equals(answersChoosen[eachQuestion.getId() - 1]))
                counter++;
        }
        return counter;
    }
}
