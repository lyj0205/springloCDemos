package containeroverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import containeroverview.config.AppConfig;
import containeroverview.service.PetStoreServiceImpl;

public class MainApplication {
	
	public static void localVariableScope() {
		String hello = "Hello";
	}
	
    public static void main(String[] args) {
    	
    	// hello = "world";
    	
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        PetStoreServiceImpl petStoreService = 
        		context.getBean(PetStoreServiceImpl.class);
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");
    }
}