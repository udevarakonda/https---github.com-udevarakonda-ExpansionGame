

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Africa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Africa extends World
{
    AmericaCountry america = new AmericaCountry();
    FranceCountry france = new FranceCountry();
    RussiaCountry russia = new RussiaCountry();
    BritainCountry britain = new BritainCountry();
    
    TheCape theCape = new TheCape(280, 327, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, russia);
    TheCongo theCongo = new TheCongo(280, 250, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, britain);
    GreatValley greatValley = new GreatValley(350, 255, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, america);
    TheHorn theHorn = new TheHorn(350, 170, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, france);
    Nigeria nigeria = new Nigeria(10, 10, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, russia);
    Guinea guinea = new Guinea(10, 10, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, britain);
    WestSahel westSahel = new WestSahel(10, 10, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, america);
    EastSahel eastSahel = new EastSahel(10, 10, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, france);
    Egypt egypt = new Egypt(10, 10, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, america);
    Maghreb maghreb = new Maghreb(10, 10, Greenfoot.getRandomNumber(20) + 10, Greenfoot.getRandomNumber(10) + 7, Greenfoot.getRandomNumber(5) + 3, russia);
    
    /**
     * Constructor for objects of class Africa.
     * 
     */
    
    public Africa()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void actProvinces() {
        theCape.act();
        theCongo.act();
        greatValley.act();
        theHorn.act();
        nigeria.act();
        guinea.act();
        westSahel.act();
        eastSahel.act();
    }
    
    public void act()
    {
        actProvinces();
        
        int chance = Greenfoot.getRandomNumber(50);
        if (chance == 13) {
          prepareForColonization(Greenfoot.getRandomNumber(4) + 1, Greenfoot.getRandomNumber(10) + 1);  
        }
        
        updateScreen();
        
        if (america.getTreasury() < 0) {
            america.changeTreasury(0);
        }
        if (france.getTreasury() < 0) {
            france.changeTreasury(0);
        }
        if (britain.getTreasury() < 0) {
            britain.changeTreasury(0);
        }
        if (russia.getTreasury() < 0) {
            russia.changeTreasury(0);
        }
    }
    
    public void prepare() {
        addObject(maghreb, 0, 0);
        addObject(eastSahel, 0, 0);
        addObject(westSahel, 0, 0);
        addObject(egypt, 0, 0);
        addObject(greatValley, 0, 0);
        addObject(guinea, 0, 0);
        addObject(nigeria, 0, 0);
        addObject(theCongo, 0, 0);
        addObject(theHorn, 0, 0);
        addObject(theCape, 0, 0);
    }
    
    public void showInfo(int provinceNumber) {
        
    }
    
    public void prepareForColonization(int CountryID, int ProvinceID) {
        if (CountryID == 1 && ProvinceID == 1) {
            colonize(america, theCape);
        }
        
        else if (CountryID == 1 && ProvinceID == 2) {
            colonize(america, theCongo);
        }
        
        else if (CountryID == 1 && ProvinceID == 3) {
            colonize(america, greatValley);
        }
        
        else if (CountryID == 1 && ProvinceID == 4) {
            colonize(america, theHorn);
        }
        
        else if (CountryID == 1 && ProvinceID == 5) {
            colonize(america, nigeria);
        }
        
        else if (CountryID == 1 && ProvinceID == 6) {
            colonize(america, guinea);
        }
        
        else if (CountryID == 1 && ProvinceID == 7) {
            colonize(america, westSahel);
        }
        
        else if (CountryID == 1 && ProvinceID == 8) {
            colonize(america, eastSahel);
        }
        
        else if (CountryID == 2 && ProvinceID == 1) {
            colonize(britain, theCape);
        }
        
        else if (CountryID == 2 && ProvinceID == 2) {
            colonize(britain, theCongo);
        }
        
        else if (CountryID == 2 && ProvinceID == 3) {
            colonize(britain, greatValley);
        }
        
        else if (CountryID == 2 && ProvinceID == 4) {
            colonize(britain, theHorn);
        }
        
        else if (CountryID == 2 && ProvinceID == 5) {
            colonize(britain, nigeria);
        }
        
        else if (CountryID == 2 && ProvinceID == 6) {
            colonize(britain, guinea);
        }
        
        else if (CountryID == 2 && ProvinceID == 7) {
            colonize(britain, westSahel);
        }
        
        else if (CountryID == 2 && ProvinceID == 8) {
            colonize(britain, eastSahel);
        }
        
        else if (CountryID == 3 && ProvinceID == 1) {
            colonize(russia, theCape);
        }
        
        else if (CountryID == 3 && ProvinceID == 2) {
            colonize(france, theCongo);
        }
        
        else if (CountryID == 3 && ProvinceID == 3) {
            colonize(france, greatValley);
        }
        
        else if (CountryID == 3 && ProvinceID == 4) {
            colonize(france, theHorn);
        }
        
        else if (CountryID == 3 && ProvinceID == 5) {
            colonize(france, nigeria);
        }
        
        else if (CountryID == 3 && ProvinceID == 6) {
            colonize(france, guinea);
        }
        
        else if (CountryID == 3 && ProvinceID == 7) {
            colonize(france, westSahel);
        }
        
        else if (CountryID == 3 && ProvinceID == 8) {
            colonize(france, eastSahel);
        }
        
        else if (CountryID == 4 && ProvinceID == 1) {
            colonize(russia, theCape);
        }
        
        else if (CountryID == 4 && ProvinceID == 2) {
            colonize(russia, theCongo);
        }
        
        else if (CountryID == 4 && ProvinceID == 3) {
            colonize(russia, greatValley);
        }
        
        else if (CountryID == 4 && ProvinceID == 4) {
            colonize(russia, theHorn);
        }
        
        else if (CountryID == 4 && ProvinceID == 5) {
            colonize(russia, nigeria);
        }
        
        else if (CountryID == 4 && ProvinceID == 6) {
            colonize(russia, guinea);
        }
        
        else if (CountryID == 4 && ProvinceID == 7) {
            colonize(russia, westSahel);
        }
        
        else if (CountryID == 4 && ProvinceID == 8) {
            colonize(russia, eastSahel);
        }
        
        else if (CountryID == 1 && ProvinceID == 9) {
            colonize(america, egypt);
        }
        else if (CountryID == 2 && ProvinceID == 9) {
            colonize(britain, egypt);
        }
        else if (CountryID == 3 && ProvinceID == 9) {
            colonize(france, egypt);
        }
        else if (CountryID == 4 && ProvinceID == 9) {
            colonize(russia, egypt);
        }
        
        else if (CountryID == 1 && ProvinceID == 10) {
            colonize(america, maghreb);
        }
        
        else if (CountryID == 2 && ProvinceID == 10) {
            colonize(britain, maghreb);
        }
        
        else if (CountryID == 3 && ProvinceID == 10) {
            colonize(france, maghreb);
        }
        
        else if (CountryID == 4 && ProvinceID == 10) {
            colonize(russia, maghreb);
        }
        
        
    }
    
    public void updateScreen() {
        showText("Russia: " + russia.getTreasury(), 500, 20);
        showText("America: " + america.getTreasury(), 500, 70);
        showText("France: " + france.getTreasury(), 500, 120);
        showText("Britain: " + britain.getTreasury(), 500, 170);
    }
    
    public void colonize(Country aggressor, africaProvinces province) {
        if (aggressor.getName().equals(province.getOwner().getName())) {
            return;
        }
        
        aggressor.setTreasury(-5);
        province.getOwner().setTreasury(-2);
        
        if (aggressor.getTreasury() > province.getOwner().getTreasury()) {
            int chance = Greenfoot.getRandomNumber(100);
            if (chance < 50) {
                province.changeOwner(aggressor);
                showText(aggressor.getName() + " colonizes " + province.getName(), 450, 300);
            }
            
            else {
                aggressor.setTreasury(-2);
                showText(province.getName() + " defeats " + aggressor.getName(), 450, 350);
            }
            
        }
        
        else {
            int chance = Greenfoot.getRandomNumber(100);
            if (chance < 25) {
                province.changeOwner(aggressor);
                showText(aggressor.getName() + " colonizes " + province.getName(), 450, 300);
            }
            
            else {
                aggressor.setTreasury(-1);
                showText(province.getName() + " defeats " + aggressor.getName(), 450, 350);
            }
        }
    }
    
}
