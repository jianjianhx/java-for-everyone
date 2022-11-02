# Chapter 10 Graphical User Interface

## 10.1 Frame Windows

1. How do you display a square frame with a title bar that reads "Hello, World!"?

   ```java
   // ...
   frame.setSize(300, 300);
   frame.setTitle("Hello, World!");
   ```
2. How can a program display two frames at once?

   ```java
   JFrame frame1 = new JFrame();
   JFrame frame2 = new JFrame();
   // ...
   frame1.setVisible(true);
   frame2.setVisible(true);
   ```
3. How can a program show a frame with two buttons labeled Yes and No?

   ```java
   // ...
   panel.add(new JButton("Yes"));
   panel.add(new JButton("No"));
   frame.add(panel);
   // ...
   ```
4. Why does the `FilledFrameViewer2` class declare the frame variable to have class `JFrame`, not `FilledFrame`?

   There was no need to invoke any methods that are specific to `FilledFrame`. It is always a good idea to use the most general type when declaring a variable.
5. How many Java source files are required by the application in Section 10.1.3 when we use inheritance to declare the frame class?

   Two: FilledFrameViewer2, FilledFrame.
6. Why does the `createComponents` method of `FilledFrame` call `add(panel)`, whereas the main method of `FilledFrameViewer` calls `frame.add(panel)`?

   Because `add` is a method of `FilledFrame` inherited from `JFrame`.

## 10.2 Events and Events Handling

7. Which objects are the event source and the event listener in the `ButtonViewer` program?

   `button` object is the event source and `listener` object is the event listener.
8. Why is it legal to assign a `ClickListener` object to a variable of type `ActionListener`?

   `ClickListener` implements `ActionListener` interface.
9. When do you call the `actionPerformed` method?

   You don’t. The Swing library calls the method when the button is clicked.
10. Why would an inner class method want to access a variable from a surrounding scope?

    Direct access is simpler than the alternative— passing the variable as an argument to a constructor or method.
11. How do you place the "Balance: . . ." message to the left of the "Add Interest" button?

    Add `resultLabel` to `panel` object first.

## 10.3 Processing Text Input

12. What happens if you omit the first JLabel object in the program of Section 10.3.1?

    Then the text field is not labeled. The user will not know its purpose.
13. If a text field holds an integer, what expression do you use to read its contents?

    `Integer.parseInt(textField.getText())`
14. What is the difference between a text field and a text area?

    A text field can only be single-line; a text area can be multi-line.
15. Why did the InvestmentFrame3 program call resultArea.setEditable(false)?

    Because you only want the text area to show the output. It shouldn't accept any input.
16. How would you modify the InvestmentFrame3 program if you didn't want to use
    scroll bars?

    Don't construct a `JScollPane` but add the `resultArea` to the panel directly.

## 10.4 Creating Drawings

17. How do you modify the program in Section 10.4.1 to draw two squares?

    Use `g.drawRect` with equal width and height.
18. What happens if you call fillOval instead fillRect in the program of
    Section 10.4.1?

    Get ovals with large width and small height.
19. Give instructions to draw a circle with center (100, 100) and radius 25.

    `g.drawCircle(75, 75, 50, 50)`
20. Give instructions to draw a letter “V” by drawing two line segments.

    ```java
    g.drawLine(0, 0, 50, 100);
    g.drawLine(50, 100, 100, 0);
    ```
21. Give instructions to draw a string consisting of the letter "V".

    `g.drawString("Vector", 200, 50)`
22. What are the RGB color values of `Color.BLUE`?

    0, 0, 255
23. How do you draw a yellow square on a red background?

    ```java
    g.setColor(Color.RED);
    // draw rectangular background
    g.setColor(Color.YELLOW);
    // draw square
    ```
24. What would happen in the investment viewer program if we simply painted each bar as `g.fillRect(0, y, value, BAR_HEIGHT);` in the paintComponent method of the ChartComponent class?

    All the bars would stretch all the way to the right of the component since they would be much longer than the component's width.
25. What would happen if you omitted the call to repaint in the append method of the
    ChartComponent class?

    It will not repaint after you push the button.
26. What would happen if you omitted the call to chart.setPreferredSize in the
    InvestmentFrame4 constructor?

    The chart will have 0 width and 0 height.