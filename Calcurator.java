import java.util.*;

public class Calcurator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0, serve_menu = 0;
        Loop1: while (true) {
            System.out.println("메뉴를 골라주세요.");
            System.out.println("----메뉴----");
            System.out.println("1.계산기");
            System.out.println("2.종료");
            System.out.println("-----------");
            menu = scan.nextInt();
            if (menu == 1) {
                for (;;) {
                    System.out.println("계산기 프로그램을 실행합니다.");
                    System.out.println("----------------------");
                    System.out.println("<<메뉴>>");
                    System.out.println("1.덧셈");
                    System.out.println("2.뺄셈");
                    System.out.println("3.곱셈");
                    System.out.println("4.나눗셈");
                    System.out.println("5.계산기 프로그램 종료");
                    System.out.println("6.시스템 종료");
                    System.out.println("선택>>>");
                    System.out.println("----------------------");
                    serve_menu = scan.nextInt();
                    if (serve_menu == 1) {
                        System.out.println("첫번째 숫자 입력:");
                        int num1 = scan.nextInt();
                        System.out.println("두번째 숫자 입력:");
                        int num2 = scan.nextInt();

                        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

                    } // if(serve_menu==1)
                    if (serve_menu == 2) {
                        System.out.println("첫번째 숫자 입력:");
                        int num1 = scan.nextInt();
                        System.out.println("두번째 숫자 입력:");
                        int num2 = scan.nextInt();

                        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

                    }
                    if (serve_menu == 3) {
                        System.out.println("첫번째 숫자 입력:");
                        int num1 = scan.nextInt();
                        System.out.println("두번째 숫자 입력:");
                        int num2 = scan.nextInt();

                        System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));

                    }
                    if (serve_menu == 4) {
                        System.out.println("첫번째 숫자 입력:");
                        int num1 = scan.nextInt();
                        System.out.println("두번째 숫자 입력:");
                        int num2 = scan.nextInt();

                        System.out.println(num1 + "%" + num2 + "=" + ((double) num1 / num2));

                    }
                    if (serve_menu == 5) {
                        System.out.println("계산기 프로그램 종료");
                        break;
                    }
                    if (serve_menu == 6) {
                        System.out.println("시스템 종료");
                        break Loop1;
                    }

                } // for(;;)
            } // if(menu==0)
            if (menu == 2) {
                break;
            }

        }
    }
}
