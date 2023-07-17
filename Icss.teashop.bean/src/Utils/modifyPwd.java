package Utils;
import db.DB;
import java.util.Scanner;
/*
 * 修改密码陈操作
 */
public class modifyPwd {
    public static void modifypwd(){
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("请输入新密码(输入0退出修改密码)：");
            String newPwd = in.nextLine();
            if ("0".equals(newPwd)) {
                return;
            }
            System.out.print("请再次输入新密码(输入0退出修改密码)：");
            String rePwd = in.nextLine();
            if ("0".equals(rePwd)) {
                return;
            }
            if (newPwd.equals(rePwd)) {
                DB.manager.setPassword(newPwd);
                return;
            }else{
                System.out.println("两次输入密码不一致，请重新输入");
            }
        }
    }
}
