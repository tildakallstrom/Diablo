package fundamentals.items.armor;

import fundamentals.items.Slot;

public class Armor {
    private ArmorType armorType;
    private String name;
    private Slot slot;
    private int requiredLevel;

    public Armor(ArmorType armortype, String name, Slot slot, int RequiredLevel) throws Exception{
        this.armorType = armortype;
        this.name = name;
        this.slot = slot;
        //if armor is put in weapon, throw exception
        if(this.slot == Slot.Weapon) {
            throw new Exception("An armor cannot be a weapon.");
        }
        this.requiredLevel = requiredLevel;
    }

   //getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRequiredLevel() { return requiredLevel; }
    public void setRequiredLevel(int level) { this.requiredLevel = level; }

}
