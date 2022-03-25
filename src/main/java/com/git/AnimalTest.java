package com.git;

/**
 * @Author: luner
 * @Date: 2022/03/25 20:54
 * @Description:多态的使用
 * ①类的继承关系②方法的重写
 */
public class AnimalTest{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        a1.shout();

        Animal a2 = new Cat();
        a2.eat();
        a2.shout();
    }
}
class Animal {
    public void eat(){
        System.out.println("吃饭");
    }

    public void shout(){
        System.out.println("玩耍");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗粮");
    }
    @Override
    public void shout(){
        System.out.println("汪汪");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫粮");
    }
    @Override
    public void shout(){
        System.out.println("喵喵");
    }
}
