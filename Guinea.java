import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Province6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guinea extends africaProvinces
{
    GreenfootImage image = new GreenfootImage("Guinea_Image.png");
    /**
     * Act - do whatever the Province6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Guinea(int xlocation, int ylocation, int wood, int gold, int diamonds, Country owner) {
        super(xlocation, ylocation, wood, gold, diamonds, owner);
        setName("Guinea");
        image.scale(120, 60);
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
