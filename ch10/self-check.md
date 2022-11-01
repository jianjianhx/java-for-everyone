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