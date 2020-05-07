package com.roshan.security.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("userDetailsService")
public class LoginService implements UserDetailsService {

   private final Logger log = LoggerFactory.getLogger(LoginService.class);

   @Override
   public UserDetails loadUserByUsername(final String userName) {
      log.debug("Authenticating user '{}'", userName);
      List<GrantedAuthority> roles = new ArrayList<>();
      GrantedAuthority role = new GrantedAuthority() {
         @Override
         public String getAuthority() {
            return "admin";
         }
      };
      roles.add(role);
      return new User(userName, "$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi", roles);
   }
}
