class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        int sw=0;
        int failed=0;
        for(int num:students){
            q.add(num);
        }
        while(!q.isEmpty()){
        int sd=q.poll();
        if(sd==sandwiches[sw]){
            sw++;
            failed=0;
        }else{
            q.add(sd);
            failed++;
        }
        if(failed==q.size()){
            break;
        }
        }
        return q.size();
    }
}