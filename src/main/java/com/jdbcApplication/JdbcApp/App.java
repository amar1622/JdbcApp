package com.jdbcApplication.JdbcApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jdbcApplication/JdbcApp/ApplicationContext.xml");

		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

		//String query = "INSERT INTO `project1`.`student` (`student_id`, `student_name`, `address`) VALUES ('6', 'shubham', 'chaibasa')";
		String query = "INSERT INTO `project1`.`student` (`student_id`, `student_name`, `address`) VALUES (?,?,?)";
		
		int result =jdbcTemplate.update(query,9,"Kundan","barauni");

		// statement
		// prepaidStatement
		
		// System.out.println("result "+ result);
	}

}
