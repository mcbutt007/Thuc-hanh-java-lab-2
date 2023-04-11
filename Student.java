import java.util.ArrayList;
import java.util.Optional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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
			double programmingGrade) {
		this.id = id;
		this.name = name;
		this.calculusGrade = calculusGrade;
		this.physicsGrade = physicsGrade;
		this.programmingGrade = programmingGrade;
	}

	// Getter and setter for id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Getter and setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and setter for calculusGrade
	public double getCalculusGrade() {
		return calculusGrade;
	}

	public void setCalculusGrade(double calculusGrade) {
		this.calculusGrade = calculusGrade;
	}

	// Getter and setter for physicsGrade
	public double getPhysicsGrade() {
		return physicsGrade;
	}

	public void setPhysicsGrade(double physicsGrade) {
		this.physicsGrade = physicsGrade;
	}

	// Getter and setter for programmingGrade
	public double getProgrammingGrade() {
		return programmingGrade;
	}

	public void setProgrammingGrade(double programmingGrade) {
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

	public Boolean qualified() {
		if (this.getAverageGrade() >= 8 && this.programmingGrade >= 9) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student{id= " + this.id + ", name= " + name + ", average grade=" + this.getAverageGrade() + "}";
	}

	// Function to print the top 10 highest averageGrade from lowest to highest
	public static void printTop10(List<Student> students) {
		// Sort the list by averageGrade in ascending order
		List<Student> sorted = students.stream()
				.sorted(Comparator.comparingDouble(Student::getAverageGrade))
				.collect(Collectors.toList());

		System.out.println("Top 10 sinh vien co diem trung binh cao nhat");
		// Get the size of the list
		int size = sorted.size();

		// Print the last 10 elements or less if the list is smaller
		for (int i = Math.max(0, size - 10); i < size; i++) {
			Student s = sorted.get(i);
			System.out.println(s.getName() + ": " + s.getAverageGrade());
		}
	}

	// Function to print the Student with the highest averageGrade
	public static void printHighest(List<Student> students) {
		// Find the Student with the maximum averageGrade using Comparator
		Optional<Student> max = students.stream()
				.max(Comparator.comparingDouble(Student::getAverageGrade));
		System.out.println("Sinh vien co diem trung binh cao nhat");

		// If the list is not empty, print the name and grade of the Student
		if (max.isPresent()) {
			Student s = max.get();
			System.out.println(s.getName() + ": " + s.getAverageGrade());
		} else {
			// Otherwise, print a message that the list is empty
			System.out.println("The list is empty");
		}
	}

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();

		addStudentsToList(studentList);

		System.out.println("Sinh vien duoc nhan hoc bong:");
		for (Student student : studentList) {
			if (student.qualified()) {
				System.out.println(student.toString());
			}
		}

		printHighest(studentList);
		printTop10(studentList);
	}
}
