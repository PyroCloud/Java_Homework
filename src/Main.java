/* Создать и заполнить массив из 10 чисел, значениями от 1 до 10 */
/* Создать и заполнить массив из 10 чисел, значениями от 10 до 1 */
/* Создать и заполнить массив из 10 чисел, значениями от 10 до 19 */
/* Создать и заполнить массив из 10 чисел, значениями от 29 до 20 */
/* Ввести 5 строк с клавиатуры и записать их в массив */
/* Ввести 5 чисел с клавиатуры и записать их в массив. Вывести содержимое массива в консоль */
/* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию. Посчитать сумму элементов массива и вывести её на экран. */
/* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию. Найти минимальный элемент в массиве и вывести его в консоль. */
/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль
*/
/* Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] subarr1 = new int[5];
        int[] subarr2 = new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if (i<5){
                subarr1[i] = arr[i];
            }
            else {subarr2[i-5] = arr[i];}
        }
        for (int i=0; i<10;i++){
            if (i<5){
                System.out.println(subarr1[i] + " sub1");
            }
            else {System.out.println(subarr2[i-5] + " sub2");}
        }


    }






}
