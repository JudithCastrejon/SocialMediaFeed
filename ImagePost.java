package socialmediafeed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Image;

/**
 *
 * @author judithcastrejon
 * @version 1 -- 11-28-2020
 */
public class ImagePost extends Post  {
    
    private Image image;  
    private String caption;

    
    
    public ImagePost(Image image, String caption) {
        this.image = image;
        this.caption = caption;
    }
 
    
    
    /**
     * getting the caption of the image
     * @return 
     */
    public String getCaption() {
        return caption;
    }

    /**
     * setting the caption parameter equal to private caption variable 
     * @param caption 
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }
    
    /**
     * 
     * @return 
     */
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image 
     */
    public void setImage(Image image) {
        this.image = image;
    }
    

   
    
}
