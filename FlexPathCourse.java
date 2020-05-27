package extendclass_assessment1;

import java.util.Date;

/**
 *
 * @author donaldhughes
 */
public class FlexPathCourse extends Course {

    private String title;
    private String code;
    private String optionalResources = "";

    public FlexPathCourse() {
        super();
    }

    public FlexPathCourse(String code, int creditHours, String title, Date dateCreated) {
        super(code, creditHours, title, dateCreated);
    }

    public String toString(String code, int creditHours, String title, Date dateCreated) {

        return "Java class name = " + "'" + this.getClass().getSimpleName() + "' Course Code = " + this.code;
    }
}
