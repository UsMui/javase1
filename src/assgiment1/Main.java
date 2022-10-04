package assgiment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ts = sc.nextInt();

        PhanSo f1= new PhanSo();
        f1.setTuso(ts);
        f1.setMauso(sc.nextInt());
        f1.inPhanSo();

        PhanSo f2 = new PhanSo();
        f2.setTuso(sc.nextInt());
        f2.setMauso(sc.nextInt());
        f2.inPhanSo();

        PhanSo t= f1.add(f2);
        t.rutGon();
        t.inPhanSo();
    }
}
