import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            menu.show();

            System.out.print("번호 선택: ");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    menu.whopperMenu();
                    break;
                case 2:
                    menu.chickenMenu();
                    break;
                case 3:
                    menu.drinksMenu();
                    break;
                case 4:
                    menu.dessertMenu();
                    break;
                case 5:
                    menu.cartList();
                    break;
                case 6:
                    menu.cancleOrder();
                    break;
                case 7:
                    System.out.println("사용을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다.");
                    break;
            }
        }
    }
}
