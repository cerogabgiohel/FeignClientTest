package com.example.demo.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.CommentDto;

@FeignClient(name = "comments", url = "https://jsonplaceholder.typicode.com")
@Repository
public interface CommentRepository {
	
	@GetMapping(value = "/comments")
	List<CommentDto>findComments();

	
}
