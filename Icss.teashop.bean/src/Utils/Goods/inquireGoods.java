package Utils.Goods;
import Utils.GoodsDao;
import client.diercen.showTeaMenu;
import client.diyicen.Util;
import bean.Goods;
import java.util.Scanner;
/*
 * 茶叶查询操作
 */
public class inquireGoods extends GoodsDao{
    private static inquireGoods inquiregoods = new inquireGoods();
    public static inquireGoods inquiregoods(){
        return inquiregoods;
    }
    public void inquire(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查询的茶叶名称：");
        String inputkey = in.nextLine();
        Goods goods = new Goods();
        if(inputkey != null){
            goods = selectGoods(inputkey);
            if(goods==null){
                System.out.println("您查询的茶叶不存在");
            }
        }
        System.out.println("商品编号\t商品名称\t\t价格\t\t积分");
        System.out.println(goods.getId()+"\t"+goods.getName()+"\t"+goods.getPrice()+"\t"+goods.getCount());

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showTeaMenu.teamenu().teaMenu();
        }
    }
}
