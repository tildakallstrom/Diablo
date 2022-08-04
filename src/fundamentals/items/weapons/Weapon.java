package fundamentals.items.weapons;
import fundamentals.items.Slot;
public class Weapon {

    private WeaponType weaponType;
    private String name;


    //required level for character to have this weapon
    private int requiredLevel;
    //where to put the weapon
    private Slot slot = Slot.Weapon;
    private int damage;
    private float attacksPerSecond;



    public Weapon(String name, int requiredLevel, WeaponType weaponType, int damage, int attacksPerSecond) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.weaponType = weaponType;
        this.damage = damage;
        this.attacksPerSecond = attacksPerSecond;
    }

    //getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRequiredLevel() { return requiredLevel; }
    public void setRequiredLevel(int level) { this.requiredLevel = level; }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public float getAttacksPerSecond() { return attacksPerSecond; }
    public void setAttacksPerSecond(float attacksPerSecond) { this.attacksPerSecond = attacksPerSecond; }

    public float getDPS() { return damage * attacksPerSecond; }


}
