//Week 10 UniversityImpl2
package pse2.wk10.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Peter Rosner
 * @version 1.0, November 2012
 */
public class UniversityImpl2 implements University {
    /**
     * name of university as String
     */
    private String name;
    /**
     * students in the university stored by student number
     * as HashMap<Integer,Student>
     */
    private HashMap<Integer,Student> students;


    /**
     * Constructor
     * @param name of university as String
     */
    public UniversityImpl2(String name) {
        this.name = name;
        students = new HashMap<Integer,Student>();
    }

   
    /**
     * add a student to the university
     * @param s the Student to be added
     */
    public void addStudent(Student s) {
        students.put(s.getStudentNumber(),s);
    }

    /**
     * find a student with a particular student number
     * @param number the student number
     * @return the Student found or null if not found
     */
    public Student findStudent(int number) {
        return students.get(number);
    }



    /**
     * get all the students in the university in sorted order
     * @return a List of Student
     */
    public List getStudents() {
        Collection<Student> studentList = students.values();
        ArrayList<Student> listToReturn = new ArrayList<Student>();
        for (Student s:studentList){
            listToReturn.add(s);
        }
        Collections.sort(listToReturn);
        return listToReturn;
    }

}
