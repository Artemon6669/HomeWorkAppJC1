package Lession3.Task2;


public class BoxChange {


    public static void main(String[] args) {

        Orange[] oranges = new Orange[10];
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        oranges[0] = orange1;
        oranges[1] = orange2;
        oranges[2] = orange3;
        oranges[3] = orange4;
        Box<Orange> box1 = new Box<>(oranges);


        Orange[] orangesA = new Orange[10];
        Orange oranges1 = new Orange();
        Orange oranges2 = new Orange();
        Orange oranges3 = new Orange();
        Orange oranges4 = new Orange();
        Orange oranges5 = new Orange();
        orangesA[0] = oranges1;
        orangesA[1] = oranges2;
        orangesA[2] = oranges3;
        orangesA[3] = oranges4;
        orangesA[4] = oranges5;
        Box<Orange> box3 = new Box<>(orangesA);

        Apple[] apples = new Apple[10];
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        apples[0] = apple1;
        apples[1] = apple2;
        apples[2] = apple3;
        apples[3] = apple4;
        apples[4] = apple5;
        apples[5] = apple6;
        Box<Apple> box2 = new Box<>(apples);


        System.out.println("Взвешиваем коробку с апельсинами 1 : " + box1.getWeigthBox());
        System.out.println("Взвешиваем коробку с апельсинами 2 : " + box3.getWeigthBox());
        System.out.println("Взвешиваем коробку с яблоками: " + box2.getWeigthBox());

        System.out.println("Cравниваем по весу коробки: " + box1.Compare(box3));

        box1.toEmptyArray(box3);

    }
}
