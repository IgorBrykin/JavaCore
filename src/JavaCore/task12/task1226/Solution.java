package JavaCore.task12.task1226;

/* 
Лазать, летать и бегать
1. Внутри класса Solution создай интерфейс public
interface CanFly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public
interface CanClimb(лазить по деревьям) с методом
void climb().
3. Внутри класса Solution создай интерфейс public
interface CanRun(бегать) с методом void run().
4. Подумай логически, какие именно интерфейсы нужно
добавить для каждого класса.
5. Добавь интерфейсы классам Cat(кот), Dog(собака),
Tiger(тигр), Duck(Утка).


Требования:
1. Класс Solution должен содержать интерфейс CanFly с
методом void fly().
2. Класс Solution должен содержать интерфейс CanClimb с
методом void climb().
3. Класс Solution должен содержать интерфейс CanRun с
методом void run().
4. Объект класса Cat должен уметь бегать(поддерживать
интерфейс CanRun) и лазить по деревьям(поддерживать интерфейс CanClimb).
5. Объект класса Dog должен уметь бегать(поддерживать
интерфейс CanRun).
6. Класс Tiger должен быть котом.
7. Объект класса Duck должен уметь бегать(поддерживать
интерфейс CanRun) и
летать(поддерживать интерфейс CanFly).
*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }
    

    public class Cat {
    }

    public class Dog {
    }

    public class Tiger extends Cat {
    }

    public class Duck {
    }
}
