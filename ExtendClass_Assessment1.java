/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendclass_assessment1;

import java.util.Date;

/**
 *
 * @author donaldhughes
 */
public class ExtendClass_Assessment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Assessment 1");
        Date dateCreated = new java.util.Date();
        
      
        Course[] courses = {
            new Course("TBD ", 3, "TBD ", dateCreated),
            new FlexPathCourse("IT2230 ", 3, " Introduction to Database Systems ", dateCreated),
            new GuidedPathCourse("ITFP4789 ", 3, " Mobile Cloud Computing Application Development ", dateCreated)
        };
            for (int i=0; i< courses.length; i++){
                System.out.println(courses[i]);
                
            } 
    }
}

/*
***
============================================================================================
Class Name | code | creditHours | title
Course | TBD | 3 | TBD
FlexPathCourse | IT2230 | 3 | Introduction to Database Systems
GuidedPathCourse | ITFP4789 | 3 | Mobile Cloud Computing Application Development
============================================================================================
***
*/
