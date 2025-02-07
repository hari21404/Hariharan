package Weak2Task.StringHandling;

public class StringProcessor {
    public static String reverseString(String originalStr)
    {

        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        return reversedStr;
    }
    public static int countOccurrences(String text, String sub){
            int M = sub.length();
            int N = text.length();
            int res = 0;

            for (int i = 0; i <= N - M; i++) {
                int j;
                for (j = 0; j < M; j++) {
                    if (text.charAt(i + j) != sub.charAt(j)) {
                        break;
                    }
                }
                
                if (j == M) {
                    res++;
                    j = 0;
                }
            }
            return res;
        }
    public static String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder capitalizedStr = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedStr.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalizedStr.toString().trim();
    }
    public static void main(String[] args) {
        String str = "hello world, this is a test";

        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);

        int occurrences = countOccurrences(str, "is");
        System.out.println("Occurrences of 'is': " + occurrences);

        String capitalized = splitAndCapitalize(str);
        System.out.println("Capitalized String: " + capitalized);
    }
}

