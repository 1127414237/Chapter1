package test;

import dao.ProviderDao;
import entity.Provider;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis.xml");

        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(is);
        SqlSession session=factory.openSession();
        ProviderDao ud=session.getMapper(ProviderDao.class);
        int sum=ud.countSum();
        System.out.print("一共有"+sum+"条数据");
    }
}
