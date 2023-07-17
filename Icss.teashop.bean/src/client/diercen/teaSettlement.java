package client.diercen;

import Utils.TeaSettlementDao;
import client.diyicen.Util;
import client.diyicen.showMain;

/*
 *茶叶结算页面类
 */
public class teaSettlement {
    private static final teaSettlement settlement = new teaSettlement();
    public static teaSettlement settlement(){return settlement;}

    public void teasettlement(){
        boolean con = true;
        do {
        System.out.println("===============茶叶结算================");
        System.out.println("\t\t 1.查看订单");
        System.out.println("\t\t 2.结算");
        System.out.println("=======================================");
        System.out.println("请输入数字选项，或输入\"n\"返回上级菜单:");
        String choose = Util.acceptInput("1", "2", "n");

        switch (choose) {
            case "1":
                TeaSettlementDao.teaSettlementDao().showSettlement();
                break;
            case "2":
                TeaSettlementDao.teaSettlementDao().settlement();
                break;
            case "n":
                con = false;
                showMain.showmain().showMainMenu();
                break;
        }
    }while (con);

    }
}
