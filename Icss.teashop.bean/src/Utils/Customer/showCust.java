package Utils.Customer;

import client.diercen.showMenu;
import client.diyicen.Util;
import static Utils.CustomerDao.customerDao;
/*
 * 查看茶友信息的类
 */
public class showCust {
    private static final showCust show = new showCust();
    public static showCust show(){
        return show;
    }
    public void showAll(){
        System.out.println("茶城购物管理系统>>茶友信息管理>>显示所有茶友信息");
        customerDao().showList();
        System.out.println("输入n返回上级菜单");
        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showMenu.showmenu().showCustMenu();
        }
    }
}
