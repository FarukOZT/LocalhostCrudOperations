package com.sampiyonlarligi.memberController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sampiyonlarligi.member.Members;
import com.sampiyonlarligi.service.Services;

@RestController
public class MemberController {
	
	@Autowired
	public Services services;
	
	@RequestMapping("/members")
	public List<Members> all_members() {
		
		return services.getAllMemberList();
	}
	@RequestMapping(method = RequestMethod.POST,value ="/members")
		public void addMembers(@RequestBody Members members) {
		
		services.addMembers(members);
			
	}
	
}
