package com.ecommerce;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

	@Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository repo;
    
//    @Test
//    public void testCreateUser() {
//    	User user = new User();
//    	user.setEmail("jasmeet@gmail.com");
//    	user.setPassword("juniindore123");
//    	user.setFirstName("Jasmeet");
//    	user.setLastName("Tuteja");
//    	
//    	User savedUser = repo.save(user);
////    	User existUser = entityManager.find(User.class, savedUser.getId());
////    	assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
//    }
    
    @Test
    public void testFindUserByEmail() {
    	String email="test1@test.com";
    	
    	User user = repo.findByEmail(email);
    	
    	assertThat(user).isNotNull();
    }
}
