import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maghreb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maghreb extends africaProvinces
{
    GreenfootImage image = new GreenfootImage("Maghreb_Image.png");
    
    
    /**
     * Act - do whatever the Maghreb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Maghreb(int xlocation, int ylocation, int wood, int gold, int diamonds, Country owner) {
        super(xlocation, ylocation, wood, gold, diamonds, owner);
        image.scale(120, 60);
        setImage(image);
        setName("Maghreb");
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
