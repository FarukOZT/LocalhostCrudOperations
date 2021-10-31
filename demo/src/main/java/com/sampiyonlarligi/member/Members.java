package com.sampiyonlarligi.member;

import java.util.UUID;

import org.springframework.data.annotation.Id;

public class Members {
		
		@Id
		private UUID id;
		private String name;
		private String surname;
		
		public Members(UUID id, String name, String Surname) {

		}
		public Members() {

		}
		
		public UUID getId() {
			return id;
		}
		public void setId(UUID id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		

}
