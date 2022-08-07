public class studentProfile {

    String FirstName;
    String LastName;
    int ExpectedYearToGraduate;
    double GPA;
    String DeclaredMajor;

    public studentProfile(String FirstName, String LastName, int ExpectedYearToGraduate,double GPA, String DeclaredMajor) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.ExpectedYearToGraduate = ExpectedYearToGraduate;
        this.GPA = GPA;
        this.DeclaredMajor = DeclaredMajor;

    }

    public void incrementExpectedGraduationYear() {
        this.ExpectedYearToGraduate = this.ExpectedYearToGraduate + 1;
    }

}



public class Main {

    public static void main(String[] args) {

    studentProfile ProfileOne = new studentProfile("John", "Smith", 2023, 3.0, "Information Systems");
    studentProfile ProfileTwo = new studentProfile("Jane", "Doe", 2023, 3.5, "Information Systems");

    ProfileTwo.incrementExpectedGraduationYear();
    System.out.println(ProfileTwo.ExpectedYearToGraduate);

    }

}