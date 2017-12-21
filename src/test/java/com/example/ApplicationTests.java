package com.example;

import java.io.File;

import org.junit.ClassRule;
import org.junit.Test;
import org.testcontainers.containers.DockerComposeContainer;

/**
 * @author Madhura Bhave
 */
public class ApplicationTests {

	@ClassRule
	public static DockerComposeContainer environment =
			new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"))
					.withExposedService("redis", 6379);

	@Test
	public void test1() throws Exception {
		System.out.println("hello");
	}
}
