# ConsoleLibrary

A console-based library management system built with Java to practice object-oriented programming (OOP), class design, inheritance, interfaces, and working with collections.

## About the Project

ConsoleLibrary simulates a simple library system where users can manage books and magazines, register library members, and handle borrowing and returning items through a command-line interface.

The project was created as a hands-on exercise to strengthen core Java skills and apply OOP principles in a practical application.

## Features

- **Library Item Management** — Work with different library items, including books and magazines.
- **Member Management** — Register and manage library members.
- **Borrow Items** — Allow members to borrow available library items.
- **Return Items** — Return borrowed items to the library.
- **Overdue Tracking** — Calculate overdue days for borrowed items.
- **Unique IDs** — Identify library items and members.
- **Input Handling** — Process user input through a console menu.

## Technologies Used

- **Java** — Core programming language.
- **Object-Oriented Programming** — Abstraction, inheritance, encapsulation, and polymorphism.
- **Java Collections** — Store and manage library data.
- **Java Time API** — Work with dates and calculate overdue periods.
- **Git and GitHub** — Version control and project hosting.

## Project Structure

The project is organized into classes, with each class responsible for a specific part of the library system.

- `Main` — Application entry point.
- `App` — Main application logic and console interaction.
- `Library` — Manages library items and members.
- `LibraryItem` — Abstract base class for library items.
- `Book` — Represents a book.
- `Magazine` — Represents a magazine.
- `Member` — Represents a library member.
- `Borrowable` — Interface for borrowing-related behavior.
- `Utils` — Helper methods for input handling and utility operations.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed.
- An IDE such as IntelliJ IDEA, or a terminal for compiling and running Java programs.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/krmall50/ConsoleLibrary.git
   ```

2. Open the project in your preferred Java IDE.

3. Make sure the JDK is configured correctly.

4. Run the `Main` class to start the application.

If you prefer to run it from the terminal, navigate to the directory containing the `.java` files and compile them:

```bash
javac *.java
```

Then run the application:

```bash
java Main
```

The terminal commands assume the source files are in the current directory and that the project does not require a package-specific directory structure or additional build configuration.

## Author

**GitHub:** [@krmall50](https://github.com/krmall50)
