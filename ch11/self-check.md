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