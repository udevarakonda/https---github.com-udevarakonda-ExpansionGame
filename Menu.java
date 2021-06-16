import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(message, 300, 50);
        addObject(africa, 300, 225);
        //addObject(america, 420, 200);
    }
    private Actor africa = new africaButton();
    private Actor america = new americaButton();
    private Actor message = new Text();
    
 
// and with a method to update it image
    public void setMessage(String text)
    {
    GreenfootImage image = null;
    if (text != null && !"".equals(text)) image = new GreenfootImage(text, 45, Color.RED, new Color(0,0,0));
    message.setImage(image);
    
}
    public void act() 
    {
        setMessage("The Scramble");
    }
}

    //phases to colonization of province: stage 1 is establishment
    //stage two is garrisons
    //stage three is administration: will develop into colony in x secs

    //turn based
    
    //both establish(stage 1)
    //for stage two, they both keep investing into garrisons.
    //for stage three to start for one side their garrison must be 1/3 larger
