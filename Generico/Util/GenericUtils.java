package Generico.Util;

import java.util.List;

//?  Método genérico para encontrar el máximo en una lista.
public class GenericUtils {
    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }
}
