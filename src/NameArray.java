public class NameArray {
    private String[] name;
    private int count;

    public NameArray(int length){
        name = new String[length];
    }

    public void insert(String Name,int index){
        if (name.length == count){
            String[] newName = new String[count*2];
            for(int i =0; i<count; i++ ){
                newName[i] = name[i];
            }
            name = newName;
        }
        name[index++] = Name;
        count++;
    }
    public void update(String Name, int index){
        name[index] = Name;
    }

    public void removeAt(int index){
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i<count; i ++)
            name[i] = name[i+1];
        count --;
    }

    public String returnName(int index){
        return name[index];
    }

    public void print(int index){
        System.out.println("Name: "+name[index]);
    }
}