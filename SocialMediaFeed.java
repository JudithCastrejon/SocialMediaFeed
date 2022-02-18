/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmediafeed;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;


/**
 *
 * @author smcleo12
 * @version 1 -11-29-2020
 */
public class SocialMediaFeed {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        /*
            1. Create some User objects...        
        */
        
        User U1 = new User("Judy");
        User U2 = new User("Andres");
        User U3 = new User("Juan");
        User U4 = new User("Sandy");
        
        /*
            2. Put the User objects into an ArrayList        
        */
        
        ArrayList<User> users = new ArrayList<>();
        users.add(U1);
        users.add(U2);
        users.add(U3);
        users.add(U4);
        
        /*
            3. Use your PostGenerator class to create posts from the users            
        */   
        
       PostGenerator gen = new PostGenerator(users);
       
       
       
     //creating a random object 
        Random random = new Random();
       //getting a random number between 1 and 8 
       int randPost = random.nextInt((8 - 1) + 1) + 1;
        
        Post [] p = gen.generatePosts(randPost);
        
        
        /*
            Create the GUI window
            DO NOT ADD OR CHANGE CODE BELOW THIS POINT EXCEPT WHERE SPECIFIED        
        */
        Window myGUI = new Window();
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGUI.pack();
        myGUI.setVisible(true);
        
        // ADD YOUR ARRAY OF POSTS AS AN ARGUMENT TO THIS METHOD CALL
       myGUI.displayPosts(p) ;
    }
    
}