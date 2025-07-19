class Pair{
    int weight;
    int value;
    Pair(int value,int weight){
        this.weight=weight;
        this.value=value;
    }
}

class itemComparator implements Comparator<Pair>{
    public int compare(Pair a,Pair b){
        double r1=(double)a.value/(double)a.weight;
        double r2=(double)b.value/(double)b.weight;
        if(r1<r2) return 1;
        else if(r2<r1) return -1;
        return 0;
    }
}

class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        Pair items[]=new Pair[values.length];
        
        for(int i=0;i<values.length;i++){
            items[i]=new Pair(values[i],weights[i]);
        }
        
        Arrays.sort(items,new itemComparator());
        double total=0;
        for(int i=0;i<values.length;i++){
            if(items[i].weight<=W){
                total+=(double)items[i].value;
                W-=items[i].weight;
            }
            else{
                total+= (((double)items[i].value/(double)items[i].weight)*W);
                break;
            }
        }
        return total;
    }
}


