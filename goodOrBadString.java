public class goodOrBadString {
    
    public static int classifyString(String S) {
        int n = S.length();
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);

            if (isVowel(ch)) {
                vowelCount++;
                consonantCount = 0;
            } else if (isConsonant(ch)) {
                consonantCount++;
                vowelCount = 0;
            } else if (ch == '?') {
                int maxVowelCount = vowelCount + 1;
                int maxConsonantCount = consonantCount + 1;

                if (maxVowelCount > 5 || maxConsonantCount > 3) {
                    return 0; 
                }

                vowelCount++;
                consonantCount++;
            }

            if (vowelCount > 5 || consonantCount > 3) {
                return 0; 
            }
        }
        return 1; 
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static boolean isConsonant(char ch) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        String S1 = "aeioup??";
        System.out.println(classifyString(S1)); 

        String S2 = "bcdaeiou??";
        System.out.println(classifyString(S2)); 
    }
}
