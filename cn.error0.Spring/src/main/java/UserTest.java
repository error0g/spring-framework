import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UserTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml");
		User user= (User) context.getBean("user");
//		Class c=User.class;
//		Constructor declaredConstructor;
//		Class[] parameterTypes;
//		User user = null;
//		try {
//			 declaredConstructor = c.getDeclaredConstructor();
//			parameterTypes = declaredConstructor.getParameterTypes();
//			user= (User) declaredConstructor.newInstance();
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		}
		System.out.println(user.getName());
	}
}
