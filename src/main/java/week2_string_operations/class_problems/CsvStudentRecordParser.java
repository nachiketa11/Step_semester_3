package week2_string_operations.class_problems;

public class CsvStudentRecordParser {

    public static void parseStudentRecord(String csv) {
        if (csv == null || csv.trim().isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }

        String[] fields = csv.split(",");
        if (fields.length != 4) {
            System.out.println("Invalid Record: Expected 4 fields but got " + fields.length);
            return;
        }

        String name = fields[0].trim();
        String age = fields[1].trim();
        String grade = fields[2].trim();
        String gpa = fields[3].trim();

        System.out.printf("Student: %s | Age: %s | Grade: %s | GPA: %s%n", name, age, grade, gpa);
    }

    public static void main(String[] args) {
        parseStudentRecord("Rohan Sharma,20,A,3.85");
        parseStudentRecord("Invalid,Entry,OnlyTwo");
    }
}
