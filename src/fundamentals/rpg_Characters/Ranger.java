package fundamentals.rpg_Characters;

import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.WeaponType;

public class Ranger extends Hero{
    public Ranger(String name) {
        super(name,
                new Attributes(1, 7, 1),
                new WeaponType[]{WeaponType.Bow},
                new ArmorType[]{ArmorType.Leather, ArmorType.Mail});
    }

    @Override
    public void levelUp() {
        super.levelUp();
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 5,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }

    @Override
    public float characterDPS() {
        if(weapon == null) {
            return (1 + totalAttributes().getDexterity() / 100f);
        } else {
            return weapon.getDPS() * (1 + totalAttributes().getDexterity() / 100f );
        }
    }
}
