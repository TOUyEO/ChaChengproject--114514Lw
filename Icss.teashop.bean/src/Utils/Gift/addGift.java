package Utils.Gift;

import Utils.GiftDao;
import client.diercen.showGiftMenu;
import client.diyicen.Util;
import bean.Gift;
import java.util.Scanner;
/*
 * 添加礼品信息的类
 */
public class addGift extends GiftDao {
    private static final addGift addgift = new addGift();
    public static addGift addgift(){return addgift;}
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.println("茶城购物管理系统>>礼品信息管理>>添加礼品信息\n");
        System.out.print("请输入礼品的名称：");
        String name = in.nextLine();
        System.out.print("请输入礼品的价值：");
        int price = in.nextInt();
        System.out.print("请输入礼品的积分：");
        int count = in.nextInt();

        Gift gift = new Gift();
        add(gift);
        gift.setName(name);
        gift.setPrice(price);
        gift.setCount(count);
        GiftDao.GiftDao();
        System.out.println("添加成功！");

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showGiftMenu.giftmenu().giftMenu();
        }
    }
}
