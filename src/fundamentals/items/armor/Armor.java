package fundamentals.items.armor;

public class Armor {
    private ArmorType armorType;
    private String name;
    private String slot;
    private int requiredLevel;

    public Armor(ArmorType armortype, String name, String slot, int RequiredLevel) {
        this.armorType = armortype;
        this.name = name;
        this.slot = slot;
        this.requiredLevel = requiredLevel;
    }

   //getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSlot() { return slot; }
    public void setSlot(String slot) { this.slot = slot; }

    public int getRequiredLevel() { return requiredLevel; }
    public void setRequiredLevel(int level) { this.requiredLevel = level; }

}
