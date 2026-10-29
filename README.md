# RPG Character Manager (Java)

A small **console-based Java project** for creating game characters, calculating their total power, and assigning a rarity tier.

## Features
- Create multiple characters from console input.
- Store each character's name, base power, and percentage-based item bonus.
- Calculate **total power = base power × (1 + bonus percentage / 100)**.
- Classify characters as **Common**, **Uncommon**, **Rare**, **Epic**, or **Legendary**.
- Track the total number of created characters using a static counter.

## OOP concepts
- Classes, objects, and constructors
- Private fields and public getters/setters (**encapsulation**)
- Static class-level state
- Instance methods and conditional branching
- Console input using `Scanner`

## Project files
- `GameCharacter.java` — character model, power calculation, rarity classification, and count.
- `Main.java` — interactive command-line application.

## Run
Requires a Java Development Kit (JDK).

```bash
javac GameCharacter.java Main.java
java Main
```

Enter the number of characters and then each character's name, base power, and item bonus percentage.

## Notes
This is an educational OOP exercise, not a full RPG game. It does not include combat, persistence, or a graphical interface. The source is preserved as submitted; input validation and automated tests are possible future improvements.
