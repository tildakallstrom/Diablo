package fundamentals.rpg_Characters;

import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.WeaponType;

public class Ranger extends Hero{
    public Ranger(String name, int level) {
        super(name,
                level,
                new Attributes(1, 7, 1),
                new WeaponType[]{WeaponType.Bow},
                new ArmorType[]{ArmorType.Leather, ArmorType.Mail});
    }

    @Override
    public void levelUp() {
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 7,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }

    public float characterDPS() {
        if(weapon == null) {
            return (1 + totalAttributes().getDexterity() / 100f);
        } else {
            return weapon.getDPS() * (1 + totalAttributes().getDexterity() / 100f );
        }
    }
}
