package strategyPattern.characters;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Cutting with Knife");
    }
}
