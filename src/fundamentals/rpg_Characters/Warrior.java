package fundamentals.rpg_Characters;

import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.WeaponType;

public class Warrior extends Hero{

    public Warrior(String name, int level) {
        super(name,
                level,
                new Attributes(5, 2, 1),
                //which weapons this character can equip
                new WeaponType[]{WeaponType.Axe, WeaponType.Hammer, WeaponType.Sword},
                new ArmorType[]{ArmorType.Mail, ArmorType.Plate});
    }

    @Override
    public void levelUp() {
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 3,
                getBasePrimaryAttributes().getDexterity() + 2,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }

    public float characterDPS() {
        if(weapon == null) {
            return (1 + totalAttributes().getStrength() / 100f);
        } else {
            return weapon.getDPS() * (1 + totalAttributes().getStrength() / 100f );
        }
    }

}
