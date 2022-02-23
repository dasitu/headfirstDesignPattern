package strategyPattern.characters;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

}
