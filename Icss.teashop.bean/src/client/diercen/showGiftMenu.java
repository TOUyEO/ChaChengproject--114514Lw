package client.diercen;

import Utils.Gift.*;
import client.diyicen.Util;
import client.diyicen.showMain;
/*
礼品页面类
 */
public class showGiftMenu {
    private static final showGiftMenu giftmenu = new showGiftMenu();
    public static showGiftMenu giftmenu(){return giftmenu;}
    public void giftMenu(){
        boolean con = true;
        do {
            System.out.println("===============礼物信息管理================");
            System.out.println("\t\t 1.显示所有礼物信息");
            System.out.println("\t\t 2.添加礼物信息");
            System.out.println("\t\t 3.修改礼物信息");
            System.out.println("\t\t 4.删除礼物信息");
            System.out.println("\t\t 5.查询指定礼物信息");
            System.out.println("=======================================");
            System.out.println("请输入数字选项，或输入\"n\"返回上级菜单:");
            String choose = Util.acceptInput("1", "2", "3", "4", "5", "n");

            switch (choose) {
                case "1":
                    showGift.showGift().showAllGift();
                    break;
                case "2":
                    addGift.addgift().add();
                    break;
                case "3":
                    modifyGift.modifygift().modify();
                    break;
                case "4":
                    deletGift.deletift().delet();
                    break;
                case "5":
                    inquireGift.inquiregift().inquire();
                    break;
                case "n":
                    con = false;
                    break;
            }
        }while(con);
        showMain.showmain().showMainMenu();
    }
}
