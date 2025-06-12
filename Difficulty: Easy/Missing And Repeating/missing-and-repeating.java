

// User function Template for Java
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
         int n = arr.length;
        long sn = (long) n * (n + 1) / 2; 
        long s2n = (long) n * (n + 1) * (2 * n + 1) / 6;

        long s = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += (long) arr[i] * arr[i];
        }

        long val1 = s - sn;  // x - y
        long val2 = (s2 - s2n) / val1;  // x + y

        int x = (int) ((val1 + val2) / 2);  // Repeating number
        int y = (int) (x - val1);  // Missing number

        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }
}
