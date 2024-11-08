public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam();
        System.out.println("Message from Exam: " + exam); 

        Midterm midterm = new Midterm();

        Essay essay = new Essay();

        Quiz quiz = new Quiz();
        Essay essayFromQuiz = new Essay();
    }
}
