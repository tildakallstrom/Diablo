package fundamentals.rpg_Characters;

import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.WeaponType;

public class Rogue extends Hero{

    public Rogue(String name, int level) {
        super(name,
                level,
                new Attributes(2, 6, 1),
                new WeaponType[]{WeaponType.Dagger, WeaponType.Sword},
                new ArmorType[]{ArmorType.Leather, ArmorType.Mail});
    }

    @Override
    public void levelUp() {
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 4,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }
}
