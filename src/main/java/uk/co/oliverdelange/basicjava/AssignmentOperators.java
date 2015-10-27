package uk.co.oliverdelange.basicjava;

public class AssignmentOperators {
    public static void main(String[] args) {
        //Lets get to 100 in the most over engineered way possible
        int x, y, z = 1; // only z is assigned to 1 but x and y are declared
        x = y = z; // now all should be 1 as assignment goes from the right
        x += y; // x = x + y OR x = 1 + 1 OR x = 2
        y -= z; // y = y - z OR y = 1 - 1 OR y = 0
        z *= x; // z = z * x OR z = 1 * 2 OR z = 2
        x /= z; // x = x / z OR x = 2 / 2 OR x = 1
        // Currently x=1, y=0, z=2

        //Using unary operators (prefix and postfix)
        y++; // y = y + 1 OR y = 0 + 1
        y = z--; // z = z - 1 && y = z
        z = ++z + z++; // z = (2  + 2)
        --z; // z = z - 1
        // Currently x=1, y=0, z=2
        x = ++y + --z; // y = (y+1) + (y+1) OR y = 0 + 1
        x = y-- + z++; // y =

        System.out.print(x + y + z);
    }
}
