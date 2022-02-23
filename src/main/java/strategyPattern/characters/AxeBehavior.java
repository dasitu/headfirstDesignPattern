package strategyPattern.characters;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Chopping with Axe");
    }
}
