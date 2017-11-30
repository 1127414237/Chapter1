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

public class Test3{
    public static void main(String[] args) throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(is);
        SqlSession session=factory.openSession();
        ProviderDao ud=session.getMapper(ProviderDao.class);
        List<Provider> provider=ud.queryProvider();
        System.out.print("id"+"      供应商编码"+"                         供应商名称"+"            供应商描述"+
                "     供应商联系人"+"           联系电话"+"      地址"+"      传真"+"      创建者"+"      创建时间"+"      更新者"+"      更新时间"+"      传真");
        for (Provider p:provider){
            System.out.println(p.getId()+"     ----"+p.getProCode()+"    ----"+p.getProName()+"    ----"+p.getProDesc()+"      ----"+p.getProContact()+"     ----"+p.getProPhone()+
            "    ----"+p.getProAddress()+"    ----"+p.getProFax()+"   ----"+p.getCreatedBy()+"   ----"+
            p.getCreationDate()+"   ----"+p.getModifyBy()+"   ----"+p.getModifyDate());

        }
    }

}
