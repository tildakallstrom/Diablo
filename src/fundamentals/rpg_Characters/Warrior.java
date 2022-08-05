package fundamentals.rpg_Characters;

import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.WeaponType;

public class Warrior extends Hero{

    public Warrior(String name) {
        super(name,
                new Attributes(5, 2, 1),
                //which weapons this character can equip
                new WeaponType[]{WeaponType.Axe, WeaponType.Hammer, WeaponType.Sword},
                new ArmorType[]{ArmorType.Mail, ArmorType.Plate});
    }

    @Override
    public void levelUp() {
        super.levelUp();
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 3,
                getBasePrimaryAttributes().getDexterity() + 2,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }

    @Override
    public float characterDPS() {
        if(weapon == null) {
            return (1 + totalAttributes().getStrength() / 100f);
        } else {
            return weapon.getDPS() * (1 + totalAttributes().getStrength() / 100f );
        }
    }

}
