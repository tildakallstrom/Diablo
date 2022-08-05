package fundamentals.items.armor;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {
    Armor testPlateBody = new Armor();
    testPlateBody.setName("Common Plate Body Armor");
    testPlateBody.setLevel(1);
    testplateBody.setSlot(Slot.BODY);
    testPlateBody.setArmorType(ArmorType.PLATE);
    testPlateBody.setAttributes(new PrimaryAttributes(1, 0, 0));
}