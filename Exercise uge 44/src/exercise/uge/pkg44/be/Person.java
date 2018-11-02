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
public class Person 
{
    private int id;
    private String name;
    private String email;

    
    /**
     * 
     * @param id
     * @param name 
     */
    public Person(int id, String name) {
        this(id, name, "");
    }

    /**
     * 
     * @param id
     * @param name
     * @param email 
     */
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    
    /**
     * 
     * @returns name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param sets the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return id  
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param sets id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @returns the variables to a string
     */
    @Override
    public String toString()
    {
        return "id=" + id + ", name= " + name + ", email= " + email;
    }
}
