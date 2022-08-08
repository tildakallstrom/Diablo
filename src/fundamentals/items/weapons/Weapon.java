package fundamentals.items.weapons;
import fundamentals.items.Slot;
import fundamentals.items.armor.ArmorType;
import fundamentals.rpg_Characters.exceptions.InvalidWeaponException;

public class Weapon {

    private WeaponType weaponType;
    private String name;


    //required level for character to have this weapon
    private int requiredLevel;
    //where to put the weapon
    public Slot slot = Slot.Weapon;
    private int damage;
    private float attacksPerSecond;



    public Weapon(String name, int requiredLevel, WeaponType weapontype, int damage, int attacksPerSecond) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.weaponType = weapontype;
        if (damage < 0) {
            throw new InvalidWeaponException("A weapon must have damage");
        }
        this.damage = damage;
        if (attacksPerSecond < 0) {
            throw new InvalidWeaponException("A weapon must have at least 1 attack per second.");
        }
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

    public WeaponType getWeaponType() { return weaponType; }

}
