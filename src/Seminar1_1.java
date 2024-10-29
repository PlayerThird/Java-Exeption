/* Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс.
1. если длина масс меньше некоторого заданного мин, метод возвращает -1
2. если искомый элемент не найден = -2
3. если вместо массива пришёл null = -3
4. придумать свои варианты и вывод
Написать взаимодействие пользолвателя. При такой-то ошибке, такой-то ответ.

 */
public class Seminar1_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min = 2;
        int find = 6;
        int result = checkArrLen(arr,min);
        if (result == 0) {result = searchNum(arr, find);}
        System.out.println(outRes(result));
    }

    private static String outRes(int result) {
        switch (result) {
            case -1: return "Массив меньше заданного минимума";
            case -2: return "Искомый элемент не найден";
            case -3: return "Массив пуст :/";
        }
        return "Найденное число есть в массиве = "+ result;
    }

    private static int checkArrLen(int[] arr, int min) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;} else {
        }
        return 0;
    }
    private static int searchNum(int[] arr, int find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return find;
            }
        }
        return -2;
    }
}
