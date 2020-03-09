package com.ibm;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//#2
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> user = repo.findByUserName(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("User not found" + username));
		
		return user.map(MyUserDetails::new).get();
		
		//#3
		//return new MyUserDetails(username);
	}

}
