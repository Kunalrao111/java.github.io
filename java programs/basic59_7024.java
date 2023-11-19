
            public class basic59_7024 {
                public static void main(String[] args) {
                    // Get the character from the user
                    char ch = System.in.read();
            
                    // Check if the character is a vowel
                    boolean isVowel = false;
                    if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                        isVowel = true;
                    }
            
                    // Print whether the character is a vowel or consonant
                    if (isVowel) {
                        System.out.println(ch + " is a vowel.");
                    } else {
                        System.out.println(ch + " is a consonant.");
                    }
                }
            }
            
        