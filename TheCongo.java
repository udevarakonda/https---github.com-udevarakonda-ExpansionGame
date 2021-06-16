import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Province2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheCongo extends africaProvinces
{
    GreenfootImage image = new GreenfootImage("TheCongo_Image.png");
    /**
     * Act - do whatever the Province2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public TheCongo(int xlocation, int ylocation, int wood, int gold, int diamonds, Country owner) {
        super(xlocation, ylocation, wood, gold, diamonds, owner);
        setName("The Congo");
        image.scale(120, 200);
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
