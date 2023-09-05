public class IDArray {
    private int[] id;
    private int count;

    public IDArray(int length){
        id = new int[length];
    }

    public void insert(int ID,int index){
        if(id.length == count){
            int[] newID = new int[count*2];
            for(int i =0; i<count; i++ ){
                newID[i] = id[i];
            }
            id = newID;
        }
        id[index++] = ID;
        count++;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i = index; i<count; i ++)
            id[i] = id[i+1];
        count --;
    }

    public int returnID(int index){
        return id[index];
    }

    public void print(int index){
        System.out.println("ID: "+ id[index]);
    }
}