package Utils;
import bean.Gift;
import db.DB;

public class GiftDao {
    private static final GiftDao GiftDao = new GiftDao();
    public static GiftDao GiftDao(){
        return GiftDao;
    }
    /**
     * 查询所有
     */
    public void showList(){
        System.out.println("礼品名称\t礼品价值\t兑换积分");
        for(Gift c : DB.giftList){
            System.out.println(c.getName()+"\t"+c.getPrice()+"\t\t"+c.getCount());
        }
    }

    /**
     * 添加礼品到集合中
     */
    public void add(Gift gift) {
        DB.giftList.add(gift);
    }

    /**
     * 根据名称修改礼品信息
     */
    public void modify(String phone,Gift newGift){
        Gift Gift = selectGift(phone);
        if(newGift.getName()!=null){
            Gift.setName(newGift.getName());
        }
        if(newGift.getPrice()!=0){
            Gift.setPrice(newGift.getPrice());
        }
        if(newGift.getCount()!=0){
            Gift.setCount(newGift.getCount());
        }
        System.out.println("修改后：");
        System.out.println("名称\t价值\t积分");
        System.out.println(Gift.getName()+"\t"+Gift.getPrice()+"\t"+Gift.getCount());
    }
    public void delete(String phone){
        Gift Gift = selectGift(phone);
        DB.giftList.remove(Gift);
        System.out.println("删除成功");
    }

    /**
     * 根据id查询礼品信息
     */
    public Gift selectGift(String name){
        for(Gift c : DB.giftList){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
}