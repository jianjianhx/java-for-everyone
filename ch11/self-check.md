# Chapter 11: Advanced User Interfaces

## 11.1 Layout Management

1. What happens if you place two buttons in the northern position of a border layout? Try it out with a small program.

   Only the second one is displayed

2. How do you add two buttons to the northern position of a frame so that they are shown next to each other?

   First add them to a panel, then add the panel to the north end of a frame.

3. How can you stack three buttons one above the other?

   Place them inside a panel with a `GridLayout` that has three rows and one column.

4. What happens when you place one button in the northern position of a border layout and another in the center position? Try it out with a small program if you aren't sure.

   The button in the north stretches horizontally to fill the width of the frame. The height of the northern area is the normal height.

5. Some calculators have a double-wide 0 button, as shown below. How can you achieve that?

   To get the double-width button, put it in the south of a panel with border layout whose center has 3x2 grid layout with the keys 7, 8, 4, 5, 1, 2. Put that panel in the west of another border layout panel whose eastern area has a 4x1 grid layout with the remaining keys.

## 11.2 Choices

6. What is the advantage of a JComboBox over a set of radio buttons? What is the disadvantage?

   If you have many options, a set of radio buttons takes up a large area. A combo box can show many options without using up much space. But the user cannot see the options as easily.

7. What happens when you put two checkboxes into a button group? Try it out if you are not sure.

   If one of them is checked, the other one is unchecked. You should use radio buttons if that is the behavior you want.

8. How can you nest two etched borders?

   ```java
   JPanel p1 = new JPanel();
   p1.setBorder(new EtchedBorder());
   JPanel p2 = new JPanel();
   p2.setBorder(new EtchedBorder());
   p1.add(p2);
   ```

9. Why do all user-interface components in the `FontFrame` class share the same listener?

   When any of the component settings is changed, the program simply queries all of them and updates the label.

10. Why was the combo box placed inside a panel? What would have happened if it had been added directly to the control panel?

    To keep it from growing too large. It would have grown to the same width and height as the two panels below it.

11. How could the following user interface be improved?

    Instead of using radio buttons with two choices, use a checkbox.

## 11.3 Menus

12. Why do `JMenu` objects not generate action events?

    When you open a menu, you have not yet made a selection. Only `JMenuItem` objects correspond to selections.

13. Can you add a menu item directly to the menu bar? Try it out. What happens?

    Yes, you can -- `JMenuItem` is a subclass of `JMenu`. The item shows up on the menu bar. When you click on it, its listener is called. But the behavior feels unnatural for a menu bar and is likely to confuse users.

14. Why is the increment parameter variable in the `createSizeItem` method declared as `final`?

    The parameter variable is accessed in a method of an inner class.

15. Why can't the `createFaceItem` method simple set the `faceName` instance variable?

    Then the `faceName` variable is set when the menu item is added to the menu, not when the user selects the menu.

16. In this program, the font specification (name, size, and style) is stored in instance variables. Why was this not necessary in the program of the previous section.

    In the previous program, the user-interface components effectively served as storage for the font specification. Their current settings were used to construct the font. But a menu doesn't save settings; it just generates an action.

## 11.4 Exploring the Swing Documentation

17. Suppose you want to allow users to pick a color from a color dialog box. Which class would you use? Look in the API documentation.

    `JColorChooser`.

18. Why does a slider emit change events and not action events?

    Action events describe one-time changes, such as button clicks. Change events describe continuous changes.

## 11.5 Using Timer Events for Animations

19. Why does a timer require a listener object?

    The timer needs to call some method whenever the time interval expires. It calls the `actionPerformed` method of the listener object.

20. How can you make the rectangle move backwards?

    Call `scene.moveRectangleBy(-1, -1)` in the `actionPerformed` method.

21. Describe two ways of modifying the program so that the rectangle moves twice as fast.

    You can cut the timer delay in half (to 50 milliseconds between ticks), or you can double the distance by which the rectangle moves, by calling `scene.moveRectangleBy(2, 2)`.

22. How can you make a car move instead of a rectangle?

    The components class would need to draw a car at position (x, y) instead of a rectangle.

23. How can you make two rectangles move in parallel in the scene?

    Draw a second rectangle in the `paintComponent` method of `RectangleComponent`.

24. What would happen if you omitted the call to `repaint` in the `moveRectangleBy` method?

    The moved rectangle won't be painted, and the rectangle will appear to be stationary until the frame is repainted for an external reason.

## 11.6 Mouse Events

25. Why was the `moveRectangleBy` method in `RectangleComponent2` replaced with a `moveRectangleTo` method?

    Because you know the current mouse position, not the amount by which the mouse has moved.

26. Why must the `MousePressListener` class supply five method?

    It implements the `MouseListener` interface, which has five methods.

27. How could you change the behavior of the program so that a new rectangle is added whenever the mouse is clicked?

    The `RectangleComponent2` class need to keep track of the locations of multiple rectangles. It can do that with an array list of `Point` or `Rectangle` objects. The `paintComponent` method needs to draw them all. Replace the `moveRectangleTo` method with an `addRectangleAt` method that adds a rectangle at a given `x, y` position.