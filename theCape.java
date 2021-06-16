import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class theCape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheCape extends africaProvinces
{
    GreenfootImage image = new GreenfootImage("TheCape_Image.png");
    public TheCape(int xlocation, int ylocation, int wood, int gold, int diamonds, Country owner) {
        super(xlocation, ylocation, wood, gold, diamonds, owner);
        setName("The Cape");
        image.scale(120, 120);
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
