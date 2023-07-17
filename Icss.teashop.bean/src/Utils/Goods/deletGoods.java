package Utils.Goods;
import Utils.GoodsDao;
import client.diercen.showTeaMenu;
import client.diyicen.Util;
import java.util.Scanner;
/*
 * 删除茶叶信息操作
 */
public class deletGoods extends GoodsDao{
    private static deletGoods deletgoods = new deletGoods();
    public static deletGoods deletgoods(){
        return deletgoods;
    }
    public void delet(){
        Scanner in = new Scanner(System.in);
        System.out.println("茶城购物管理系统>>茶友信息管理>>删除茶友信息");
        System.out.println("===================================");
        GoodsDao.goodsDao().showList();
        System.out.println("===================================");
        System.out.print("请输入茶叶的名称：");
        String name = in.nextLine();
        System.out.print("是否确定删除(y/n):");
        String flag = Util.acceptInput("y","n");
        if("y".equals(flag)){
            delete(name);
        }
        // 返回操作
        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showTeaMenu.teamenu().teaMenu();
        }
    }
}
