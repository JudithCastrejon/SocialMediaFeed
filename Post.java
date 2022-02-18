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
public abstract class Post {
    //variables/ fields
    protected User user;
    private String date;
    private String time;
        
    
    /**
     * getting the date of the post
     * @return date
     */
     public String getDate() {
        return date;
    }

     /**
      * getting the time of the post
      * @return time
      */
     public String getTime(){
         return time;
     }

     /**
      * getting the date and time of the post
      * @return time and date
      */
     public String getDateAndTime(){
      
      return getDate() + getTime();
     }
     
     /**
      * getting the user of the post
      * @return user
      */
    public User getUser() {
        return user;
    }
    
    /**
     * setting the user variable in the parameter equal to the private user variable
     * @param user 
     */
    public void setUser(User user){
        this.user = user;
    }
     
    /**
     * setting the date variable in the parameter equal to the private date variable
     * @param date 
     */
    public void setDate(String date){
        this.date = date;
    }
    
    
    /**
     * setting the time variable in the parameter equal to the private time variable
     * @param time 
     */
    public void setTime(String time){
        this.time = time;
    }
      
     
}
