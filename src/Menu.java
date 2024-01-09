import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{

    String name;

    int price;

    int i =1;

    String explanation;

    Scanner sc = new Scanner(System.in);

    List<Menu> menuList = new ArrayList<>();
    List<Menu> cart = new ArrayList<>();

    public Menu(String name, int price, String explanation){
        this.name=name;
        this.price = price;
        this.explanation=explanation;
    }

    public Menu(){

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return name + " | " + price + "원 | " + explanation;
    }


    public void show(){
        System.out.println("Buger King입니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 주세요");
        System.out.println();
        System.out.println("[ Buger King MENU ]");
        System.out.println("1.Whopper           |버거킹의 와퍼");
        System.out.println("2.Chicken           |버거킹의 치킨");
        System.out.println("3.Drinks            |버거킹의 음료");
        System.out.println("4.Dessert           |버거킹의 디저트");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5.Order             |장바구니를 확인 후 주문합니다.");
        System.out.println("6.Cancel            |진행중인 주문을 취소합니다");
        System.out.println();
        System.out.println("7.종료               |프로그램을 종료합니다.");
    }

    public void whopperMenu(){
        System.out.println("[ Whopper MENU ]");
        menuList.clear();
        menuList.add(new Menu("기네스와퍼", 9300, "기네스와퍼버거"));
        menuList.add(new Menu("몬스터와퍼", 9300, "디아블로소스가 곁들어진 와퍼버거"));
        menuList.add(new Menu("와퍼", 6900, "기본와퍼버거"));
        menuList.add(new Menu("와퍼 주니어", 4600, "주니어 와퍼버거"));
        for(int i=0; i<4; i++){
            System.out.println((i+1)+"."+menuList.get(i));
        }
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();

        System.out.println(menuList.get(choose-1));
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인   2취소");
        int select = sc.nextInt();
        sc.nextLine();
        switch (select){
            case 1:
                cart.add(menuList.get(choose-1));
                break;
            case 2:
                return;
        }
    }
    public void chickenMenu(){
        System.out.println("[ Chicken MENU ]");
        menuList.clear();
        menuList.add(new Menu("롱치킨버거", 4600, "롱치킨 버거"));
        menuList.add(new Menu("킹치킨버거", 3600, "치킨이 들어간 버거"));
        menuList.add(new Menu("바삭킹", 5600, "매운 치킨"));
        menuList.add(new Menu("너겟킹", 4000, "치킨 조각"));

        for(int i=0; i<4; i++){
            System.out.println((i+1)+"."+menuList.get(i));
        }
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();

        System.out.println(menuList.get(choose-1));
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인   2취소");
        int select = sc.nextInt();
        sc.nextLine();
        switch (select){
            case 1:
                cart.add(menuList.get(choose-1));
                break;
            case 2:
                return;
        }
    }
    public void drinksMenu(){
        System.out.println("[ Drinks MENU ]");
        menuList.clear();
        menuList.add(new Menu("코카콜라", 2100, "코카콜라"));
        menuList.add(new Menu("제로콜라", 2100, "칼로리 없는 콜라"));
        menuList.add(new Menu("펩시제로", 2100, "칼로리 없는 펩시"));
        menuList.add(new Menu("스프라이트", 2100, "시원한 스프라이트"));

        for(int i=0; i<4; i++){
            System.out.println((i+1)+"."+menuList.get(i));
        }
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();

        System.out.println(menuList.get(choose-1));
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인   2취소");
        int select = sc.nextInt();
        sc.nextLine();
        switch (select){
            case 1:
                cart.add(menuList.get(choose-1));
                break;
            case 2:
                return;
        }

    }

    public void dessertMenu(){
        System.out.println("[ Dessert MENU ]");
        menuList.clear();
        menuList.add(new Menu("아이스크림", 900, "달콤한 아이스크림"));
        menuList.add(new Menu("아메리카노", 1500, "진한 아메리카노"));
        menuList.add(new Menu("핫초코", 2000, "진한 핫초코"));
        menuList.add(new Menu("치즈스틱", 2000, "맛있는 치즈시틱"));

        for(int i=0; i<menuList.size(); i++){
            System.out.println((i+1)+"."+menuList.get(i));
        }
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();

        System.out.println(menuList.get(choose-1));
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인   2취소");
        int select = sc.nextInt();
        sc.nextLine();
        switch (select){
            case 1:
                cart.add(menuList.get(choose-1));
                break;
            case 2:
                return;
        }
    }
    public void cartList(){

        System.out.println("[ ORDER ]");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i));
        }

        int totalPrice = totalPrice();
        System.out.println("Total Price: " + totalPrice +"원");

        System.out.println();
        System.out.println("1. 주문       2.메뉴판");
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();

        switch (choose){
            case 1:
                System.out.println();
                showOrder();
                break;
            case 2:
                break;
            default:
                System.out.println("잘못 입력했습니다.");
                break;
        }

    }

    public int totalPrice(){
        int totalPrice = 0;
        for(Menu menuCost : cart){
            totalPrice += menuCost.getPrice();
        }

        return totalPrice;
    }

    public void showOrder(){
        System.out.println("주문이 완료되었습니다!");
        System.out.println();
        System.out.println("대기번호는 "+ i + "번 입니다.");
        i++;
        try {
            System.out.println("3초후 메뉴판으로 돌아갑니다 ");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cancleOrder(){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인       2.취소");
        System.out.print("번호선택 : ");
        int choose = sc.nextInt();
        sc.nextLine();

        switch (choose){
            case 1:
                System.out.println();
                System.out.println("진행하던 주문이 취소되었습니다.");
                cart.clear();
                break;
            case 2:
                break;
            default:
                System.out.println("잘못 입력했습니다.");
                break;
        }

    }










}







