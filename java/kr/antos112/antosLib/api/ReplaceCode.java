package kr.antos112.antosLib.api;

public class ReplaceCode {
    private ReplaceCode() {}

    public static String replaceCode(String partten, String value, String text) {
        String s = text;
        if (text.contains(partten)) {
            s = s.replaceAll(partten, value);
        }
        return s;
    }
}
