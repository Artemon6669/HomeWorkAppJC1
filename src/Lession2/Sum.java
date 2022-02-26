package Lession2;

public class Sum {
    public void checkValue(String[][] array) throws MyArraySizeException{
        if(array.length != 4 || array[0].length != 4) throw new MyArraySizeException();
    }

    public int getSum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        checkValue(array);
        Integer result = 0;
        int i = 0;
        int j = 0;
        try {
            for (; i < array.length; i++) {
                j = 0;
                for (; j < array.length; j++) {
                    result = result + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex) {
            throw new MyArrayDataException("Ошибка в позиции: " + (i+1) + "," + (j+1));
        }
        return result;
    }
}
