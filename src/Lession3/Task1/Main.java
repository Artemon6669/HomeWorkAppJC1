package Lession3.Task1;
import java.util.Arrays;

public class Main {

        static Integer[] array1 = {1, 2, 3, 4};
        static Double[] array2 = {1d, 2d, 3d, 4d};

        public static void main(String[] args) {

            Change<Number> numberChange = new Change<>();
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(numberChange.change(array1, 1, 3)));
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.toString(numberChange.change(array2, 2, 3)));


        }
}
