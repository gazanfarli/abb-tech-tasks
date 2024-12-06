package Lesson9Tasks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 50, 70, 30);
        Student student2 = new Student("Alex", 80, 90, 100);
        Student student3 = new Student("Donald", 60, 80, 60);

        Map<String, Student> students = new HashMap<>();

        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);

        System.out.println("Unsorted Students: ");
        for (Student student : students.values()) {
            System.out.println(student);
        }

        List<Student> studentList = new ArrayList<>(students.values());
        Collections.sort(studentList);

        System.out.println("\nSorted students by total grades (descending): ");
        for (Student student : studentList) {
            System.out.println(student);
        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareToIgnoreCase(student2.getName());
            }
        });

        System.out.println("\nSorted students by name (alphabetical): ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
