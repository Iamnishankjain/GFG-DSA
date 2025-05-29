
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int count[]=new int[3];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int i=0;
        while(i<arr.length){
            for(int j=0;j<3;j++){
                for(int k=0;k<count[j];k++){
                    arr[i]=j;
                    i++;
                }
            }
        }
    }
}

