package strategyPattern.characters;

public class Knight extends Character{

    public Knight(){
        weaponBehavior = new SwordBehavior();
    }
}
