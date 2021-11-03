package com.sampiyonlarligi.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.sampiyonlarligi.member.Members;

public interface Services {
	
	Members addMembers(Members members);
	void deleteMembers(UUID id);
	List<Members> getAllMemberList();
	Optional<Members> getMember(UUID id);
}
	
	

