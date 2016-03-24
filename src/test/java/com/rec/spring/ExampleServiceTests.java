package com.rec.spring;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleServiceTests {

	@SuppressWarnings("resource")
	@Test
	public void createContext() {
		try {
			new AnnotationConfigApplicationContext(AppConfig.class);
		} catch (BeanCreationException e) {
			assertTrue(e.getCause().getCause() instanceof NoSuchBeanDefinitionException);
		}
	}

}
