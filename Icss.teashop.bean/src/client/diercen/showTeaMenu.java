package client.diercen;

import Utils.Goods.*;
import client.diyicen.Util;
import client.diyicen.showMain;
/*
 * 茶叶页面类
 */
public class showTeaMenu {
    private static final showTeaMenu teamenu = new showTeaMenu();
    public static showTeaMenu teamenu(){return teamenu;}
    public void teaMenu(){
        boolean con = true;
        do {
            System.out.println("===============茶叶信息管理================");
            System.out.println("\t\t 1.显示所有茶叶信息");
            System.out.println("\t\t 2.添加茶叶");
            System.out.println("\t\t 3.修改茶叶");
            System.out.println("\t\t 4.删除茶叶");
            System.out.println("\t\t 5.查询指定茶叶");
            System.out.println("=======================================");
            System.out.println("请输入数字选项，或输入\"n\"返回上级菜单:");
            String choose = Util.acceptInput("1", "2", "3", "4", "5", "n");

            switch (choose) {
                case "1":
                    showGoods.showgoods().showAll();
                    break;
                case "2":
                    addGoods.addgoods().add();
                    break;
                case "3":
                    modfiyGoods.modfiygoods().modify();
                    break;
                case "4":
                    deletGoods.deletgoods().delet();
                    break;
                case "5":
                    inquireGoods.inquiregoods().inquire();
                    break;
                case "n":
                    con = false;
                    showMain.showmain().showMainMenu();
                    break;
            }
        }while (con);
    }
}
