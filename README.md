# Shape-Crafter

This program uses inheritence to allow the user to define and modify shapes.

It was designed so new shapes can be added by extending the current classes.

Examples for shapes to be added: Triangles (Non_Circular), Closed parabola (Circular)
##
Shapes all have a position (x, y) and are all Zoomable* 

*Zooming a shape in doubles its size and zooming out halves its size if possible.

# Shapes are either Circular or Non_Circular
### Circular shapes (have a position and radii)
- Circle (x, y, r)
- Elipse (x, y, r, r2)

### Non_Circular shapes (have a position, height, and width)
- Rectangle (x, y, h, w)
- Square (x, y, l) *setting a square's length/ width will automatically set its other value to the same
