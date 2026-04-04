# Java Learning Journey

Daily Java programming exercises and challenges.

## Day 1
- Hello World program

## Day 2  
- Square pattern (for), Right angle (while), Inverted right angle (do-while)
- Age check (if), Even/odd (if-else)

## Day 3
- Switch statement, break/continue
- Else-if ladder, for-each loop

## Day 4
- Method creation/parameters/returns
- Add, Multiply, Greet programs

## Day 5
- Classes and objects
- Encapsulation (private fields/getters)
- Inheritance (extends keyword)
- Student, BankAccount, Animal-Dog programs

## Day 6
- Simple Interest calculator
- Swap two numbers 
- Factorial using for loop
- Reverse a number (modulo)
- Palindrome number check
- Prime number verification
- Armstrong number program
- Fibonacci series generation
- Largest of three numbers comparison
- Basic Calculator

## Day 7
- Advanced Calculator project upgrade
- OOP class with 6 math methods
- do-while loop for continuous operation
- Exception handling (division by zero, invalid input)
- Enhanced user interface with menu

## Day 8
- Inheritance (Vehicle → Car class)
- Method overriding (Shape hierarchy)
- Method overloading (MathOps multiply variants)
- Runtime polymorphism (Shape references)
- Compile-time polymorphism examples

## Day 9
- Method overloading practice (compile-time polymorphism)
- Method overriding practice (runtime polymorphism) 
- Context-based method resolution
- Multiple program variations testing flexibility
- Real-world polymorphism application understanding

## Day 10
- Employee/Developer: static company + super() + method overriding
- Person/Student: super constructor & super method calls
- Constructor chaining using this()
- Static college variable shared across Student objects

## Day 11 - Basic OOP Diary
├── DiaryEntry.java (parent class + constructor)
├── SadPoem.java (inheritance + override)
└── DiaryApp.java (user input + polymorphism)

## Day 12- MusicPlayer - Simple Interface Demo
**Files:**
- Playable.java (interface)
- MP3Player.java (implementation)
- MusicApp.java (demo)
**Compile:** `javac *.java`  
**Run:** `java MusicApp`
**Output:**
Playing MP3 file
MP3 stopped


## Day 13- PoetTypewriter - Multithreaded Poetry Animation
**Live typewriter effect** with parallel cursor animation.
## Code Structure
3 Classes:
├── Typewriter (extends Thread) - 100ms per character
├── CursorBlinker (extends Thread) - 300ms spaces
└── PoetTypewriter (main) - launches both threads
## How It Works
- **Typewriter thread**: Prints poem char-by-char (100ms delay)
- **Cursor thread**: Prints spaces simultaneously (300ms delay)  
- **Interleaved output** creates live typing effect

# Day 14- Java Types of Inheritance 
## 5 Working Programs
**1. Single Inheritance**
Poem → Haiku
javac SingleInheritanceDemo.java
java SingleInheritanceDemo
**2. Multilevel Inheritance**  
Writer → Poet → GhazalPoet
javac MultilevelInheritanceDemo.java
java MultilevelInheritanceDemo
**3. Hierarchical Inheritance**
Instrument ← Guitar, Drum
javac HierarchicalInheritanceDemo.java
java HierarchicalInheritanceDemo
**4. Multiple Inheritance** (Interface)
Singer + WriterSkill → Artist
javac MultipleInheritanceDemo.java
java MultipleInheritanceDemo
**5. Hybrid Inheritance** (Class + Interface)
Person → CreativePerson + Dancer + Painter
javac HybridInheritanceDemo.java
java HybridInheritanceDemo
## All programs tested & runnable
- Each has proper main() method
- Single public class per file  
- Java-compatible multiple/hybrid via interfaces

# Day 15 - Bank Account with File IO (java.io)
**Complete banking system with persistent data storage.**
## Features
Account class:
├── deposit() - add money
├── withdraw() - remove money
├── getBalance() - check funds
└── File IO - save/load account.txt
## Menu
1=Deposit 2=Withdraw 3=Balance 4=Save 5=Load 0=Exit
## File Handling
**PrintWriter** → saves name + balance to `account.txt`
**Scanner + File** → loads account data on restart
## Demo Flow
Deposit 500 → Balance: 1500 → Save → Restart
Load → Balance: 1500 (persists!)
## Tech Stack
java.io.*
├── PrintWriter (write)
├── Scanner + File (read)
├── try-with-resources (auto-close)
└── Exception handling
## Run
javac BankAccountIO.java
java BankAccountIO
**Creates account.txt** - data survives program restart!


# Day 16 - Library Management System
Interactive library with complete exception handling.
## Exception Types
- BookNotFoundException (custom)
- NumberFormatException (invalid ID input)
- Array bounds validation
- Input sanitization
## Features
- Issue/return books
- Real-time inventory
- Error-safe user input
## Run
javac LibraryDemo.java
java LibraryDemo
