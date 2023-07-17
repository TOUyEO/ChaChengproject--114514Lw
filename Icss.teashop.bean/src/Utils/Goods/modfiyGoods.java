package Utils.Goods;
import Utils.GoodsDao;
import client.diercen.showTeaMenu;
import client.diyicen.Util;
import bean.Goods;
import java.util.Scanner;
/*
 * 茶叶信息修改操作
 */
public class modfiyGoods extends GoodsDao {
    private static final modfiyGoods modfiygoods = new modfiyGoods();
    public  static modfiyGoods modfiygoods(){
        return modfiygoods;
    }
    public void modify(){
        Scanner in = new Scanner(System.in);
        Goods goods = new Goods();
        System.out.println("茶城购物管理系统>>茶友信息管理>>修改茶友信息");
        System.out.println("===================================");
        GoodsDao.goodsDao().showList();
        System.out.println("===================================");
        System.out.print("请输入茶友的名称：");
        String name = in.nextLine();
        while(selectGoods(name) == null){
            System.out.print("名称不存在或错误，请重新输入：");
            name = in.nextLine();
        }
        // 加判断，是否要修改手机号，如果要修改手机号，输入新的手机号3
        do{
            System.out.print("是否确定修改名称(y/n):");
            String flag = Util.acceptInput("y", "n");
            if ("y".equals(flag)) {
                if (selectGoods(name) != null) {
                    System.out.print("请输入要修改的名称");
                    String pho = in.nextLine();
                    goods.setName(pho);
                    System.out.println("修改成功！\n");
                    System.out.println("是否确定要修改价值(y/n)\n");
                    break;
                } else
                    System.out.println("输入的商品不存在");
            }if("n".equals(flag)){
                System.out.println("是否确定要修改价值(y/n)");
                break;
            }
        }while (true);
        do {
            String flag = Util.acceptInput("y", "n");
            if ("y".equals(flag)) {
                System.out.print("请输入修改后的价格：");
                int price = in.nextInt();
                if (price != goods.getPrice()) {
                    goods.setPrice(price);
                    System.out.println("修改成功！");
                    break;
                }
            }if("n".equals(flag)){
                System.out.println("是否确定要修改库存(y/n)");
                break;
            }
        }while (true);
        do {
            String flag = Util.acceptInput("y", "n");
            if ("y".equals(flag)) {
                System.out.print("请输入修改后的库存：");
                int count = in.nextInt();
                if (count != goods.getCount()) {
                    goods.setCount(count);
                    System.out.println("修改成功！");
                    break;
                }
            }
            if ("n".equals(flag)) {
                break;
            }
        }while(true);
        modify(name,goods);

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showTeaMenu.teamenu().teaMenu();
        }
    }
}
