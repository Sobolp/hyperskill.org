import java.util.Arrays;

/**
 * Below is a part of a class hierarchy consisting of a lot of classes:
 *
 * class Shape { }
 *
 * class Shape2D extends Shape { }
 *
 * class Shape3D extends Shape { }
 *
 *
 * class Circle extends Shape2D { }
 *
 * // ...  classes which extends Shape2D
 *
 *
 * class Cube extends Shape3D { }
 *
 * // ...  classes which extends Shape3D
 * Implement a method that takes an array of shapes and counts how many objects of classes that extend Shape2D
 * the array contains. Do not count objects of Shape2D, only its subclasses.
 *
 */
public class Counting2DShapes {
}
class Counter {
    public static int count2DShapes(Shape[] shapes) {
        return (int) Arrays.stream(shapes)
                .filter(x -> Shape2D.class.isInstance(x) && x.getClass() != Shape2D.class)
                .count();
    }
}

// Don't change the code below

class Shape {
}

class Shape2D extends Shape {
}

class Shape3D extends Shape {
}


class Circle extends Shape2D {
}

class Shape2DSub1 extends Shape2D {
}

class Shape2DSub2 extends Shape2D {
}


class Cube extends Shape3D {
}

class Shape3DSub1 extends Shape3D {
}

class Shape3DSub2 extends Shape3D {
}