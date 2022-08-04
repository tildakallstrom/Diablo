package fundamentals.items.weapons;

public class Weapon {
    private WeaponType weaponType;
    private String name;


    //required level for character to have this weapon
    private int requiredLevel;
    //where to put the weapon
    private String slot;

    private int damage;
    private int attacksPerSecond;


    public Weapon(String name, int requiredLevel, String slot, WeaponType weaponType, int damage, int attacksPerSecond) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
        this.weaponType = weaponType;
        this.damage = damage;
        this.attacksPerSecond = attacksPerSecond;
    }

    //getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRequiredLevel() { return requiredLevel; }
    public void setRequiredLevel(int level) { this.requiredLevel = level; }

    public String getSlot() { return slot; }
    public void setSlot(String slot) { this.slot = slot; }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public int getAttacksPerSecond() { return attacksPerSecond; }
    public void setAttacksPerSecond(int attacksPerSecond) { this.attacksPerSecond = attacksPerSecond; }


}
