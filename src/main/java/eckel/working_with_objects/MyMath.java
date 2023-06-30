package eckel.working_with_objects;

public class MyMath {

    //static field and static method

    final static double PI = 3.14159265;

    static double sin(double x, int n) {

        double s = 0;
        double q = x;
        //loop Taylor`s row for sinus:
        for (int i = 1; i <= n; i++) {
            s += q;
            q *= (-1) * x * x / (2 * i) / (2 * i + 1);
        }
        return s + q;
    }
}
