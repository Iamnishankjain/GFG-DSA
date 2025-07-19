class Pair{
    int st;
    int end;
    int ind;
    Pair(int st,int end,int ind){
        this.st=st;
        this.end=end;
        this.ind=ind;
    }
}


class itemComparator implements Comparator<Pair>{
    public int compare(Pair a,Pair b){
        if(a.end>b.end) return 1;
        else if(b.end>a.end) return -1;
        else return 0;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=start.length;
        Pair meeting[]=new Pair[n];
        for(int i=0;i<n;i++){
            meeting[i]=new Pair(start[i],end[i],i);
        }
        Arrays.sort(meeting,new itemComparator());
        int freetime=-1;
        for(int i=0;i<n;i++){
            if(freetime<meeting[i].st){
                list.add(meeting[i].ind);
                freetime=meeting[i].end;
            }
        }
        return list.size();
    }
}
