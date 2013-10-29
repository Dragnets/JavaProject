//Week10 UniversityImpl1
package pse2.wk10.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Peter Rosner
 * @version 1.0, November 2012
 */
public class UniversityImpl1 implements University {

    /**
     * Name of the university as String
     */
    private String name;

    /**
     * students in the university stored as an ArrayList<Student>
     * will be maintained sorted
     */
    private ArrayList<Student> students;


    /**
     * constructor
     * @param name of the university as String
     */
    public UniversityImpl1(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    /**
     * add a student to the university, sorts students after add
     * @param s the Student to be added
     */
    public void addStudent(Student s) {
        students.add(s);
        Collections.sort(students);
    }

    /**
     * find a student with a particular student number
     * @param number the student number
     * @return the Student found or null if not found
     */
    public Student findStudent(int number) {
        for (Student s : students) {
            if (s.getStudentNumber() == number) {
                return s;
            }
        }
        return null;
    }


    /**
     * get all the students in the university in sorted order
     * @return a List of Student
     */
    public List<Student> getStudents() {
        return students;
    }
}
