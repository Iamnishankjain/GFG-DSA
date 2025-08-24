class Solution {
    public int numberOfPaths(int m, int n) {
        // Code Here
        int prevrow[]=new int[n];
		for(int i=0;i<m;i++){
			int rowtemp[]=new int[n];
			for(int j=0;j<n;j++){
				if(i==0 && j==0) {
					rowtemp[i]=1;
				}
				else{
					int up=0,down=0;
					if(i>0)
					up=prevrow[j];
					if(j>0)
					down=rowtemp[j-1];
					rowtemp[j]=up+down;
				}
			}
			prevrow=rowtemp;
		}
		return prevrow[n-1];
    }
}