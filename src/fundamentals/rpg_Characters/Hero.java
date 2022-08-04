package fundamentals.rpg_Characters;


import fundamentals.items.weapons.WeaponType;

public abstract class Hero {
    private String name;
    private int level;
    private Attributes basePrimaryAttributes;
    private Attributes totalPrimaryAttributes;

    private WeaponType[] weapons;

    public Hero(String name, int level, Attributes basePrimaryAttributes, Attributes totalPrimaryAttributes, WeaponType[] weapons) {
        this.name = name;
        this.level = level;
        this.basePrimaryAttributes = basePrimaryAttributes;
        this.totalPrimaryAttributes = totalPrimaryAttributes;
        this.weapons = weapons;
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
        return totalPrimaryAttributes;
    }

    public void setTotalPrimaryAttributes() {
        this.totalPrimaryAttributes = totalPrimaryAttributes;
    }


    public void levelUp() {}

}


