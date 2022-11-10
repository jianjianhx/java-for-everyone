# Chapter 12: Object-Oriented Design

## 12.1 Classes and Their Responsibilities

1. What is the rule of thumb for finding classes?

   Look for nouns in the problem description.
2. Your job is to write a program that plays chess. Might `ChessBoard` be an appropriate class? How about `MovePiece`?

   Yes for `ChessBoard` and no for `MovePiece`.
3. Suppose the invoice is to be saved to a file. Name a likely collaborator.

   `PrintStream`
4. Looking at the invoice in Figure 1, what is a likely responsibility of the `Customer` class?

   To produce the shipping address of the customer.
5. What do you do if a CRC card has ten responsibilities?

   Reword the responsibilities so that they are at a higher lever, or come up with more classes to handle the responsibilities.

## 12.2 Relationships Between Classes

6. Consider the `CashRegisterTester` class of Chapter 8. On which classes does it depend?

   The `CashRegisterTester` class depends on the `CashRegister` and `System` classes.
7. Consider the `Question` and `ChoiceQuestion` objects of Chapter 9. How are they related?

   The `ChoiceQuestion` class inherits from the `Question` class.
8. Consider the `Quiz` class described in Section 12.2.2. Suppose a quiz contains a mixture of `Question` and `ChoiceQuestion`. Which classes does the `Quiz` class depend on?

   The `Quiz` class depends on the `Question` class but probably not `ChoiceQuestion`, if we assume that the methods of the `Quiz` class manipulate generic `Question` objects, as they did in Chapter 9.
9. Why should coupling be minimized between classes?

   If a class doesn't depend on another, it is not affected by interface changes in the other class.
10. In an e-mail system, messages are stored in a mailbox. Draw a UML diagram that shows the appropriate aggregation relationship.

    `Mailbox` <>---- `Message`
11. You are implementing a system to manage a library, keeping track of which books are checked out by whom. Should the `Book` class aggregate `Patron` or the other way around?

    Typically, a library system wants to track which books a patron has checked out, so it makes more sense to have `Patron` aggregate `Book`. However, there is not always one true answer in design. If you feel strongly that it is important to identify the patron who checked out a particular book, then you can argue that the aggregation should go the other way around.
12. In a library management system, what would be the relationship between classes `Patron` and `Author`?

    There's no relationship.

## 12.3 Application: Printing an Invoice

13. Which class is responsible for computing the amount due? What are its collaborators for this task?

    The `Invoice` class is responsible for computing the amount due. It collaborates with the `LineItem` class.
14. Why do the format methods return `String` objects instead of directly printing to `System.out`?

    This design decision reduces coupling. It enables us to reuse the classes when we want to show the invoice in a dialog box or on a web page.
   
## 12.4 Packages

15. Which of the following are packages?
    1. java
    2. java.lang
    3. java.util
    4. java.lang.Math

    `java.lang` and `java.util`.
16. Is a Java program without `import` statements limited to using the default and `java.lang` packages?

    No, you can simply use fully qualified names for all other classes, such `java.util.Random` and `java.awt.Rectangle`.
17. Suppose your homework assignments are located in the directory `/home/me/cs101`. Your instructor tells you to place your homework into packages. In which directory do you place the class `hw1.problem1.TicTacToeTester`?

    `/home/me/cs101/hw1/problem1`.