# Diablo

This projects contains a console app created with Java which contains characters from the game Diablo - Mages, Rangers, Rogues and Warriors. It also includes Items - Armors and Weapons of different types which can be equipped in different slots and equipped by different characters of different levels.

## Creator
This project was created by Tilda Källström @tildakallstrom and was completed August 2022. IntelliJ and JUnit 5.8.1 was used to create this project.

## Background

This is a console application for the first assignment of the Java course at Noroff. The task consisted of building a console application in Java. This app has four classes that a character/hero can be; Mage, Ranger, Rogue and Warrior. 
### Mage:
The Mage begins att level 1 with:
- Strength 1
- Dexterity 1
- Intelligence 8
Mages deal increased damage for every point of intelligence. With every level Mage gains:
- Strength 1
- Dexterity 1
- Intelligence 5
A Mage can equip the following weapons:
- Staff
- Wand
And The following armors:
- Cloth

### Ranger:
The Mage begins att level 1 with:
- Strength 1
- Dexterity 7
- Intelligence 1
  Rangers deal increased damage for every point of dexterity. With every level Ranger gains:
- Strength 1
- Dexterity 5
- Intelligence 1
  A Ranger can equip the following weapons:
- Bow
  And The following armors:
- Leather
- Mail

### Rogue:
The Rogue begins att level 1 with:
- Strength 2
- Dexterity 6
- Intelligence 1
  Rogues deal increased damage for every point of dexterity. With every level Rogue gains:
- Strength 1
- Dexterity 4
- Intelligence 1
  A Rogue can equip the following weapons:
- Dagger
- Sword
  And The following armors:
- Leather
- Mail

### Warrior:
The Warrior begins att level 1 with:
- Strength 5
- Dexterity 2
- Intelligence 1
  Warrior deal increased damage for every point of strength. With every level Warrior gains:
- Strength 3
- Dexterity 2
- Intelligence 1
  A Warrior can equip the following weapons:
- Axe
- Hammer
- Sword
  And The following armors:
- Mail
- Plate

### Slot:
There are different slots for weapons and armors. The weapons can only be equipped in the weapon slot and the armors can be equipped in head, body and legs.


### Requirements

The minimum requirements for this assignment is:
- Various character classes having attributes which increase at different rates as the character gains levels.
- Equipment, such as armor and weapons, that characters can equip. The equipped items will alter the power of
the character, causing it to deal more damage and be able to survive longer. Certain characters can equip
certain item types.
- Custom exceptions. There are two custom exceptions you are required to write, as detailed in Appendix B.
- Full test coverage of the functionality. 

## Use this project

- Install JDK 17
- The project should run in IntelliJ or Eclipse
- Clone repository and create a new project with the git pull method
- Use the folder "test" to run the tests for the code, in IntelliJ - rightclick the testfolder and "Run all tests"


## Testing
The test-folder contains testing for the functionality in the code. It includes tests that show that the levelUp function works correctly, that the characterDPS is correct etc.


