import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static int findIt(int[] a) {

        // Используем синтаксис лямбда-выражения для функции группировки
        Map<Integer, Long> map = Arrays.stream(a) // создаем map из потока из массива
                .boxed() // Преобразуем int в Integer
                .collect(Collectors.groupingBy(i -> i, Collectors.counting())); // каждый элемент группируем в map, по фильтру одинаковые элементы к одинаковым, это ключ, значение это колличество элементов

        // Выведем результаты
        return map.entrySet().stream() // создаем поток из элементов map (key and value)
                .filter(entry -> entry.getValue() % 2 != 0) // фильтруем элементы по условия, что значение не четное
                .map(Map.Entry::getKey) // пересобираем map , где вместо key and value оставляем только key
                .findFirst().orElse(0); // возвращаем первое значение, которое есть в map в формате Optional, но последним действием превращаем его в int (нужно по условию задачи)
    }
//public static int findIt(int[] A) {
//    int xor = 0;
//    for (int i = 0; i < A.length; i++) {
//        xor ^= A[i];
//    }
//    return xor;
//}
//I think this is what it works:
//
//    A^A = 0
//    A^0 = A
//    A^B^C^A^B = A^A^B^B^C = 0^0^C = C


    public static void main(String[] args) {
        int[] array = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        System.out.println(findIt(array));
    }
}