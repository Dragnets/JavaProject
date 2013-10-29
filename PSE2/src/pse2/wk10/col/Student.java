//Week 10 Student

package pse2.wk10.col;

/**
 *
 * @author Peter Rosner
 * @version 1.0, November 2012
 */
public class Student implements Comparable<Student>{

    /**
     * the student number of the student as int
     */
    private int studentNumber;

    /**
     * the student's first name as String
     */
    private String firstName;

    /**
     * the student's last name as String
     */
    private String lastName;

    /**
     * the year the student started at the universtity as int
     */
    private int yearStarted;

    /**
     * the length of course as int
     */
    private int lengthOfCourse;

    /**
     * initial student number allocated - incremented by 1 for 
     * each student added
     */
    public static int currentStudentNumber = 100000;


    /**
     * Constructor increments the current student number each time called
     * @param firstName the first name of the student as String
     * @param lastName the last name of the student as String
     * @param yearStarted the year started as int
     * @param lengthOfCourse the length of course as int
     */
    public Student(String firstName, String lastName,
            int yearStarted,int lengthOfCourse){
        this.studentNumber = currentStudentNumber;
        currentStudentNumber++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearStarted = yearStarted;
        this.lengthOfCourse = lengthOfCourse;
    }


    /**
     * 
     * @return the student number as int
     */
    public int getStudentNumber(){
        return studentNumber;
    }

    /**
     * @return the student's first name as String
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * @return the student's last name as String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the student's full name (first and last name)
     * as String
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

   
    /**
     * @return the length of the course as int
     */
    public int getLengthOfCourse() {
        return lengthOfCourse;
    }

    /**
     * @return the year of graduation as int
     */
    public int getYearOfGraduation(){
        return yearStarted + lengthOfCourse + 1;
    }

    /**
     * return all information about Student as String
     * @return
     */
    @Override
    public String toString(){
        return studentNumber + " " 
                + lastName + " "
                + firstName + " "
                + yearStarted + "-"
                + getYearOfGraduation();

    }

  /**
   * implements Comparator interface
   * Used to sort a List of students 
   * @param s the Student object to be compared against
   * @return    -1 if this student's last name is lexically smaller than 
   *                the last name of the student to be compared against,
   *            +1 if this student's last name is lexically greater, and
   *             0 if the the students' last names are the same.
   */

    public int compareTo(Student s){
        return lastName.compareTo(s.getLastName());
    }
   
}
