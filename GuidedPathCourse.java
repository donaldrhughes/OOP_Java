package extendclass_assessment1;

import java.util.Date;

/**
 *
 * @author donaldhughes
 */
public class GuidedPathCourse extends Course {

    private String title;
    private String code;
    private String requiredResources = "";
    private int creditHours;
    private int duration;

    public GuidedPathCourse() {
        super();
    }

    public GuidedPathCourse(String code, int creditHours, String title, Date dateCreated) {
        super(code, creditHours, title, dateCreated);
    }

    public String returnTitle(String code, int creditHours, String title, Date dateCreated) {
        return "Java class name = " + "'" + this.getClass().getSimpleName() + "' Course Code = " + this.code;
    }
}
