package constructor.injection;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Resource r=new ClassPathResource("application.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Employee s=(Employee)factory.getBean("e");  
	        s.show();  

	}

}
