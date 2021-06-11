package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CommentDto;
import com.example.demo.repository.CommentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("comments")
public class CommentController {

	private CommentRepository commentRepository;
	
	@GetMapping
	public List<CommentDto> findComments(){
		return commentRepository.findComments();
	}
}
