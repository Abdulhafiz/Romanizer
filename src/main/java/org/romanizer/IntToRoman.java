package org.romanizer;

import java.util.ArrayList;
import java.util.List;

public class IntToRoman {

    List<String> romanConverted = new ArrayList<>();

    public List<String> intToRoman(List<Integer> integerList) {

        for (Integer num : integerList) {
            if (num < 1 || num > 1000) {
                System.out.println("Invalid roman number value!");
            }
            convertToRoman(num);
        }

        return romanConverted;
    }

    private void convertToRoman(Integer num) {
        StringBuilder roman = new StringBuilder();

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanLetters = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        while (num > 0) {
            int maxFound = 0;
            for (int i = 0; i < values.length; i++) {
                if (num >= values[i]) {
                    maxFound = i;
                }
            }
            roman.append(romanLetters[maxFound]);
            num -= values[maxFound];
        }
        romanConverted.add(roman.toString());
    }

}
