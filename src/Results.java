public class Results {

    private int id;
    private String Name;
    private String interview;
    private int age;

    public Results(int id, String Name, int age, String interview){
        this.id=id;
        this.Name=Name;
        this.age=age;
        this.interview=interview;
    }


    @Override
    public String toString() {
        return "ID = " + id +
                "       Name = " + Name +
                "       Age = " + age +
                "       Interview: = " + interview;
    }
}