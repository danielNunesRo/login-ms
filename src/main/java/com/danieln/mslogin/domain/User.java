package com.danieln.mslogin.domain;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.danieln.mslogin.domain.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_users")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User implements UserDetails {
	
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.UUID)
	    private String id;

	    private String login;

	    private String password;

	    @Column(unique = true)
	    private String email;
	    @Column(unique = true)
	    private String cpf;

	    private String cep;

	    private UserRole role;

	    public User(String login, String password, String cpf, String cep, UserRole role, String email) {
	        this.login = login;
	        this.password = password;
	        this.cpf = cpf;
	        this.cep = cep;
	        this.role = role;
	        this.email = email;
	    }

	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        if(this.role == UserRole.ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
	        else return List.of(new SimpleGrantedAuthority("ROLE_USER"));
	    }


	    @Override
	    public String getUsername() {
	        return login;
	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }

		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}
	

}
