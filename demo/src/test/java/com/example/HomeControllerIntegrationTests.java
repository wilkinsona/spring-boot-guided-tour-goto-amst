package com.example;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoApplication.class)
@WebIntegrationTest(randomPort = true)
public class HomeControllerIntegrationTests {

	@Value("${local.server.port}")
	private int port;

	@Test
	public void home() {
		String body = new TestRestTemplate("goto", "goto").getForObject("http://localhost:" + port, String.class);
		assertThat(body,  is(equalTo("Hello, Amsterdam")));
	}

}
