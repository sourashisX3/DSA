package Questions;

import java.util.HashMap;
import java.util.Map;

public class CalculateResistance {

    static void findResistanceColors(int power, int current) {

        if (power <= 0 || current <= 0 || power <= current) {
            System.out.println("INVALID: Power and current must be positive.");
            return;
        }

        int resistance = power / (current * current);

        String res = Integer.toString(resistance);

        int firstDigit = Character.getNumericValue(res.charAt(0));
        int secDigit = Character.getNumericValue(res.charAt(1));
        int multiplier = res.length() - 2;

        Map<Integer, String> colorMap = new HashMap<>();
        colorMap.put(0, "BLK"); // Black
        colorMap.put(1, "BRN"); // Brown
        colorMap.put(2, "RED"); // Red
        colorMap.put(3, "ORG"); // Orange
        colorMap.put(4, "YLW"); // Yellow
        colorMap.put(5, "GRN"); // Green

        if (!colorMap.containsKey(firstDigit) || !colorMap.containsKey(secDigit) || !colorMap.containsKey(multiplier)) {
            System.out.println("INVALID: Calculated values are out of range.");
            return;
        }

        System.out.println(colorMap.get(firstDigit) + ", " + colorMap.get(secDigit) + ", " + colorMap.get(multiplier));
    }

    public static void main(String[] args) {
        int power = 450000;
        int curr = 10;

        findResistanceColors(power, curr);
    }
}