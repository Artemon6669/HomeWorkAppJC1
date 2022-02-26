package Lession2;

public class AppLession2 {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        Sum sum = new Sum();
        String[][] arrayDataException = {{"1", "3", "3", "4"}, {"7", "6", "б", "8"}, {"9", "7", "7", "8"}, {"5", "6", "7", "8"}};
        String[][] arraySizeException = {{"1", "2"}, {"1", "6",}, {"9", "6"}, {"5", "6"}};
        String[][] arrayWithNoError = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "6", "7", "8"}, {"5", "6", "7", "8"}};
        sum.getSum(arrayDataException);
        sum.getSum(arraySizeException);
        sum.getSum(arrayWithNoError);
        try {
            System.out.println("Сумма массива: " + sum.getSum(arrayWithNoError));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + sum.getSum(arraySizeException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + sum.getSum(arrayDataException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
    }
}
