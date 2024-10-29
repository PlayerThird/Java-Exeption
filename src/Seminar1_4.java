/* Метод checkArray(Integer[] arr)
Метод должен пройтись по каждому элементу и проверить что он не равен null
С следующей логикой:
1. если в какой-то ячейке встретился null, то необходимо "оповестить" об этом пользователя
2.  если nullы встретились в нескольких ячейках, то идеально было бы их все "подсветить"
 */
public class Seminar1_4 {
    public static void main(String[] args) {
        Integer[] a = {4,6,2,null,34,null,5,4,3,null};
        checkArrOnNull(a);
    }

    private static void checkArrOnNull(Integer[] a) {
        String arrNull = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                arrNull += "***" + ",";
                System.out.println("В ячейке "+(i+1)+" обнаружен null");
            } else {
                arrNull += a[i] + ",";
            }
        }
        System.out.println(arrNull);
    }
}
