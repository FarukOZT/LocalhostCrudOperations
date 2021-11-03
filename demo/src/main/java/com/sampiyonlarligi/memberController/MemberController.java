package com.sampiyonlarligi.memberController;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sampiyonlarligi.member.Members;
import com.sampiyonlarligi.service.Services;

@RestController
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	public Services services;
	
	@GetMapping
	public ResponseEntity<Members> getAllMemberList() {
		return new ResponseEntity(services.getAllMemberList(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Members> getAllMemberList(@PathVariable("id") UUID id){
		return new ResponseEntity(services.getMember(id),HttpStatus.OK);
	}
	
	@PostMapping("/add")
		public ResponseEntity<Members> addMembers(@RequestBody Members members) {
		return new ResponseEntity(services.addMembers(members),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
		public void deleteMembers(@PathVariable("id") UUID id) {
		services.deleteMembers(id);	
	}
	
}