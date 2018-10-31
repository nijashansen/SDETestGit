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
        persons.add(mads);
    }
}
