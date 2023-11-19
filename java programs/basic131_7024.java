
            class GCDandLCM{
                public static int[] gcdAndLcm(int a, int b) {
                    int gcd = 1;
                    int lcm = a * b;
                
                    // Find the GCD using the Euclidean algorithm.
                    while (b != 0) {
                        int r = a % b;
                        a = b;
                        b = r;
                    }
                    gcd = a;
                
                    // Find the LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b).
                    lcm = (a * b) / gcd;
                
                    return new int[]{gcd, lcm};
                }
                public static void main(String ar[]){
                    int[] result = gcdAndLcm(12, 18);
    
                    System.out.println("GCD: " + result[0]); // 6
                    System.out.println("LCM: " + result[1]); // 36
                }
            }
        