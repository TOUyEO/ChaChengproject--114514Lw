package Utils.Goods;
import Utils.GoodsDao;
import client.diercen.showTeaMenu;
import client.diyicen.Util;
import bean.Goods;
import java.util.Scanner;
/*
 * 茶叶添加操作
 */
public class addGoods {
    private static addGoods addgoods = new addGoods();
    public static addGoods addgoods(){
        return addgoods;
    }
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("茶城购物管理系统>>茶叶信息管理>>添加茶叶信息\n");
        System.out.print("请输入茶叶的名称：");
        String name = in.nextLine();
        System.out.print("请输入茶叶的价值：");
        int price = in.nextInt();
        System.out.print("请输入茶叶的积分：");
        int count = in.nextInt();

        Goods goods = new Goods();
        goods.setName(name);
        goods.setPrice(price);
        goods.setCount(count);
        GoodsDao.goodsDao().add(goods);
        System.out.println("添加成功！");

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showTeaMenu.teamenu().teaMenu();
        }

    }
}
