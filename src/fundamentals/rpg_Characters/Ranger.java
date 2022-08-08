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
    //level up character and set new attributes
    public void levelUp() {
        super.levelUp();
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 5,
                getBasePrimaryAttributes().getIntelligence() + 1));
    }

    @Override
    //count characterDPS depending on wich weapon the character has
    public float characterDPS() {
        //if character has no weapon
        if(weapon == null) {
            return (1 + totalAttributes().getDexterity() / 100f);
        } else {
            return weapon.getDPS() * (1 + totalAttributes().getDexterity() / 100f );
        }
    }
}
