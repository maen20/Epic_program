import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    private PriorityQueue<Integer> lowerQueue; // Min heap
    private PriorityQueue<Integer> higherQueue; // Min heap
    public PriorityQueues() {
        lowerQueue = new  PriorityQueue<>(Comparator.<Integer>comparingInt(a->a).reversed());
        higherQueue = new PriorityQueue<>(Integer::compareTo);
    }
    public void addElement(int e) {
        higherQueue.add(e);
       if (higherQueue.size()-lowerQueue.size()>2) {
            int smallest = higherQueue.poll();
            lowerQueue.add(smallest);
        }
        
    }

    public void print() {
        System.out.println("lowerQueue: " + lowerQueue);
        System.out.println("higherQueue: " + higherQueue);
    }

    public static void main(String[] args) {
        PriorityQueues queue = new PriorityQueues();
        queue.addElement(5);
        queue.addElement(3);
        queue.addElement(7);
        queue.addElement(2);
        queue.addElement(9);
        queue.addElement(1);
        queue.addElement(4);
        queue.print();
    }
}
