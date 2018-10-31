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
public class Teacher extends Person
{
    
    private String initials;
    private Double salary;
    List<String> subjects = new ArrayList<>();
    
    public Teacher(int id, String name, String initials)
    {
        super(id, name);
        this.initials = initials;
    }
    
    public ArrayList<String> getSubjects()
    {
        return getSubjects();
    }

    public String getInitials()
    {
        return initials;
    }

    public Double getSalary()
    {
        return salary;
    }
    
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Teacher{" + super.toString() + "initials=" + initials + ", salary=" + salary + ", subjects=" + subjects + '}';
    }
    
    
}
