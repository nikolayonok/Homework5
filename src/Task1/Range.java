package Task1;

import java.util.Scanner;

public class Range {

    private Scanner scanner;
    private String str;

    Range() {
        scanner = new Scanner(System.in);
    }

    private String getStr() {
        return str;
    }

    private void setStr(String str) {
        this.str = str;
    }

    public String[] readRange() {
        Range range = new Range();
        range.setStr(scanner.nextLine());
        String[] resultArray;

        int[] intArray = stringToArray(range.getStr());

        if (intArray.length < 6 || intArray.length > 20) {
            resultArray = new String[]{"Введено не верное количество диапазонов"};
        } else {
            resultArray = lengthRange(intArray);
            checkRange(intArray);
        }
        return resultArray;
    }

    private int[] stringToArray(String string) {
        string = string.trim();
        string = string.replaceAll("[,\\s+]", ",");
        string = string.replaceAll(",+", ",");
        String[] stringArray = string.trim().split(",");
        int[] intArray = new int[stringArray.length];
        int j = 0;
        for (String str : stringArray) {
            intArray[j] = Integer.parseInt(stringArray[j]);
            j++;
        }
        return intArray;
    }

    private String[] lengthRange(int[] intArray) {
        String[] resultArray = new String[intArray.length / 2];
        for (int i = 0, k = 0; i < intArray.length; i += 2, k++) {
            if (intArray[i] > intArray[i + 1]) {
                resultArray[k] = "Диапазон \"" + intArray[i] + "-" + intArray[i + 1] + "\" указан не верно";
            } else {
                resultArray[k] = "Диапазон " + intArray[i] + "-" + intArray[i + 1] + " равен " + (intArray[i + 1] - intArray[i]);
            }
        }
        return resultArray;
    }

    private void checkRange(int[] intArray) {

        for (int i = 2; i < intArray.length - 2; i += 2) {
            for (int j = i; j < intArray.length - 1; j += 2) {
                if ((intArray[i - 2] <= intArray[j + 1]) && (intArray[j] <= intArray[i - 1])) {
                    System.out.println("Диапазоны " + intArray[i - 2] + "-" + intArray[i - 1] +
                            " и " + intArray[j] + "-" + intArray[j + 1] + " пересекаются");
                }
            }
        }
    }
}
