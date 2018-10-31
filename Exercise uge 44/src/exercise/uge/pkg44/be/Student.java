/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.uge.pkg44.be;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nijashansen
 */
public class Student extends Person
{
    private String education;
    List<GradeInfo> gradeRecord = new ArrayList<>();

    public Student(int id, String name, String education)
    {
        super(id, name);
        this.education = education;
    }

    public String getEducation()
    {
        return education;
    }

    public List<GradeInfo> getGradeRecord()
    {
        return gradeRecord;
    }
    
}
