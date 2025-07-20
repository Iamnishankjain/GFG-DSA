class Job{
    int id,dead,pro;
    Job(int id,int dead,int pro){
        this.id=id;
        this.pro=pro;
        this.dead=dead;
    }
}
class jobComparator implements Comparator<Job>{
    public int compare(Job a,Job b){
        if(a.pro>b.pro) return -1;
        else if(a.pro<b.pro) return 1;
        return 0;
    }
}
class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] prof) {
        int n=prof.length;
        int profit=0,cnt=0;
        Job Alljobs[]=new Job[n];
        int maxDead=0;
        for(int i=0;i<n;i++){
            maxDead=Math.max(deadline[i],maxDead);
            Alljobs[i]=new Job(i,deadline[i],prof[i]);
        }
        Arrays.sort(Alljobs,new jobComparator());
        int res[]=new int[maxDead+1];
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++){
            Job j=Alljobs[i];
            if(res[j.dead]==-1){
                cnt++;
                profit+=j.pro;
                res[j.dead]=j.id;
            }else{
                for(int k=j.dead;k>=1;k--){
                    if(res[k]==-1){
                        cnt++;
                        profit+=j.pro;
                        res[k]=j.id;
                        break;
                    }
                }
            }
        }
        return new ArrayList<>(Arrays.asList(cnt, profit));
    }
}