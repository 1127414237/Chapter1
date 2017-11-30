package test;

import dao.XxxDao;
import entity.Xxx;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test4 {
    public static void main(String[] args) throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(is);
        SqlSession session=factory.openSession();
         XxxDao xd =session.getMapper(XxxDao.class);
         List<Xxx> xx=xd.queryXxx();
         for (Xxx x:xx){
             System.out.print(x.getId()+"----------"+x.getNumb()+"---------"+x.getPrice()+"--------"+x.getBornDate());
         }
    }
}
