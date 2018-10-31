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
public class GradeInfo extends Student
{
    private String subject;
    private int grade;

    public GradeInfo(String subject, int grade, int id, String name, String education)
    {
        super(id, name, education);
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject()
    {
        return subject;
    }

    public GradeInfo(int grade, int id, String name, String education)
    {
        super(id, name, education);
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return "GradeInfo{" + "subject=" + subject + ", grade=" + grade + '}';
    }
    
    
}
