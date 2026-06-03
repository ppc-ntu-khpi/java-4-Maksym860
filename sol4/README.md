[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24070152)

# 🐺 Практична робота «Реалізація успадкування» — Вовк

## Обрана тварина: Вовк (*Canis lupus*)

Вовк — соціальний хижак, що живе у зграях зі суворою ієрархією.  
Альфа керує зграєю, разом полюють на велику здобич, вовки виють для спілкування та позначають територію.

---

## Діаграма класів

```
┌─────────────────────────────────┐
│           Animal                │
│─────────────────────────────────│
│ # name    : String              │
│ # weight  : int                 │
│ # age     : int                 │
│─────────────────────────────────│
│ + eat()                         │
│ + speak()                       │
│ + sleep()                       │
│ + move()                        │
│ + toString() : String           │
└────────────────┬────────────────┘
                 │ extends
┌────────────────▼────────────────┐
│           Predator              │
│─────────────────────────────────│
│ # prey    : String              │
│─────────────────────────────────│
│ + hunt()                        │
│ + ambush()                      │
└────────────────┬────────────────┘
                 │ extends
┌────────────────▼────────────────┐
│          PackAnimal             │
│─────────────────────────────────│
│ # packName : String             │
│ # packSize : int                │
│─────────────────────────────────│
│ + huntWithPack()                │
│ + markTerritory()               │
└────────────────┬────────────────┘
                 │ extends
┌────────────────▼────────────────┐
│             Wolf                │
│─────────────────────────────────│
│ - rank     : String             │
│ - furColor : String             │
│─────────────────────────────────│
│ + howl()                        │
│ + playWithPups()                │
│ + dominance()                   │
│ + speak()    [override]         │
│ + eat()      [override]         │
│ + move()     [override]         │
│ + hunt()     [override]         │
└─────────────────────────────────┘
```

---

## Ієрархія класів

| Рівень | Клас | Що додає |
|--------|------|----------|
| 1 | `Animal` | `name`, `weight`, `age`; `eat`, `speak`, `sleep`, `move` |
| 2 | `Predator` | `prey`; `hunt`, `ambush` |
| 3 | `PackAnimal` | `packName`, `packSize`; `huntWithPack`, `markTerritory` |
| 4 | `Wolf` | `rank`, `furColor`; `howl`, `playWithPups`, `dominance` |

---

## Запуск

```bash
javac -d out src/domain/Animal.java src/domain/Predator.java \
             src/domain/PackAnimal.java src/domain/Wolf.java \
             src/test/TestAnimal.java
java -cp out test.TestAnimal
```

### Очікуваний вивід

```
=== W O L F ===
  Name   : Shadow
  Weight : 45 kg
  Age    : 5 years
  Prey   : elk
  Pack   : Iron Fang Pack (11 members)
  Rank   : Alpha
  Fur    : black

Shadow growls: Grrr... AWOOOO!
Shadow tears into fresh elk meat with the pack...
Shadow trots silently through the forest...
Shadow is sleeping...
Shadow (Alpha) leads the chase after elk!
Shadow is hiding in ambush, waiting for elk...
Shadow and the pack "Iron Fang Pack" (11 members) are hunting together!
Shadow is marking the territory of pack "Iron Fang Pack"...
Shadow raises its head and howls at the moon: AWOOOO!
Shadow (Alpha) is playing with the pups of pack "Iron Fang Pack"...
Shadow is the Alpha — stares down the pack with authority!
```

---

[![Gitter](https://badges.gitter.im/PPC-SE-2020/OOP.svg)](https://gitter.im/PPC-SE-2020/OOP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
