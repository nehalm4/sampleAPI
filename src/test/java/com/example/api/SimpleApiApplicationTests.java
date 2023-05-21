package com.example.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class SimpleApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void verifyHelloMessage() throws Exception {
		String patternString = "(Hello AWS Continuous Delivery! From host: ).*\\/\\d+.\\d+.\\d+.\\d+";
		org.hamcrest.Matcher<String> regexMatcher = Matchers.matchesRegex(patternString);

		this.mockMvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(regexMatcher));
	}

}