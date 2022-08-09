package fundamentals.items.armor;

import fundamentals.items.Slot;
import fundamentals.rpg_Characters.Attributes;
import fundamentals.rpg_Characters.exceptions.InvalidArmorException;
import fundamentals.rpg_Characters.exceptions.InvalidWeaponException;

public class Armor {
    private ArmorType armorType;
    private String name;
    private Slot slot;
    private int requiredLevel;
    private Attributes attributes;

    public Armor(ArmorType armortype, String name, Slot slot, int requiredLevel, Attributes attributes) throws InvalidArmorException {
        this.armorType = armortype;
        this.name = name;
        this.slot = slot;
        //if armor is put in weapon, throw exception
        if (this.slot == Slot.Weapon) {
            throw new InvalidArmorException("An armor cannot be a weapon.");
        }
        this.requiredLevel = requiredLevel;
        this.attributes = attributes;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int level) {
        this.requiredLevel = level;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Slot getSlot() {
        return slot;
    }
}
