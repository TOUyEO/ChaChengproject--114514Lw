package Utils.Gift;
import Utils.GiftDao;
import client.diercen.showGiftMenu;
import client.diyicen.Util;
import bean.Gift;
import java.util.Scanner;
/*
 * 查询礼品信息的类
 */
public class inquireGift extends GiftDao {
    private static final inquireGift inquiregift = new inquireGift();
    public static inquireGift inquiregift(){
        return inquiregift;
    }

    public void inquire(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查询的礼品名称：");
        String inputkey = in.nextLine();
        Gift gift = new Gift();
        if(inputkey != null){
            gift = selectGift(inputkey);
            if(gift==null){
                System.out.println("您查询的礼品不存在");
            }
        }
        System.out.println("礼品名称\t\t价值\t\t积分");
        System.out.println(gift.getName()+"\t"+gift.getPrice()+"\t"+gift.getCount());

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showGiftMenu.giftmenu().giftMenu();
        }
    }
}
