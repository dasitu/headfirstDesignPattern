package strategyPattern.characters;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Swing a Sword");
    }
}
