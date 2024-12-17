package Lesson12Tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String filePath = "C:\\Users\\Gazanfar Gazanfarli\\IdeaProjects\\abb-tech-tasks\\src\\Lesson12Tasks\\students.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. View all records");
            System.out.println("2. Add a new record");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Student> students = getAllStudents();
                    for (Student student : students) {
                        System.out.println("StudentId: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
                    }
                    break;
                case 2:
                    System.out.print("Enter StudentId: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Score: ");
                    double score = scanner.nextDouble();
                    scanner.nextLine();
                    addStudentRecord(new Student(id, name, score));
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static List<Student> getAllStudents() {
        File file = new File(filePath);
        List<Student> students = new ArrayList<>();

        if (!file.exists()) {
            return students;
        }

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            StringBuilder contentBuilder = new StringBuilder();
            int content;

            while ((content = fileInputStream.read()) != -1) {
                contentBuilder.append((char) content);
            }

            String result = contentBuilder.toString();
            String[] lines = result.split(System.lineSeparator());

            for (String line : lines) {
                if (!line.isEmpty()) {
                    String[] parts = line.split(",");
                    students.add(new Student(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2])));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return students;
    }

    public static void addStudentRecord(Student student) {
        File file = new File(filePath);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

            String studentRecord = student.getStudentId() + "," + student.getName() + "," + student.getScore() + System.lineSeparator();

            bufferedOutputStream.write(studentRecord.getBytes());
            bufferedOutputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
