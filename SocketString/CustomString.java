package SocketString;

import java.io.Serializable;

public class CustomString implements Serializable {
    private String value;

    public CustomString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getMaxCharacterCount() {
        int[] charCount = new int[256]; // Assuming ASCII characters
        int maxCount = 0;

        for (char c : value.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount[c]++;
                if (charCount[c] > maxCount) {
                    maxCount = charCount[c];
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] == maxCount) {
                result.append((char) i).append(":").append(maxCount).append(" , ");
            }
        }

        if (result.length() > 0) {
            result.delete(result.length() - 3, result.length()); // Remove trailing " , "
        }

        return result.toString();
    }
}
