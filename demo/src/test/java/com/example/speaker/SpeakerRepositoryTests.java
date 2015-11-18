package com.example.speaker;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.DemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoApplication.class)
public class SpeakerRepositoryTests {

	@Autowired
	private SpeakerRepository speakerRepository;

	@Test
	public void findByTwitter() {
		Speaker arjen = speakerRepository.save(new Speaker("Arjen", "Poutsma", "apoutsma"));
		assertThat(speakerRepository.findByTwitter("apoutsma").getId(), is(equalTo(arjen.getId())));
	}

}
