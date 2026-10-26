
package Bai1;

public class bai1 {
    private int tu;
    private int mau;

    public bai1() {
        tu = 0;
        mau = 1;
    }

    public bai1(int tu, int mau) {
        if (mau == 0) {
            throw new IllegalArgumentException("Mau so phai khac 0");
        }
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
        rutGon();
    }

    public void setMau(int mau) {
        if (mau == 0) {
            throw new IllegalArgumentException("Mau so phai khac 0");
        }
        this.mau = mau;
        rutGon();
    }

    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a == 0 ? 1 : a;
    }

    public void rutGon() {
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }

        int u = UCLN(tu, mau);
        tu /= u;
        mau /= u;
    }

    public bai1 cong(bai1 p) {
        return new bai1(tu * p.mau + p.tu * mau, mau * p.mau);
    }

    public bai1 tru(bai1 p) {
        return new bai1(tu * p.mau - p.tu * mau, mau * p.mau);
    }

    public bai1 nhan(bai1 p) {
        return new bai1(tu * p.tu, mau * p.mau);
    }

    public bai1 chia(bai1 p) {
        if (p.tu == 0) {
            throw new ArithmeticException("Khong the chia cho 0");
        }
        return new bai1(tu * p.mau, mau * p.tu);
    }

    public int soSanh(bai1 p) {
        long a = (long) tu * p.mau;
        long b = (long) p.tu * mau;
        return Long.compare(a, b);
    }

    public boolean laSoNguyen() {
        return tu % mau == 0;
    }

    @Override
    public String toString() {
        if (mau == 1) {
            return String.valueOf(tu);
        }
        return tu + "/" + mau;
    }
}
