package utils;

import org.apache.commons.text.StringSubstitutor;

import java.util.Map;

public class StringUtils {
    public static String interpolate(String baseString, Map<String, String> parameters) {
        StringSubstitutor substitutor = new StringSubstitutor(parameters);
        return substitutor.replace(baseString);
    }
}
