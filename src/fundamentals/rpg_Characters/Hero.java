package fundamentals.rpg_Characters;


import fundamentals.items.Slot;
import fundamentals.items.armor.Armor;
import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.Weapon;
import fundamentals.items.weapons.WeaponType;
import fundamentals.rpg_Characters.exceptions.InvalidArmorException;
import fundamentals.rpg_Characters.exceptions.InvalidWeaponException;

import java.util.Arrays;
import java.util.HashMap;

public abstract class Hero {
    private String name;
    private int level = 1;
    private Attributes basePrimaryAttributes;

    private WeaponType[] weapons;

    private ArmorType[] armors;

    private HashMap<Slot, Armor> equippedArmors = new HashMap<>();
    private HashMap<Slot, Weapon> equippedWeapon = new HashMap<>();
    protected Weapon weapon;

    public Hero(String name, Attributes basePrimaryAttributes, WeaponType[] weapons, ArmorType[] armors) {
        this.name = name;
        this.basePrimaryAttributes = basePrimaryAttributes;
        this.weapons = weapons;
        this.armors = armors;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Attributes getBasePrimaryAttributes() {
        return basePrimaryAttributes;
    }

    public void setBasePrimaryAttributes(Attributes attributes) {
        this.basePrimaryAttributes = attributes;
    }


    //get attributes from hero + from armors
    public Attributes totalAttributes() {
        int strength = 0;
        int dexterity = 0;
        int intelligence = 0;
        for(Slot slot : equippedArmors.keySet()) {
            Armor armor = equippedArmors.get(slot);
            strength += armor.getAttributes().getStrength();
            dexterity += armor.getAttributes().getDexterity();
            intelligence += armor.getAttributes().getIntelligence();
        }
        return new Attributes(
                strength + getBasePrimaryAttributes().getStrength(),
                dexterity + getBasePrimaryAttributes().getDexterity(),
                intelligence + getBasePrimaryAttributes().getIntelligence()
        );
    }

    public float characterDPS() { return 0; }

    public void levelUp() {
        // level up character
        level++;
    }

    //equip weapons
    public void equip(Weapon weapon) {
        //if it is the wrong weapontype
        if (!Arrays.asList(weapons).contains(weapon.getWeaponType())) {
            throw new InvalidWeaponException("This character cannot equip this weapon.");
        }
        //if character doesnt have the required level
        if(weapon.getRequiredLevel() > level) {
            throw new InvalidWeaponException("Your character have to be of the right level to equip this weapon.");
        }
        //put weapon in weapon slot
        equippedWeapon.put(Slot.Weapon, weapon);
        this.weapon = weapon;
    }

    //equip armor
    public void equipArmor(Armor armor) {
        if (!Arrays.asList(armors).contains(armor.getArmorType())) {
            throw new InvalidArmorException("This character cannot equip this armor.");
        }
        if(armor.getRequiredLevel() > level) {
            throw new InvalidArmorException("Your character have to be of the right level to equip this armor.");
        }
        equippedArmors.put(armor.getSlot(), armor);
    }

    public HashMap<Slot, Armor> getEquippedArmors() {
        return equippedArmors;
    }
    public HashMap<Slot, Weapon> getEquippedWeapon() {
        return equippedWeapon;
    }
}


