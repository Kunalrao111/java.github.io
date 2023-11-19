
            class C{
            public static int countWords(String str) {
                int count = 0;
                boolean isWord = false;
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isWhitespace(str.charAt(i))) {
                        if (!isWord) {
                            count++;
                            isWord = true;
                        }
                    } else {
                        isWord = false;
                    }
                }
                return count;
            }
        }
        public static void main(String ar[]){
            String str = "This is a string with multiple words.";
            int wordCount = countWords(str);
            System.out.println("The number of words in the string is: " + wordCount);
    
        }
        