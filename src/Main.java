import fundamentals.items.Slot;
import fundamentals.items.weapons.Weapon;
import fundamentals.items.weapons.WeaponType;
import fundamentals.rpg_Characters.Hero;
import fundamentals.rpg_Characters.Mage;
import fundamentals.rpg_Characters.Ranger;
import fundamentals.rpg_Characters.Rogue;

import static fundamentals.items.weapons.WeaponType.Dagger;

public class Main {
    public static void main(String[] args) {
        Weapon axe = new Weapon("axe", 1, Dagger, 2, 2);
        Hero hero = new Rogue("hej" );

        hero.equip(axe);
        System.out.println(axe.getDPS());
       // hero.levelUp();


        String heroDisplay = String.format("Character name: %s, Level: %s, Strength: %s, Dexterity: %s, Intelligence: %s, DPS: %s",
                hero.getName(),
                hero.getLevel(),
                hero.getBasePrimaryAttributes().getStrength(),
                hero.getBasePrimaryAttributes().getDexterity(),
                hero.getBasePrimaryAttributes().getIntelligence(),
                hero.characterDPS());

        System.out.println(heroDisplay);
    }

    //String heroDisplay = String.Format("Character name: %s, Level: %s", hero.getName(), hero.getLevel());



}
