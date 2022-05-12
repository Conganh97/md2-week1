import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        StopWatch watch = new StopWatch();
        do {
            System.out.println("1. Start");
            System.out.println("2. End ");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    watch.stat();
                    System.out.println(watch.startTime);
                    break;
                case 2:
                    watch.end();
                    System.out.println(watch.endTime);
                    break;
                case 3:
                    System.out.println("Thời gian : "+watch.getElapsedTime());
                    break;
                default:
                    System.out.println("Nhập lại: ");
            }
        } while (choice != 4);
    }
}
