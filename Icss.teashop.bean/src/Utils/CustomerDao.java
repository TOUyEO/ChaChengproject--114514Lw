package Utils;
import bean.Customer;
import db.DB;

    public class CustomerDao {
        private static CustomerDao customerDao = new CustomerDao();
        public static CustomerDao customerDao(){
            return customerDao;
        }
        /**
         * 查询所有
         */
        public void showList(){
            System.out.println("茶友号\t手机号\t茶友生日\t积分");
            for(Customer c : DB.customerList){
                System.out.println(c.getId()+"\t"+c.getPhone()+"\t"+c.getBirthday()+"\t"+c.getScore());
            }
        }

        /**
         * 添加客户到集合中
         * @param customer
         */
        public void add(Customer customer) {
            // 获取当前最后一个元素的id，将id+1之后赋值给新客户
            customer.setId(DB.customerList.get(DB.customerList.size()-1).getId()+1);
            DB.customerList.add(customer);
        }

        /**
         * 根据手机号修改茶友信息
         * @param phone
         * @param newCust
         */
        public void modify(String phone,Customer newCust){
            Customer customer = selectCustomer(phone);
            if(newCust.getPhone()!=null){
                customer.setPhone(newCust.getPhone());
            }
            if(newCust.getBirthday()!=null){
                customer.setBirthday(newCust.getBirthday());
            }
            if(newCust.getScore()!=0){
                customer.setScore(newCust.getScore());
            }
            System.out.println("修改后：");
            System.out.println("茶友号\t手机号\t茶友生日\t积分");
            System.out.println(customer.getId()+"\t"+customer.getPhone()+"\t"+customer.getBirthday()+"\t"+customer.getScore());
        }
        public void delete(String phone){
            Customer customer = selectCustomer(phone);
            DB.customerList.remove(customer);
            System.out.println("删除成功");
        }
        /**
         * 根据手机号查询茶友信息
         * @param phone
         * @return
         */
        public Customer selectCustomer(String phone){
            for(Customer c : DB.customerList){
                if(c.getPhone().equals(phone)){
                    return c;
                }
            }
            return null;
        }
        /**
         * 根据id查询茶友信息
         * @param id
         * @return
         */
        public Customer selectCustomer(long id){
            for(Customer c : DB.customerList){
                if(c.getId()==id){
                    return c;
                }
            }
            return null;
        }
    }

