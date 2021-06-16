import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Africa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class africaButton extends Buttons
{
    GreenfootImage image = new GreenfootImage("Africa_Provinces.png");
    
    /**
     * Act - do whatever the Africa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public africaButton() {
        image.scale(350, 350);
        setImage(image);
    }
    
    public void act() 
    {
        changeScreen();
    }
    public void changeScreen()
    {
        //MouseInfo var= Greenfoot.getMouseInfo;
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Africa());
        }
    }
}

