/* Метод принимающий двумерный массив
Необходимо посчитать и вернуть сумму элементов массива
При этом накладываем на метод 2 ограничения:
1. метод может работать только с квадратными массивами(кол-во строк = кол-ву столбцов)
2. в каждой ячейке может лежать только 0 или 1
Если нарушено одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class Seminar1_2 {
    public static void main(String[] args) {
        int arr[][] = { {1,0,1,1}, 
                        {0,0,1,0},
                        {1,1,1,0},
                        {1,0,1,0}};
        int result = sumArr(arr);
        System.out.println("Сумма = "+ result);
    }

    private static int sumArr(int[][] arr) {
        int sum = 0;
        int row = arr.length;
        for (int[] rowArr : arr) {
            if (row != rowArr.length) {
                throw new RuntimeException("Массив не квадратный");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1 || arr[i][j] == 0) {
                    sum += arr[i][j];
                } else{
                    throw new RuntimeException("Попалась цифра не равная 0 или 1");
                }
            }
        }
        return sum;
    }
}
