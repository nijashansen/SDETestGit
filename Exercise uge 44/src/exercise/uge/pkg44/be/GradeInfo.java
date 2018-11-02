/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.uge.pkg44.be;

/**
 *
 * @author nijashansen
 */
public class GradeInfo
{
    private String subject;
    private double grade;

    public GradeInfo(String subject, double grade)
    {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject()
    {
        return subject;
    }

    public double getGrade()
    {
        return grade;
    }

    @Override
    public String toString()
    {
        return "GradeInfo{" + "subject=" + subject + ", grade=" + grade + '}';
    }
    
    
}
