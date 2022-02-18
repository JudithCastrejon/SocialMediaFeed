/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmediafeed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;
//importing to get the time
//import java.sql.Time;


/**
 *
 * @author smcleo12
 */
public class PostGenerator {
    
    private final ArrayList<User> users;
    private final Random rng;
    
    private File[] images;
    private String[] captions;
    private String[] texts;
    
    public PostGenerator(ArrayList<User> users)
    {
        // Assign users field
        this.users = users; 
        
        // Instantiate the Random object
        rng = new Random();
        
        
        /*
        Get the images, image captions, and texts        
        */
        
        // Get the images
        File imageDirectory = new File("resources/images/");
        images = imageDirectory.listFiles();
        
        // Strip off the 1st one because that's the caption file
        images = Arrays.copyOfRange(images, 1, images.length);
        
        // Get the captions
        captions = new String[images.length];
        try {
            Scanner scan = new Scanner(new File("resources/images/captions.txt"));
            for(int i=0;i<captions.length;i++)
            {
                captions[i] = scan.nextLine();
            }
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
        // Get the texts
        try {
            Scanner scan = new Scanner(new File("resources/text_posts.txt"));
            int count=0;
            while(scan.hasNextLine())
            {
                count++;
                scan.nextLine();
            }
            texts = new String[count];
            scan = new Scanner(new File("resources/text_posts.txt"));
            for(int i=0;i<count;i++)
            {
                texts[i] = scan.nextLine();
            }       
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

    public File[] getImages() {return images;}
    public void setImages(File[] images) {this.images = images;}

    public String[] getCaptions() {return captions;}
    public void setCaptions(String[] captions) {this.captions = captions;}
    
    public String[] getTexts() {return texts;}
    public void setTexts(String[] texts) {this.texts = texts;}

    
    /**
     * create a text post 
     * get the randomized sentence
     * @param date
     * @param time
     * @return  the text object
     */   
   public Post generateTextPost(String date, String time) {
       
       //displaying date and time 
      // System.out.println(date + " " + time);
       
       //creating random object 
       Random rand = new Random();
       //getting a random number from the length of the text_post.txt
       int i = rand.nextInt(texts.length);
       //printing out the random number as an index in the texts array
       //System.out.println(texts[i]);
       String text = texts[i];
       
       //making a text post object 
       TextPost txt = new TextPost();
       
       
       //setting and getting random index in text to the Textpost object 
       txt.getText();
       txt.setText(text);
       
       
     //returning the object txt
        return txt;
   }
    
    
    
    /**
     * create an image post 
     * getting the random image and corresponding caption
     * @param date
     * @param time
     * @return the image object
     * @throws IOException 
     */
    public Post generateImagePost(String date, String time) throws IOException {
       
  
   //creating random object
   Random rand = new Random();
   
   //getting the random number from the length of the images array 
   int i = rand.nextInt(images.length);
   //printing out the random number as a index in the images array and getting the caption of the image 
        System.out.println(images[i]);
       String cap = captions[i];
       
    
        //creating the image post object (image and caption)
        ImagePost ImageTxt = new ImagePost(ImageIO.read(images[i]),cap);
        
        ImageTxt.setImage(ImageIO.read(images[i]));
        ImageTxt.getImage();
        ImageTxt.setCaption(captions[i]);
        ImageTxt.getCaption();
        
        
        
        
    return ImageTxt;
   
   }
    
    
    
   
    /**
     * converts the number for a month into a string 
     * @param month
     * @return 
     */
    private String getMonthStr(int month){
        
        Random rando = new Random();
        //getting a random number between 1 - 12 for the 12 months of the year
        month = rando.nextInt( 12 - 1 + 1) +1;
        
        String getMonthStr = "null";
        //setting the random number to a swtich case for the monthe s
        switch (month) {
            case 1:
                getMonthStr = "Jan.";
                break;
            case 2:
                getMonthStr = "Feb.";
                break;
            case 3:
                getMonthStr = "Mar.";
                break;
            case 4:
                getMonthStr = "Apr.";
                break;
            case 5:
                getMonthStr = "May";
                break;
            case 6:
                getMonthStr = "June";
                break;
            case 7:
                getMonthStr = "July";
                break;
            case 8:
                getMonthStr = "Aug.";
                break;
            case 9:
                getMonthStr = "Sep.";
                break;
            case 10:
                getMonthStr = "Oct.";
                break;
            case 11:
                getMonthStr = "Nov.";
                break;
            case 12:
                getMonthStr = "Dec.";
                break;
            default:
                break;
        }
       
        return getMonthStr;
        
    }
    
    
    /**
     * creating a single randomized post object
     * create (just one) and return one randomized post 
     * randomized date and time
     * randomized type (image or text)
     *      - if image post then generateImagePost(date, time)
     *      - else if text post generateTextPost(date, time)
     * randomized user      
     * @return a single random post (either image or text post)
     * @throws java.io.IOException
     */
   public Post GeneratePost() throws IOException {
      
       /*
       Getting random time and date
       */
       
       //creating random object to get random time
        Random timeRand = new Random();
       
       //getting a random number between 1 and 12 for the hr
       int RandHr = timeRand.nextInt(12 -1 +1)+1;
        
       //setting the random time to a String 
       String Hr = String.valueOf(RandHr);
       
       //getting a random numnber between 1 and 60 for the minuties
       int RandMin = timeRand.nextInt(60 - 1 + 1)+1;
       //setting the random min to a string 
       String Min = String.valueOf(RandMin);
       
       //generating the random month 
      String month =  getMonthStr(1);
      
      //gernerating the random day 
      
      //getting a random number for the day of the month (between 1 and 28)
      int RandDay = timeRand.nextInt(28 - 1 +1)+ 1;
      //setting the random day to a string
      String day = String.valueOf(RandDay);
       
   
      
      //getting the random time using the hr and the minuties 
       String Time = (Hr + ":" + Min);
       
     //getting the random date using the month and day
       String Date = (month + ", " + day);
    
       
       
       
       
     /*
    Creating the random user 
     */
     
    //creatina new random object 
    Random RandUser = new Random();
    
    //getting size of the arraylist
    int i = RandUser.nextInt(users.size());
    
    //converting the index of the arraylist to a string for the name 
    
    //I struggled to figure out how to get the index of the arraylist to a string 
    String name2 = String.valueOf(users.indexOf(i));
    
     //String name = users.toString();
  
    
    //creating  random user objects 
     User RandomUser = new User(name2);
     RandomUser.getName();
     RandomUser.setName(name2);
     
     
       
     //randomized type --> imagePost or TextPost
     //creating random object to get the random type 
     Random typeRan = new Random();
     
     //getting a random number between 1 and 10 
     int randNum = typeRan.nextInt((10-1)+1)+1;
     
    
     //if the random number is less than 5 then generate a text post
     if (randNum >= 5){
       return generateTextPost(Date, Time);
       
     }
     //else (if the random number is greater than 10) then gernerate a image post 
     else {
         return generateImagePost(Date,Time);
        //throws IOException must be caught or thrown ERROR--------
     } 
       
     
   }
   
   
   /**
    * generates random number of Post objects, puts them into an array 
    * and returns the array
    * [post1, post2..., postNum]
    * calling the one that is creating the single post many times    
    * @param num
    * @return 
     * @throws java.io.IOException 
    */
    public Post[] generatePosts(int num) throws IOException{
       
        //creating a random object 
        Random random = new Random();
       //getting a random number between 1 and 8 
       //int randPost = random.nextInt((8 - 1) + 1) + 1;
        
        //declaring the array and initializing it with the random number
        Post [] SocialPost  = new Post[num];
      
        //looping through the array and adding a post for each element 
        for(int i = 0; i < SocialPost.length; i++ ){
          SocialPost[i] = GeneratePost();
        }
        
        
        
        return SocialPost;
   }
    
    
    
}
