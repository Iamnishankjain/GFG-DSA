// User function Template for Java

class LFUCache {

    static HashMap<Integer,Integer> cache;
    static HashMap<Integer,Integer> keyCount;
    static HashMap<Integer,LinkedHashSet<Integer>> frqMap;
    static int cap,min;
    LFUCache(int cap) {
        this.cap=cap;
        min=-1;
        cache=new HashMap<>();
        keyCount=new HashMap<>();
        frqMap=new HashMap<>();
        frqMap.put(1,new LinkedHashSet<>());
    }

    public static int get(int key) {
        if(!keyCount.containsKey(key)) return -1;
        int count=keyCount.get(key);
        keyCount.put(key,count+1);
        frqMap.get(count).remove(key);
        if(min==count && frqMap.get(count).size()==0) min++;
        if(!frqMap.containsKey(count+1)) frqMap.put(count+1,new LinkedHashSet<>());
        frqMap.get(count+1).add(key);
        return cache.get(key);
    }

        
    public static void put(int key, int value) {
        if (cap == 0) return;
        if(cache.containsKey(key)){
            cache.put(key,value);
            get(key);
            return;
        }
        
        if(cache.size()>=cap){
            int minFreq=frqMap.get(min).iterator().next();
            frqMap.get(min).remove(minFreq);
            keyCount.remove(minFreq);
            cache.remove(minFreq);
        }
        
        cache.put(key,value);
        keyCount.put(key,1);
        frqMap.get(1).add(key);
        min=1;
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */