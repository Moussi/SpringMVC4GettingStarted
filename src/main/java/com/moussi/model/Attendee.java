package com.moussi.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.moussi.view.Phone;

public class Attendee {
		
		@Size(min=2,max=30)
		private String name;
		@NotEmpty 
		@Email
		private String emailAddress;
		
		@Phone
		@NotEmpty
		private String phone;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		
}
