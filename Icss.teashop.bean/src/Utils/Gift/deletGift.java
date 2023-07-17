package Utils.Gift;
import Utils.GiftDao;
import client.diercen.showGiftMenu;
import client.diyicen.Util;
import java.util.Scanner;
/*
 * 删除礼品信息的类
 */
public class deletGift extends GiftDao {
    private static final deletGift deletift = new deletGift();
    public static deletGift deletift(){
        return deletift;
    }

    public void delet(){
        Scanner in = new Scanner(System.in);
        System.out.println("茶城购物管理系统>>礼品信息管理>>删除礼品信息");
        System.out.println("=============================");
        GiftDao.GiftDao().showList();
        System.out.println("=============================");
        System.out.print("请输入礼品的名称：");
        String name = in.nextLine();

        System.out.print("是否确定删除(y/n):");
        String flag = Util.acceptInput("y","n");
        if("y".equals(flag)){
            delete(name);
        }


        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showGiftMenu.giftmenu().giftMenu();
        }
    }
}
