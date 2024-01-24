package psi.o.m11_exemplo_ide;

public class M11_exemplo_ide {

    public static void main(String[] args) {
        int i, j, k = 0;

        for (i = 1; i <= 1000; i++) {
            k = k + i;
        }

        k = k / 2;
        j = i;

        for (i = k; i > 0; i-=3) {
            j = j - i;
        }
        System.out.println("FIM");

    }
}
