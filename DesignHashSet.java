//TimeComplexity
//add= O(1)
//remove= O(1)
//contains= O(1)






class MyHashSet {
    
    boolean[][] hashSet= new boolean[1001][];
    
    public int getIndexColumn(int key) {
        int index1 = key%1000;
        return index1;
    }
    
    public int getIndexRow(int key) {
        int index2 = key/1000;
        return index2;
    }
    
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        int index1 = getIndexColumn(key);
        int index2 = getIndexRow(key);
        
        if(hashSet[index1]==null){
            hashSet[index1] =new boolean[1001];    
        }
        hashSet[index1][index2]=true;    
    }
    
    public void remove(int key) {
        int index1 = getIndexColumn(key);
        int index2 = getIndexRow(key);
        if(hashSet[index1]!=null){
            hashSet[index1][index2]=false;
        }       
    }
    
    public boolean contains(int key) {
        int index1 = getIndexColumn(key);
        int index2 = getIndexRow(key);      
        if (hashSet[index1] != null && hashSet[index1][index2]==true){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
