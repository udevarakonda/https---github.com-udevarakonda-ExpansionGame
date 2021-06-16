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
    private int xlocation;
    private int ylocation;

    private int CountryID;
    private Country owner; //france, england, null/uncolonized
    private String name;

    //resources
    private int wood;
    private int gold;
    private int diamonds;
    private int totalOutput = 0;
    
    public africaProvinces(int xlocation, int ylocation, int wood, int gold, int diamonds, Country owner)
    {
      this.xlocation = xlocation;
      this.ylocation = ylocation;
      this.wood = wood;
      this.gold = gold;
      this.diamonds = diamonds;
      this.owner = owner;
      setLocation(xlocation, ylocation);
      cashAdd(calcCash());
    }
    
    public int getWood() {
        return this.wood;
    }
    
    public int getGold() {
        return this.gold;
    }
    
    public int getDiamonds() {
        return this.diamonds;
    }
    
    public Country getOwner() {
        return this.owner;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public int getX() {
        return xlocation;
    }
    
    public int getY() {
        return ylocation;
    }
    
    public int calcCash()
    {
       return 2*wood + 4*gold + 6*diamonds;
    }
    
    public void cashAdd(int amtToAdd)
    {
        owner.setTreasury(amtToAdd);
    }
    
    public void changeOwner(Country newOwner) {
        owner = newOwner;
    }
    
    public void showInfo() {
        getWorld().showText("Name: " + getName(), 100, 250); 
        getWorld().showText("Owner: " + owner.getName(), 100, 275);
        getWorld().showText("Wood: " + this.wood, 100, 300);
        getWorld().showText("Gold: " + this.gold, 100, 325);
        getWorld().showText("Diamonds: " + this.diamonds, 100, 350);
    }
    
}
