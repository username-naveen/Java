package Abstraction;

public class classB extends classA{

    public classB(int num) {
        super(num);
    }

    @Override
    public int addNum(int add) {
        int n = 5;
        System.out.println("Class B");
        return n += add;
    }
    
}
