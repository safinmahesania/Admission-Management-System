public class AgeArray {
    private int[] age;
    private int count;

    public AgeArray(int length){
        age = new int[length];
    }

    public void insert(int Age,int index){
        if(age.length == count){
            int[] newAge = new int[count*2];
            for(int i =0; i<count; i++ ){
                newAge[i] = age[i];
            }
            age = newAge;
        }
        age[index++] = Age;
        count++;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i = index; i < count; i++)
            age[i] = age[i + 1];
        count--;
    }

    public void update(int Age, int index){
        age[index] = Age;
    }

    public int returnAge(int index){
        return age[index];
    }

    public void print(int index){
        System.out.println("Age: "+age[index]);
    }
}