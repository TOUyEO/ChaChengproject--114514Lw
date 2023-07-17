package Utils;
import bean.Goods;
import db.DB;

public class GoodsDao {
    private static final GoodsDao goodsDao = new GoodsDao();
    public static GoodsDao goodsDao(){
        return goodsDao;
    }
    /**
     * 查询所有
     */
    public void showList(){
        System.out.println("商品编号\t商品名称\t商品价值\t商品兑换积分");
        for(Goods c : DB.goodsList){
            System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getPrice()+"\t"+c.getCount());
        }
    }

    /**
     * 添加茶叶到集合中
     */
    public void add(Goods goods) {
        // 获取当前最后一个元素的id，将id+1之后赋值给新客户
        goods.setId(DB.goodsList.get(DB.goodsList.size()-1).getId()+1);
        DB.goodsList.add(goods);
    }

    /**
     * 根据手机号修改茶叶信息
     */
    public void modify(String name,Goods newGoods){
        Goods goods = selectGoods(name);
        if(newGoods.getId()!=0){
            goods.setId(newGoods.getId());
        }
        if(newGoods.getName()!=null){
            goods.setName(newGoods.getName());
        }
        if(newGoods.getPrice()!=0){
            goods.setPrice(newGoods.getPrice());
        }
        if(newGoods.getCount()!=0){
            goods.setCount(newGoods.getCount());
        }
    }

    /**
     * 删除信息
     */
    public void delete(String name){
        Goods goods = selectGoods(name);
        DB.goodsList.remove(goods);
        System.out.println("删除成功");
    }
    /**
     * 根据名称查询茶叶信息
     */
    public Goods selectGoods(long id){

        for(Goods c : DB.goodsList){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    /**
     * 根据name查询商品信息
     */
    public Goods selectGoods(String name){
        for(Goods c : DB.goodsList){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
}

