package strategyPattern.characters;

public class King extends Character{

    public King(){
        weaponBehavior = new SwordBehavior();
    }
}
