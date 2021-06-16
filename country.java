import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class country here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Country extends Actor
{
    private int treasury = 0;
    private String color;
    private String name;
    
    /*
    public Country(int treasury, String color)
    {
        this.treasury = treasury;
        this.color = color;
    }
    */
    
    public Country() {
    }
    public void act() 
    {
        // Add your action code here.
    }
    
    public int getTreasury() {
        return treasury;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setTreasury(int amountToAdd) {
        treasury += amountToAdd;
    }
    
    public void changeTreasury(int changeToAmt) {
        treasury = changeToAmt;
    }

    public void Cash(String owner, int amtToAdd)
    {
        treasury += amtToAdd;
    }
}

