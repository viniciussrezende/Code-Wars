package Solution;

public class Solution {

    public static String camelCase(String str) {
        String strReturn = "";
        String[] arrayString = str.split(" ");
        for (String indexCounter : arrayString) {
            if (!indexCounter.isEmpty()) {
                indexCounter = indexCounter.toLowerCase();
                strReturn += indexCounter.substring(0, 1).toUpperCase() + indexCounter.substring(1);
            }
        }
        return strReturn;
    }
}