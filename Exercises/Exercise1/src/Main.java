import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<Integer> quizScores = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            quizScores.add(i * 7);
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                List<Integer> examScores = new ArrayList<>();
                for (int j = 0; j < 2; j++) {
                    examScores.add(  i * 4+ j);
                }
                students.add(new FullTimeStudent("FullTimeStudent-" + i, quizScores, examScores));
            } else {
                students.add(new PartTimeStudent("PartTimeStudent-" + i, quizScores));
            }
        }

        Session session = new Session(students);

        System.out.println("Average Quiz Scores:");
        session.calculateAverageQuizScores();

        System.out.println("\nQuiz Scores in Ascending Order:");
        session.printQuizScoresAscending();

        session.printPartTimeStudents();

        session.printFullTimeExamScores();
    }
}
