package socialmediafeed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author judithcastrejon
 * @version 1 -- 11-18-2020
 */
public class TextPost extends Post {
    
    //variables/fields
    private String text;

    /**
     * setting the text variable equal to the private text variable
     * @param text 
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * returning the text
     * @return 
     */
    public String getText() {
        return text;
    }
    
    
}
