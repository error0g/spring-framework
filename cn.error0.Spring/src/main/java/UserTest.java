import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UserTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\Administrator\\Desktop\\spring-framework\\cn.error0.Spring\\out\\production\\classes\\UserBean.xml");
		User user= (User) context.getBean("user");

		System.out.println(user.getName());
	}
}
