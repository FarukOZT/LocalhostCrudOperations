package com.sampiyonlarligi.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.sampiyonlarligi.member.Members;

@Service
public class Services {
	
	public List<Members> 
	memberList = new ArrayList<>(Arrays.asList());
	
	public List<Members> getAllMemberList() {
		return memberList;
	}
	public void addMembers(Members members) {
		UUID id = UUID.randomUUID();
		members.setId(id);
		
		memberList.add(members);
	
	}
	public void deleteMembers(UUID id) {
		
		memberList.removeIf(m -> m.getId().equals(id));
	}

}

