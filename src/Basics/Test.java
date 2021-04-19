package Basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//import jdk.internal.loader.Resource;

public class Test {

	
		public static void main(String[] args) {  
		    ClassPathResource resource=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Student student=(Student)factory.getBean("studentbean");  
		    student.displayInfo();  

	}

}
