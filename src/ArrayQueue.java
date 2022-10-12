import javax.xml.bind.SchemaOutputResolver;

public class ArrayQueue implements Queue {
    private int front;
    private int rear;

    private int queueSize;
    private char queueArr[];

    public ArrayQueue(int queueSize) {
        this.queueSize = queueSize;
        this.queueArr = new char[queueSize];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public boolean isEmpty() {
        if (front == rear) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean isFull() {
        if (rear == queueSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void enqueue(char item) {
        if (front == -1) {
            ++front;
            ++rear;
            queueArr[rear] = item;
        } else {
            ++rear;
            queueArr[rear] = item;
        }
    }

    @Override
    public char dequeue() {
        if (isEmpty()) {
            System.out.println("뺄 값이 없습니다.");
        } else {
            for (int i = front; i == rear - 1; i++) {
                queueArr[i] = queueArr[i + 1];
            }
            front = -1;
        }
        return queueArr[rear];
    }

    @Override
    public char peek() {
        System.out.println(queueArr[rear]);
        return queueArr[rear];
    }

    @Override
    public void clear() {
        this.front = -1;
        this.rear = -1;
        this.queueArr = new char[queueSize];
        System.out.println("전체 삭제 완료!");
    }

    public void printQueue() {
        if(isEmpty()){
            System.out.println("큐가 비어있습니다!");
        }else {
            System.out.println("=============================");
            System.out.print(" 큐의 값 : ");
            for(int i = front; i<=rear; i++){
                System.out.print(queueArr[i]);
            }
            System.out.println();
            System.out.println("==============================");
        }
    }
}
