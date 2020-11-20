public class HammingDistance {
        public int hammingDistance(int x, int y) {
            int n = x^y;
            int c=0;
            while(n>0)
            {
                c++;
                n = n & n-1;
            }
            return c;
        }
    }

