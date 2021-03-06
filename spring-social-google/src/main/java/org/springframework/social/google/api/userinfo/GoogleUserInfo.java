/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.google.api.userinfo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model class representing the logged-in user details.
 * 
 * @author Gabriel Axel
 */
public class GoogleUserInfo implements Serializable {

	private static final long serialVersionUID = -634483399121748105L;

	private String id;

	private String email;

	private String name;

	@JsonProperty("given_name")
	private String firstName;

	@JsonProperty("family_name")
	private String lastName;

	private String link;

	@JsonProperty("picture")
	private String profilePictureUrl;

	private String gender;

	private String locale;
	
	public GoogleUserInfo() {
		
	}
	
	public GoogleUserInfo(String id, String email, String name,
			String firstName, String lastName, String link,
			String profilePictureUrl, String gender, String locale) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.link = link;
		this.profilePictureUrl = profilePictureUrl;
		this.gender = gender;
		this.locale = locale;
	}



	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLink() {
		return link;
	}

	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}

	public String getGender() {
		return gender;
	}

	public String getLocale() {
		return locale;
	}

}
