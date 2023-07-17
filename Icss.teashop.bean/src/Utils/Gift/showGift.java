package Utils.Gift;
import Utils.GiftDao;
import client.diercen.showGiftMenu;
import client.diyicen.Util;
/*
 * 礼品信息查看操作
 */
public class showGift {
    private static final showGift showgift = new showGift();
    public static showGift showGift(){
        return showgift;
    }
    public void showAllGift(){
        System.out.println("茶城购物管理系统>>茶友信息管理>>显示所有茶友信息\n");
        GiftDao.GiftDao().showList();

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showGiftMenu.giftmenu().giftMenu();
        }
    }
}
