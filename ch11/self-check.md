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