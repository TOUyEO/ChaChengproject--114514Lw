package client;
import Utils.modifyPwd;
import client.diyicen.Util;
import client.diyicen.showMain;
import java.util.Scanner;
import static client.diyicen.Util.acceptInput;
/*
 *登录菜单页面类
 */
public class Menu {
    Scanner in = new Scanner(System.in);
    // 单例模式
    private static final Menu menu = new Menu();
    public static Menu menu(){
        return menu;
    }

    public void showLoginMenu(){
        do {
            System.out.println("☆☆☆☆☆欢迎使用云鬓花颜---茶城管理系统☆☆☆☆☆");
            System.out.println("=======================================");
            System.out.println("\t\t 1. 登陆茶友系统");
            System.out.println("\t\t 2. 修改管理员密码");
            System.out.println("\t\t 3. 退出系统");
            System.out.println("=======================================");
            // 输入内容
            System.out.println("请选择菜单选项：");
            String choose = acceptInput("1","2","3");
            switch (choose){
                case "1":
                    if(Util.login())
                        showMain.showmain().showMainMenu();
                    break;
                case "2":
                    if(Util.login())
                        modifyPwd.modifypwd();
                    break;
                case "3":
                    System.out.println("~~~~~~~欢迎下次使用~~~~~~~");
                    System.exit(0);
            }
        }while (true);
    }
}
