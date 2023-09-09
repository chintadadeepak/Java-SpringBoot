import projects.*;

public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playQuiz();
        int quizScore = service.calculateScore();
        System.out.println("your score : " + quizScore);
    }
}
