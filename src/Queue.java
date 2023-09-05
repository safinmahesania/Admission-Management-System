import java.util.NoSuchElementException;

public class Queue{
    private Results[] queueArray;
    private int front;
    private int back;

    public Queue(int length){
        this.queueArray= new Results[length];
    }

    public void enQueue (Results results){
        if(back == queueArray.length){
            Results[] newArray = new Results[2*queueArray.length];
            System.arraycopy(queueArray,0,newArray,0,queueArray.length);
            queueArray = newArray;
        }
        queueArray[back++] = results;
    }

    public Results deQueue() {
        if (size() == 0)
            throw new NoSuchElementException();
        Results results = queueArray[front];
        queueArray[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return results;
    }

    public int size(){
        return back - front;
    }

    public void printQueue(){
        for (int i=front;i<back;i++){
            System.out.println(queueArray[i]);
        }
    }
}