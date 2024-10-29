import java.util.Arrays;

/* Метод принимающий 2 массива и возвращающий новый массив, каждый элемент которого равен
сумме эл двух входящих массивов в той же ячейке

Если длины массивов не равны, необходимо оповестить пользователя
 */
public class Seminar1_7 {
    public static void main(String[] args) {
        int[] firstAr = {2, 7, 2, 5, 34};
        int[] secondAr = {2, 7, 2, 6, 2};
        try {
            int[] finalAr = summArr(firstAr, secondAr);
            System.out.println(Arrays.toString(finalAr));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private static int[] summArr(int[] firstAr, int[] secondAr) throws IllegalArgumentException{
        int minLen;
        int[] littleAr;
        int[] finalAr;
        if ((firstAr.length) > (secondAr.length)) {
            throw new IllegalArgumentException("Массив номер 1 больше чем 2й");
        } else if ((firstAr.length) < (secondAr.length)){
            throw new IllegalArgumentException("Массив номер 2 больше чем 1й");
        } else {
            littleAr = secondAr;
            minLen = secondAr.length;
            finalAr = firstAr;
        }

        for (int i = 0; i < minLen; i++) {
            finalAr[i] = finalAr[i] + littleAr[i];
        }
        return finalAr;
    }

}
