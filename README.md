The goal of this assignment is to refactor a monolithic game simulation into a well-structured, SOLID-compliant design by separating concerns, introducing abstractions, and ensuring maintainability.

Features
Combat System → Player & enemies fight using CombatSystem.
Items → Use ItemManager to pick up & apply items.
Level Up → LevelManager increases level, clears enemies, and awards score.
Inventory → Player can store and use items.


Project structure
src/
├── combat/         # Handles combat mechanics
├── enemies/        # Enemy types
├── items/          # Game items (HealthPotion, MagicScroll)
├── level/          # Level progression
├── player/         # Player state & inventory
├── score/          # Score tracking
└── Main.java   # Entry point
