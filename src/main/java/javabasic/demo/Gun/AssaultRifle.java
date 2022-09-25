package javabasic.demo.Gun;

public class AssaultRifle extends Gun {
    public void fire() {
        bulletCount -= 5;
        System.out.printf("%s => => => => => , %d\n",model, bulletCount);
    }

    public AssaultRifle(String model) {
        super(model);
        bulletCount = 40;
    }
}