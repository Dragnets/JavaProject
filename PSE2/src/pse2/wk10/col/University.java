//Week 10 University
package pse2.wk10.col;

import java.util.List;

/**
 *
 * @author Peter Rosner
 * @version 1.0, November 2012
 * interface representing a university containing students
 */
public interface University {

    /**
     * add a student to the university
     * @param s the Student to be added
     */
    public void addStudent(Student s);


    /**
     * find a student with a particular student number
     * @param number the student number
     * @return the Student found or null if not found
     */
    public Student findStudent(int number);

    /**
     * get all the students in the university
     * @return a List of Student
     */
    public List<Student> getStudents();

}
