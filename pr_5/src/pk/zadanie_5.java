package pk;

public class zadanie_5 {


    public int n5(int x) {
        if (x % 10 == 0 && x / 10 == 0) {
            return x;
        } else {
            return x % 10 + n5(x / 10);
        }
    }


    public String n6(int x) {
        if (n6_2(x - 1, x) == 1) return "NO";
        else return "YES";
    }

    public int n6_2(int x, int y) {
        if (y <= 2 || x < 2) {
            return 0;
        } else {
            if (y % x == 0) {
                return 1;
            } else {
                return n6_2(x - 1, y);
            }
        }
    }

    public void n7(int x) {
        n7_2(x - 1, x);
    }

    public void n7_2(int x, int y) {
        if (y % x == 0) {
            if (n6_2(x - 1, x) == 0) {
                System.out.print(x);
            }
        } else {
            n7_2(x - 1, y);
        }
    }
}
