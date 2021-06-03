import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Americas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class americaButton extends Buttons
{
    /**
     * Act - do whatever the Americas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeScreen();
    }
    public void changeScreen()
    {
        //MouseInfo var= Greenfoot.getMouseInfo;
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new America());
        }
    }
}