
            class allvowels{
                public static int countVowels(String string) {
                    int count = 0;
                    for (char character : string.toCharArray()) {
                        if (isVowel(character)) {
                            count++;
                        }
                    }
                    return count;
                }
                
                private static boolean isVowel(char character) {
                    return character == 'a'||character == 
                    'e'||character == 'i'||character == 'o'||character == 'u';
                }
                
                
                public static void main(String ar[]){
                    String string = "Hello, World!";
                    int vowelCount = countVowels(string);
    
                    System.out.println
                    ("The number of vowels in the string is: " + vowelCount);
    
                }
            }
    
        
        