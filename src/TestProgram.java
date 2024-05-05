public class TestProgram {
    public static void main(String[] args) throws Exception {
        Student student = new Student();

        Resource book = new Book("Statistics");
        Resource journal = new Journal("Journal of Marketing Research");
        Resource theses = new Thesis("The Impact of Social Media on Adolescent Mental Health: A Longitudinal Study");
        Resource capstone = new Capstone("Design and Evaluation of a Renewable Energy System for Rural Communities");
        Resource internet = new Internet("college.neu.edu.ph");
        Resource newspaper = new Newspaper("The Wall Street Journal");

        // Student borrows resources
        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(theses);
        student.borrowResource(capstone);
        student.borrowResource(internet);
        student.borrowResource(newspaper);
    }
}