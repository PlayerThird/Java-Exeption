/* Метод принимающий двумерный массив
Метод должен проверить, что длина строк и столбцов совпадают
Детализировать какие строки со столбцами не требуются.

 */
public class Seminar1_8 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {7, 8,4,8}};
        checkArrayDimensions(arr);
    }
    public static void checkArrayDimensions(int[][] array) {
        if (array == null || array.length == 0) {
            System.out.println("Пустой массив.");
            return;
        }

        int expectedLength = array[0].length;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != expectedLength) {
                System.out.printf("Строка %d имеет неверную длину (%d вместо %d).%n",
                        i + 1, array[i].length, expectedLength);
            }
        }
    }
}
