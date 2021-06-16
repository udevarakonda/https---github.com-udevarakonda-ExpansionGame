import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Province7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WestSahel extends africaProvinces
{
    GreenfootImage image = new GreenfootImage("WestSahel_Image.png");
    /**
     * Act - do whatever the Province7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public WestSahel(int xlocation, int ylocation, int wood, int gold, int diamonds, Country owner) {
        super(xlocation, ylocation, wood, gold, diamonds, owner);
        setName("West Sahel");
        image.scale(170, 60);
        setImage(image);
    }
    
    public void act() 
    {
        setLocation(getX(), getY());
       int chance = Greenfoot.getRandomNumber(30);
        if (chance == 1) {
            cashAdd(1);
        }
         
       if (Greenfoot.mouseClicked(this))
        {
            showInfo();
        }
    }    
}
