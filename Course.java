package extendclass_assessment1;

import java.util.Date; //import the date utility for timestamps

/**
 *
 * @author donaldhughes
 */
// Mobile Cloud Computing Application Development
public class Course {

    // Class Attributes
    private String code = "";    // Code attribute - a string field to store the course code (e.g. IT4789)
    private int creditHours = 0; // CreditHours attribute – int - store credit hours of a course
    private String title = "";   // Title attribute – a string field to store the 
    public Date dateCreated; //Set a date created variable

    public Course() {
    }

    // Class Constructor with params code, creditHours and title
    public Course(String code, int creditHours, String title, Date dateCreated) {
        // assigns received values to their attributes
        this.code = code;
        this.creditHours = creditHours;
        this.title = title;
        this.dateCreated = dateCreated;
        
    }

    // Setter method for Course codes
    public void setCode(String code) {
        this.code = code;
    }

    // Setter method for Course codes
    public String getCode() {
        return code;
    }

    // Setter method for Course codes
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    // Setter method for Course codes
    public int getCreditHours() {
        return creditHours;
    }
    // Setter method for Course codes

    public Date getDateCreated() {
        return dateCreated;
    }

    // Overridden toString() method that returns name of the class (i.e. Course)and
    // course code assigned to the class obj
    @Override
    public String toString() {
        return "Java class name = " + "'" + this.getClass().getSimpleName() + "' Course Code = " + code;
    }

}
