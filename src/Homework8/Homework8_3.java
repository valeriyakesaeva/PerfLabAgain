package Homework8;

/*
Задача 3: На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная строка является ключом,
и ее значение равно true, если эта строка встречается в массиве 2 или более раз.
Пример: wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */

import java.util.HashMap;
import java.util.Map;

public class Homework8_3 {
    public static Map<String, Boolean> wordMultiple(String[] words) {

        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        Map<String, Boolean> result = new HashMap<>();

        // 🔥 ИСПРАВЛЕНО ЗДЕСЬ
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue() >= 2);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "b"};

        Map<String, Boolean> result = wordMultiple(arr);

        System.out.println(result);
    }
}
