package com.example.speaker;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface SpeakerRepository extends CrudRepository<Speaker, Long> {

	@RestResource(path = "by-twitter")
	Speaker findByTwitter(@Param("twitter") String twitter);

	@RestResource(path = "by-last-name")
	Collection<Speaker> findByLastName(@Param("lastName") String lastName);

}
