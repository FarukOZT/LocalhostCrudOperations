package com.sampiyonlarligi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sampiyonlarligi.member.Members;

@Service
public class ServicesImpl implements Services {
	
	public List<Members> 
	memberList = new ArrayList<>(Arrays.asList());
	
	public List<Members> getAllMemberList() {
		return memberList;
	}
	public Optional<Members> getMember(UUID id) {
		return Optional.ofNullable(memberList.stream().filter(m -> m.getId().equals(id))
											.findFirst().get());
	}
	public Members addMembers(Members members) {
		UUID id = UUID.randomUUID();
		members.setId(id);
		memberList.add(members);
		return members;
	}
	public void deleteMembers(UUID id) {
		
		memberList.removeIf(m -> m.getId().equals(id));
	}
	
}

