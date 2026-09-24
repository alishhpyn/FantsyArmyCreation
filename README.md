# FancyArmySystem


## Factory Method

Factory Method is used to create different army units.

* `Unit` - abstract base class.
* `Knight`, `Elf`, `Troll` - concrete units.
* `UnitCreator` - abstract creator.
* `KnightCreator`, `ElfCreator`, `TrollCreator` - create specific units.

## Abstract Factory

Abstract Factory is used to create related weapons and armor.

* `Weapon` and `Armor` - product interfaces.
* `Sword` and `Bow` - concrete weapons.
* `HeavyArmor` and `LightArmor` - concrete armor.
* `ArmyEquipmentFactory` - abstract factory.
* `KnightEquipmentFactory` and `ElfEquipmentFactory` - create equipment for each unit family.

## Clean Code

The project applies these principles:

1. **Meaningful Names** - methods and classes have clear names, such as `createUnit()`.
2. **Small Methods** - each factory method performs one task.
3. **Single Responsibility** - classes have separate responsibilities.
4. **Validated Construction** - the `Unit` constructor checks input values.
5. **No Magic Numbers** - unit health and damage values are stored in named constants.
