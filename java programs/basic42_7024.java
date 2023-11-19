
            public class basic42_7024 {
    
                public static boolean isVowel(char ch) {
                    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
                    for (char vowel : vowels) {
                        if (ch == vowel) {
                            return true;
                        }
                    }
                    return false;
                }
                public static void main(String[] args) {
                    char ch = 'a';
            
                    if (isVowel(ch)) {
                        System.out.println(ch + " is a vowel.");
                    } else {
                        System.out.println(ch + " is a consonant.");
                    }
                }
            }
            
        