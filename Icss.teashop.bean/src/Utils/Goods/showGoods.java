package Utils.Goods;

import Utils.GoodsDao;
import client.diercen.showTeaMenu;
import client.diyicen.Util;
/*
 * 茶叶信息查看操作
 */
public class showGoods {
    private static showGoods showgoods = new showGoods();
    public static showGoods showgoods(){
        return showgoods;
    }
    public void showAll(){
        System.out.println("茶城购物管理系统>>茶友信息管理>>显示所有茶友信息\n");
        GoodsDao.goodsDao().showList();

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showTeaMenu.teamenu().teaMenu();
        }
    }
}
