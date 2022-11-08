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