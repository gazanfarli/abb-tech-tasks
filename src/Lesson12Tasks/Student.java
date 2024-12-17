package Lesson12Tasks;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private static final Long serialVersionUID = 7652345673456L;

    private Integer studentId;
    private String name;
    private Double score;

    public Student(Integer studentId, String name, Double score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{studentId=" + studentId + ", name='" + name + "', score=" + score + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) && Objects.equals(name, student.name) && Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, score);
    }
}
