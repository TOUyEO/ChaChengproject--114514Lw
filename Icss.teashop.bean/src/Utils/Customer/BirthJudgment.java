package Utils.Customer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 判断输入日期是否合法的类
 */
public class BirthJudgment {
    public Boolean Judgment(String str){
        DateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
        datef.setLenient(false);
        try {
            Date date = datef.parse(str);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}
