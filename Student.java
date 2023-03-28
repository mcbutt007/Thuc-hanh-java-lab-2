import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

  private int id;
  private String name;
  private double calculusGrade;
  private double physicsGrade;
  private double programmingGrade;

  public Student(
    int id,
    String name,
    double calculusGrade,
    double physicsGrade,
    double programmingGrade
  ) {
    this.id = id;
    this.name = name;
    this.calculusGrade = calculusGrade;
    this.physicsGrade = physicsGrade;
    this.programmingGrade = programmingGrade;
  }

  public double getAverageGrade() {
    return (calculusGrade + physicsGrade + programmingGrade) / 3.0;
  }

  public static void addStudentsToList(List<Student> studentList) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int numStudents = scanner.nextInt();

    for (int i = 0; i < numStudents; i++) {
      System.out.println("Enter information for student " + (i + 1) + ":");

      System.out.print("Enter student ID: ");
      int id = scanner.nextInt();

      System.out.print("Enter student name: ");
      String name = scanner.next();

      System.out.print("Enter student grade 1: ");
      double grade1 = scanner.nextDouble();

      System.out.print("Enter student grade 2: ");
      double grade2 = scanner.nextDouble();

      System.out.print("Enter student grade 3: ");
      double grade3 = scanner.nextDouble();

      Student student = new Student(id, name, grade1, grade2, grade3);
      studentList.add(student);
    }
    scanner.close();
  }

  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    addStudentsToList(studentList);
  }
}
