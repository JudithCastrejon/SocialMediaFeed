/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmediafeed;

/**
 *
 * @author judithcastrejon
 * 
 */
public class User {
    
    //varibles/fields
    protected String name;
    
    /**
     * setting the parameter name equal to the private name variable 
     * @param name 
     */
    public User(String name){
        this.name = name;
    }
    
    /**
     * getting the name of the user
     * @return 
     */
    public String getName(){
        return name;
    }
    
    /**
     * setting the parameter name equal to private variable name 
     * @param name 
     */
    public void setName(String name){
        this.name = name;
    }
    
}
