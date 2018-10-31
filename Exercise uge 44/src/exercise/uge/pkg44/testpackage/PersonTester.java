/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.uge.pkg44.testpackage;

import exercise.uge.pkg44.be.Person;
import exercise.uge.pkg44.be.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nijashansen
 */
public class PersonTester {
    
    List<Person> persons = new ArrayList<>();
    
   
    
        Person mads = new Person(1, "Mads");
        Person jens = new Person(2, "Jens");
        Person Kristian = new Person(3, "Kristian");
        
        Teacher lars = new Teacher(100, "Lars", "L");
        Teacher karl = new Teacher(101, "Karl", "K");
        Teacher bo = new Teacher(102, "Bo", "B");
    
    
    public void printPerson()
    {
        for (int i = 0; i < persons.size(); i++)
        {
            System.out.println(persons.get(i));
        }
    }
    

    public PersonTester()
    {
        mads.setEmail("mads@easv.dk");
        jens.setEmail("jens@easv.dk");
        Kristian.setEmail("kristian@easv.dk");
        lars.setEmail("lars@easv.dk");
        lars.setSalary(25.367);
        lars.addSubject("Programmer");
        karl.setEmail("karl@easv.dk");
        karl.setSalary(25.692);
        karl.addSubject("Data Manager");
        bo.setEmail("bo@easv.dk");
        bo.setSalary(28.293);
        bo.addSubject("CEO");
        persons.add(mads);
        persons.add(jens);
        persons.add(Kristian);
        persons.add(lars);
        persons.add(karl);
        persons.add(bo);
    }
}
