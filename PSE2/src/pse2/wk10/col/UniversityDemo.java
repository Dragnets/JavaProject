//Week 10 University Demo
package pse2.wk10.col;

import java.util.List;

/**
 *
 * @author Peter Rosner
 * @Version 1.0 November 2012
 */
public class UniversityDemo {

    public static void main(String[] args) {
        //University univ = new UniversityImpl1("London South Bank");
        //University univ = new UniversityImpl2("London South Bank");
        UniversityImpl1 univ = new UniversityImpl1("London South Bank");
        univ.addStudent(new Student("John", "Smithh", 2012, 3));
        univ.addStudent(new Student("John", "Smith", 2012, 3));
        univ.addStudent(new Student("Pete", "Jones", 2012, 3));
        univ.addStudent(new Student("Abdul", "Ali", 2012, 4));
        System.out.println(univ.findStudent(100001) + "\n");
        List<Student> students = univ.getStudents();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
