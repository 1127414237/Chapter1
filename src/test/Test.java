package test;


        import dao.UserDao;
        import entity.User;
        import org.apache.ibatis.io.Resources;
        import org.apache.ibatis.session.SqlSession;
        import org.apache.ibatis.session.SqlSessionFactory;
        import org.apache.ibatis.session.SqlSessionFactoryBuilder;

        import java.io.IOException;
        import java.io.InputStream;
        import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream is= Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(is);
        SqlSession session=factory.openSession();
        UserDao ud=session.getMapper(UserDao.class);
        List<User> user=ud.queryUser();
        for(User u: user){
            System.out.print(u.getUid()+"学号 " +u.getUname()+"----------"+u.getUbirthday());
        }
    }
}
