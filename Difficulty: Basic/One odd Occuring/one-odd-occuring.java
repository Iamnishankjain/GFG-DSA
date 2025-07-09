class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        int xor=0;
        for(int i: arr){
            xor^=i;
        }
        return xor;
    }
}
