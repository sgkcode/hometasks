package javaclasses;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

  private List<Student> students = new ArrayList<>();

  public void addStudent(Student a) {
    students.add(a);
  }

  public void printStudentsByFaculty(Faculty faculty) {
    for (Student student : students) {
      if (student.getFaculty().equals(faculty)) {
        System.out.println(student);
      }
    }
  }

  public void printStudentsForEachFacultyAndCourse() {
    for (int i = 0; i < Faculty.values().length; i++) {
      int count = 0;
      int courseMax = 6;
      for (int j = 1; j <= courseMax; j++) {
        System.out.println("Факультет " + Faculty.values()[i] + " Курс " + j);
        for (Student student : students) {
          if (student.getFaculty().equals(Faculty.values()[i]) & student.getCourse() == j) {
            System.out.println(student);
            count++;
          }
        }
        if (count == 0) {
          System.out.println("В базе студентов нет");
        }
        count = 0;
      }
    }
  }

  public void printStudentsByYearAfter(int year) {
    for (Student student : students) {
      if (Integer.parseInt(student.getBirthday().substring(6)) > year) {
        System.out.println(student);
      }
    }
  }

  public void printStudentsByGroup(int group) {
    for (Student student : students) {
      if (student.getGroup() == (group)) {
        System.out.println(student);
      }
    }
  }
}
