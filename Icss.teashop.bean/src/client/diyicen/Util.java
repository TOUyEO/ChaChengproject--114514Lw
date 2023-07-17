package client.diyicen;
import db.DB;
import java.util.Scanner;
/*
 * 检测用户名和密码是否正确的类
 */

public class Util {
    private static final Scanner in = new Scanner(System.in);
    public static String acceptInput(String... item){
        String result;
        boolean flag = false;
        do {
            result = in.nextLine();

            for (int i = 0;i<item.length;i++){
                if(result.equalsIgnoreCase(item[i])){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            System.out.println("输入错误，请重新输入");
        }while(true);
        return result;
    }

    public static boolean login(){
        for (int j = 5;;j--){

            System.out.println("请输入用户名：");
            String inputName = in.nextLine();
            // 判断输入的用户名是否正确
            if(inputName.equals(DB.manager.getName())){
                for(int i = 3; i>0; i--){
                    System.out.print("请输入密码(道友还有"+i+"次机会输入)：");
                    String inputPwd = in.nextLine();
                    // 判断密码是否正确
                    if(inputPwd.equals(DB.manager.getPassword()))
                        return true;
                    if(i == 1){
                        System.out.println("密码错误三次，请联系管理员！");
                        System.exit(0);
                    }
                    System.out.println("您的密码输入错误，请重新输入。");
                }
            }
            System.out.println("用户名输入错误，请重新输入。");
            if(j == 1) {
                System.out.println("超过5次输入错误，退出系统");
                System.exit(0);
            }
        }
    }
}
