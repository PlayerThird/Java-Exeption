/*Реализовать метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1 в частве кода ошибки, иначе - длину массива
 */
public class Seminar1_0 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int min_len = 3;
        int resault = checkArrayLen(arr, min_len);
        System.out.println(resault);
    }
    public static int checkArrayLen(int[] arr, int min_len) {
        if (arr.length < min_len){
            return -1;
        }else {
            return arr.length;
        }
    }
}
