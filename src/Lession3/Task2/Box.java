package Lession3.Task2;

import java.util.Arrays;

public class Box <T extends Fruit> {
    T[] boxArray;

    public T[] getBoxArray() {
        return boxArray;
    }

    public Box(T[] boxArray){
        this.boxArray=boxArray;
    }

    public Float getWeigthBox(){
        Float result = 0f;
        for(T t: getBoxArray()){
            if(t!=null) {
                Float value = t.getWeigth();
                result = result + value;
            }
        }
        return result;
    }
     public Boolean Compare(Box<? extends Fruit> box){
         if(this.getWeigthBox().floatValue() == box.getWeigthBox().floatValue()) return true;
         return false;
     }
     public void toEmptyArray(Box<T> box){
        System.out.println("В первой коробке до: " + this.getWeigthBox());
        System.out.println("Во второй коробке до: " + box.getWeigthBox());
        for(int i = 0; i<box.getBoxArray().length; i++){
            if(box.getBoxArray()[i]!=null) {
                this.getBoxArray()[getSize()] = box.getBoxArray()[i];
                box.getBoxArray()[i] = null;
            }
        }
        System.out.println("В коробке после: " + this.getWeigthBox());
        System.out.println("В коробке после: " + box.getWeigthBox());

     }

     private int getSize(){
        int result = 0;
        for(T t: getBoxArray()) {
            if (t!=null) result++;
        }
         return result;
     }
}
