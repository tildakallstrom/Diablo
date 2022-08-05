package fundamentals.rpg_Characters;

import fundamentals.items.Slot;
import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.Weapon;
import fundamentals.items.weapons.WeaponType;

public class Rogue extends Hero{

    public Rogue(String name) {
        super(name,
                new Attributes(2, 6, 1),
                new WeaponType[]{WeaponType.Dagger, WeaponType.Sword},
                new ArmorType[]{ArmorType.Leather, ArmorType.Mail});
    }

    @Override
    public void levelUp() {
        super.levelUp();
        setBasePrimaryAttributes(new Attributes(
                getBasePrimaryAttributes().getStrength() + 1,
                getBasePrimaryAttributes().getDexterity() + 4,
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
