package Abstraction;

public class classA {
    private int num;

    public classA(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int addNum(int add) {
        num += add;
        System.out.println("Class A");
        return getNum();
    }

}
