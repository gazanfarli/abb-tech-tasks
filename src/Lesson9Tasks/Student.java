package Lesson9Tasks;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int mathGrade;
    private int scienceGrade;
    private int englishGrade;

    public Student(String name, int mathGrade, int scienceGrade, int englishGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
    }

    public int getTotalGrade() {
        return mathGrade + scienceGrade + englishGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(student.getTotalGrade(), this.getTotalGrade());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mathGrade == student.mathGrade && scienceGrade == student.scienceGrade
                && englishGrade == student.englishGrade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mathGrade, scienceGrade, englishGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mathGrade=" + mathGrade +
                ", scienceGrade=" + scienceGrade +
                ", englishGrade=" + englishGrade +
                ", totalGrade=" + getTotalGrade() +
                '}';
    }
}
