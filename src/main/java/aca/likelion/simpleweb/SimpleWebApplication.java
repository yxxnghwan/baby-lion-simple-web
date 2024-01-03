package aca.likelion.simpleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
		// 톰캣 실행
		// /path
		// frontController dispatcherServlet

		/*
		/**

		if (path.eq("/sum") && method.eq("GET")) {
			sumController.sum()
		}
		if (path.eq("hello"))
		...
		 */
	}

}
