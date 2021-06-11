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

    public country owner; //france, england, null/uncolonized

    //resources
    int wood;
    int gold;
    int diamonds;
    int totalOutput = 0;
    
    public africaProvinces(int xlocation, int ylocation, int wood, int gold, int diamonds, country owner)
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
        if (owner == britain)
        {
            Cash(britain, totalOutput);
        }
    }
    public void calcCash()
    {
       int totalOutput = 2*wood + 4*gold + 6*diamonds;
    }
    
    public void bcashadd()
    {

    }
}
