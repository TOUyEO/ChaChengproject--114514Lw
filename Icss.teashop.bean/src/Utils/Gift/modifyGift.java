package Utils.Gift;
import Utils.GiftDao;
import client.diercen.showGiftMenu;
import client.diyicen.Util;
import bean.Gift;
import java.util.Scanner;
/*
 * 礼品信息修改操作
 */
public class modifyGift extends GiftDao {
    private static final modifyGift modifygift = new modifyGift();
    public static modifyGift modifygift(){return modifygift;}

    public void modify(){
        Scanner in = new Scanner(System.in);
        Gift gift = new Gift();
        System.out.println("茶城购物管理系统>>礼品信息管理>>修改礼品信息");
        System.out.println("=============================");
        GiftDao.GiftDao().showList();
        System.out.println("=============================");
        System.out.print("请输入礼品的名称：");
        String name = in.nextLine();
        while(selectGift(name) == null){
            System.out.print("名称不存在或错误，请重新输入：");
            name = in.nextLine();
        }
        do{
            System.out.print("是否确定修改名称(y/n):");
            String flag = Util.acceptInput("y", "n");
            if ("y".equals(flag)) {
                if (selectGift(name) != null) {
                    System.out.print("请输入要修改的名称");
                    String nam = in.nextLine();
                    gift.setName(nam);
                    System.out.println("修改成功！\n");
                    System.out.println("是否确定要修改价值(y/n)\n");
                    break;
                } else
                    System.out.println("输入的礼品不存在");
            }if("n".equals(flag)){
                System.out.print("是否确定要修改价值(y/n)");
                break;
            }
        }while (true);
        do {
            String flag = Util.acceptInput("y", "n");
            if ("y".equals(flag)) {
                System.out.print("请输入修改后的价值：");
                int price = in.nextInt();
                if (price != gift.getPrice()) {
                    gift.setPrice(price);
                    System.out.println("修改成功！");
                    break;
                }
            }if("n".equals(flag)){
                break;
            }
        }while (true);
        do {
            System.out.print("是否确定要修改库存(y/n)");
            String flag = Util.acceptInput("y", "n");
            if ("y".equals(flag)) {
                System.out.print("请输入修改后的库存：");
                int count = in.nextInt();
                if (count != gift.getCount() && count >= 0) {
                    gift.setCount(count);
                    System.out.println("修改成功！");
                    break;
                }
            }if("n".equals(flag)){
                break;
            }
        }while (true);
        modify(name,gift);

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showGiftMenu.giftmenu().giftMenu();
        }
    }
}
