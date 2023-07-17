package Utils;
import bean.Order;
import client.diercen.teaSettlement;
import client.diyicen.Util;
import static db.DB.orderList;
/*
 * 茶叶结算所有操作
 */
public class TeaSettlementDao {
    private static final TeaSettlementDao teaSettlementDao= new TeaSettlementDao();
    public static TeaSettlementDao teaSettlementDao(){
        return teaSettlementDao;
    }
    // 查看操作
    public void showSettlement(){
        System.out.println("茶友手机号\t茶叶名称\t总价\t\t数量");
        for(Order c : orderList) {
            System.out.println(c.getPhone() + "\t" + c.getName() + "\t" + c.getPrice() + "\t" + c.getQuantity());
        }

            System.out.println();
            System.out.println("返回输入n");
            String item = Util.acceptInput("n");
            if("n".equals(item)){
                teaSettlement.settlement().teasettlement();
            }
        }

    // 结算操作
    public void settlement(){
        // 计算总金额
        double totalAmount = 0;
        for (Order order : orderList) {
            totalAmount += order.getPrice();
        }
        // 生成结算单据
        System.out.println("茶叶结算单据：");
        System.out.println("=====================");
        for (Order order : orderList) {
            System.out.println("茶叶名称: " + order.getName());
            System.out.println("数量: " + order.getQuantity());
            System.out.println("---------------------");
        }
        System.out.println("总金额: " + totalAmount);
        System.out.println("=====================");
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            teaSettlement.settlement().teasettlement();
        }
    }
}
