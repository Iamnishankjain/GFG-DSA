class Solution {
    static List<Integer> get(int a, int b) {
        List<Integer> list=new ArrayList<>();
        // code here
        a=a^b;
        b=a^b;
        a=a^b;
        list.add(a);
        list.add(b);
        return list;
    }
}