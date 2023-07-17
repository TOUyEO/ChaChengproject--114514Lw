package client.diercen;
import Utils.giveDao;
import client.diyicen.Util;
import client.diyicen.showMain;
/*
回馈页面类
 */
public class showgiveBack {
    private static final showgiveBack back = new showgiveBack();
    public static showgiveBack back(){return back;}

    public void giveback(){
        boolean con = true;
        do {
            System.out.println("===============回馈================");
            System.out.println("\t\t 1.发放积分");
            System.out.println("\t\t 2.发放礼品");
            System.out.println("\t\t 3.礼品回馈记录");
            System.out.println("=======================================");
            System.out.println("请输入数字选项，或输入\"n\"返回上级菜单:");
            String choose = Util.acceptInput("1", "2", "3","n");

            switch (choose) {
                case "1":
                    giveDao.dao().giveSorce();
                    break;
                case "2":
                    giveDao.dao().giveGift();
                    break;
                case "3":
                    giveDao.dao().showGiveBack();
                    break;
                case "n":
                    con = false;
                    break;
            }
        }while (con);
        showMain.showmain().showMainMenu();
    }
}
