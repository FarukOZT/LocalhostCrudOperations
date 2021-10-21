package com.sampiyonlarligi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sampiyonlarligi.member.Members;


@Service
public class Services {
	
	public List<Members> 
	memberList = new ArrayList<>(Arrays.asList(
			new Members("1","Bergen","Sarılmışer"),
					new Members("2","Antony","Magamela")
					));

	public List<Members> getAllMemberList() {
		return memberList;
	}
	public void addMembers(Members members) {
			memberList.add(members);
			
		
	}
}
