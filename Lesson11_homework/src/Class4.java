public class Class4 {
    int x, y, z;

    Class4 () {
        this.x = 5;
        this.y = 10;
        this.z = 2;
    }

    Class4 (int x) {
        this.x = x;
    }
    Class4 (int x, int y) {
        this(x);
        this.y = y;
    }
    Class4 (int x, int y, int z) {
        this(x,y);
        this.z = z;
    }

}

