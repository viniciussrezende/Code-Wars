package solution;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String strReturn = "";
        for(int counter = 0; counter < repeat; counter++){
            strReturn += string;
        }
        return strReturn;
    }
}
