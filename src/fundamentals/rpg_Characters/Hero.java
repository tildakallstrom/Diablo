package fundamentals.rpg_Characters;


import fundamentals.items.armor.ArmorType;
import fundamentals.items.weapons.WeaponType;

public abstract class Hero {
    private String name;
    private int level;
    private Attributes basePrimaryAttributes;

    private WeaponType[] weapons;

    private ArmorType[] armors;

    public Hero(String name, int level, Attributes basePrimaryAttributes, WeaponType[] weapons, ArmorType[] armors) {
        this.name = name;
        this.level = level;
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

    public Attributes getTotalPrimaryAttributes() {
        return basePrimaryAttributes;
    }

    public void setTotalPrimaryAttributes() {
        this.basePrimaryAttributes = basePrimaryAttributes;
    }


    public void levelUp() {}

}


