/* Метод принимающий в качестве аргумента двумерный массив
Необходимо посчитать сумму элементов массива
Такое же задание как и 3е, только выводим код ошибки
 */
public class Seminar1_3 {
    public static void main(String[] args) {
        int arr[][] = { {1,0,1,1},
                {0,0,1,0},
                {1,1,1,0},
                {1,0,1,0}};
        int result = sumArr(arr);
        System.out.println(checkExep(result));
    }

    private static String checkExep(int result) {
        if(result == -1) {
            return "Число не равно 0 или 1";
        } else if (result == -2){
            return "Массив не квадратный";
        }
        return "Сумма = "+result;
    }

    private static int sumArr(int[][] arr) {
        int sum = 0;
        int row = arr.length;
        for (int[] rowArr : arr) {
            if (row != rowArr.length) {
                return -2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1 || arr[i][j] == 0) {
                    sum += arr[i][j];
                } else{
                    return -1;
                }
            }
        }
        return sum;
    }
}
