import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class africaProvinces here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class africaProvinces extends Actor
{
    //location
    int xlocation;
    int ylocation;

    public String owner; //france, england, null/uncolonized

    //resources
    int wood;
    int gold;
    int diamonds;
    
    public africaProvinces(int xlocation, int ylocation, int wood, int gold, int diamonds, String owner)
    {
      this.xlocation = xlocation;
      this.ylocation = ylocation;
      this.wood = wood;
      this.gold = gold;
      this.diamonds = diamonds;
      this.owner = owner;
    }
    
    public void act() 
    {
        setLocation(xlocation, ylocation);
        calcCash();
    }
    public void calcCash()
    {
       //britainCash += 2(wood) += 4(gold) += 6(diamonds);
    }

}
