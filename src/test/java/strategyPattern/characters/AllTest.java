package strategyPattern.characters;

import org.junit.jupiter.api.Test;

class AllTest {

    @Test
    public void testKing() {
        King king = new King();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
    }

    @Test
    public void testKnight() {
        Knight knight = new Knight();
        knight.fight();
        knight.setWeaponBehavior(new KnifeBehavior());
        knight.fight();
    }
}