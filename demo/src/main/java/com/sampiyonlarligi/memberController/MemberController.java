package com.sampiyonlarligi.memberController;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sampiyonlarligi.member.Members;
import com.sampiyonlarligi.service.Services;

@RestController

public class MemberController {
	
	@Autowired
	public Services services;
	
	@GetMapping("/members")
	public List<Members> all_members() {
		return services.getAllMemberList();
	}
	@PostMapping("/add")
		public void addMembers(@RequestBody Members members) {
		services.addMembers(members);
	}
	@DeleteMapping("/{id}")
		public void deleteMembers(@PathVariable("id") UUID id) {
		services.deleteMembers(id);
		
	}
	
}