package com.UserDefindClassDataType.StudentDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext context= new ClassPathXmlApplicationContext("com/UserDefindClassDataType/StudentDetails/config.xml");
  StudentDetails stud1=context.getBean("stud1",StudentDetails.class);
  System.out.println(stud1);
	}

}
