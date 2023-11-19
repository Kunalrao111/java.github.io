
            public static String toLowerCase(String str) {
                String lowerStr = "";
                for (int i = 0; i < str.length(); i++) {
                  char ch = str.charAt(i);
                  if (ch >= 'A' && ch <= 'Z') {
                    ch += 32;
                  }
                  lowerStr += ch;
                }
                return lowerStr;
              }
              
              // Convert the string "HELLO WORLD" to lowercase.
              String str = "HELLO WORLD";
              String lowerStr = toLowerCase(str);
              
              // Print the lowercase string.
              System.out.println(lowerStr);
              
        