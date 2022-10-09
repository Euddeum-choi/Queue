import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("큐의 사이즈를 입력하세요");
        int queueSize = sc.nextInt();
        ArrayQueue arrayQueue = new ArrayQueue(queueSize);

        while (true){
            System.out.println("어떤 작업을 희망하십니까? \n1. 입력 2. 삭제 3. 피크값 도출 4. 전체삭제 5. 출력");
            int menu= sc.nextInt();
            switch (menu){
                case 1 :
                    System.out.print("입력할 값은? : ");
                    char input = sc.next().charAt(0);
                    arrayQueue.enqueue(input);
                    break;
                case 2 :
                    arrayQueue.dequeue();
                    System.out.println("삭제 완료");
                    break;
                case 3:
                    arrayQueue.peek();
                    break;
                case 4 :
                    arrayQueue.clear();
                    break;
                case 5:
                    arrayQueue.printQueue();
                    break;
                default:
                    System.out.println("잘못된 입력입니다!");
            }
        }
    }
}