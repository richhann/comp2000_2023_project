# comp2000_2023_project

This document outlines the requirements and tasks for a creative project worth 60% of a unit's total grade. The project involves several components:

1. **In-class Activities:** 12%
2. **Milestone 1:** 8%
3. **Milestone 2:** 20%
4. **Viva Exam:** 20%

The focus here is on **Milestone 2**, which has a due date of October 22, 2023, at 11:55 pm. It builds upon the work done in Milestone 1 and introduces new features and design patterns into an inventory management system.

### Main Changes Since Milestone 1

1. **Exceptions and UI:** When an exception is thrown, the UI will display a popup error message for the user. Developers are encouraged to catch exceptions but re-throw them for UI visibility.

2. **Items, ItemDefinitions, and ItemDictionary:** Items of the same kind share common attributes in the `ItemDefinition` class. These definitions are stored in the `ItemDictionary`, which is a singleton for looking up item definitions.

3. **Player Weight Limit and Storage:** Players can only carry a certain weight. Items not needed by the player can be stored in the storage without a weight limit. Players can retrieve items from storage as long as it doesn't exceed their weight limit.

### Task 1 - Behavioral (Choice of Design Pattern)

**Option 1: Strategy Pattern - Item Searching (40 to 80 lines of code)**

- Improve the item searching and sorting code, which is currently not well-written.
- Modify the code for item searching, particularly the `searchItems(String)` method in `Inventory.java`.
- Update the GUI's search and sorting buttons to facilitate the implementation of the strategy pattern.

**Option 2: Observer Pattern - Storage Updates (20 to 50 lines of code)**

- Implement the Observer (Pub-Sub) pattern to handle updates in a multi-player scenario where players share the same storage box.
- Ensure that each player has their own copy of storage, and updates to storage are communicated to all players.

### Task 2 - Structural (Composite Pattern)

Use the **Composite Pattern** to handle crafting and uncrafting of items:

- **Base Items:** Standalone items with their own weight.
- **Craftable Items:** Composed of other craftable items and/or base items, with weight as the sum of constituent items.
- Implement crafting and uncrafting functionality in the GUI using the `Craft` and `Uncraft` buttons.

### Task 3 - Improvements of Your Choice

Make at least two improvements of your choice to the application, focusing on topics and techniques covered in the lectures and in-class exercises, such as interfaces, generics, exceptions, lambdas, and design patterns. Your changes should include documentation explaining:

- What you changed.
- Why you made those changes.
- How your changes enhance code quality, fix bugs, or improve the application.

### Documentation

Document your work inside the `Documentation.md` file found in the `docs` directory, including:

- The design pattern you chose for Task 1.
- Specific files modified for both Tasks 1 and 2.
- Details of what you changed, why, and the benefits of your changes for Task 3.

### Submission

Submit a zipped VSCode project, ensuring that unnecessary temporary files are excluded from the zip file.

### Important Notes

- Milestone 2 and the Viva are considered a single assessment.
- If you don't submit a reasonable attempt at Milestone 2, you cannot sit the Viva.
- Adherence to academic integrity is crucial for the Viva component.
- Failure to list and describe code changes for any task will result in those tasks not being marked.
