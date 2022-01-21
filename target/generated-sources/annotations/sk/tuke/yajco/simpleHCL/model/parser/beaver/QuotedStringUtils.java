package sk.tuke.yajco.simpleHCL.model.parser.beaver;

import beaver.Symbol;

public class QuotedStringUtils extends Symbol {
    public static String unquote(String value) {
        return value.substring(1, value.length() - 1)
            .replaceAll("\\\\b", "\b")
            .replaceAll("\\\\r", "\r")
            .replaceAll("\\\\t", "\t")
            .replaceAll("\\\\f", "\f")
            .replaceAll("\\\\n", "\n")
            .replaceAll("\\\\\"", "\"")
            .replaceAll("\\\\\'", "\'")
            .replace("\\\\", "\\");
    }
}
