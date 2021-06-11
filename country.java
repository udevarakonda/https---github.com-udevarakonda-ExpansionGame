import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class country here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class country extends Actor
{
    public int treasury;
    String color;
    
    public country(int treasury, String color)
    {
        this.treasury = treasury;
        this.color = color;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void Cash(String owner, int amtToAdd)
    {
            treasury += amtToAdd;
    }
}

