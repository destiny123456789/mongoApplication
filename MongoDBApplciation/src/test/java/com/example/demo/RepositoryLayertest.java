package com.example.demo;



//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
//import com.example.demo.repo.UserRepository;
//import com.netflix.discovery.converters.Auto;

@DataMongoTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class RepositoryLayertest {
	
	
	@Autowired
	private TestEntityManager testEntityManager;
    
	@Autowired
	private UserRepository userDao;
	
	
	@org.junit.Test 
	public void fetchUser() {
		
		//User user=new User();
		User user1 = new User();
		user1.setName("Pritam");
		user1.setUsername("Pritam");
		user1.setPassword("Pritam123");
		user1.setAddress("UP");
		user1.setCity("Noida");
		user1.setEmail("Pritam@gmail.com");
		user1.setPincode("424101");
		
		
	//	user.setId(55);
		testEntityManager.persist(user1);
		
		
	//	User user2=userDao.findByUsername(user1.getUsername());
		User user2=userDao.findByPincode(user1.getPincode()).get(0);
		
		
		//assertNotNull(user1);
		
		
		assertEquals(user1.getPincode(), user2.getPincode());
		//assertThat(user1.getPincode(), user2.getPincode());
		//assertEquals(user2.getAge(), user.getAge());
	}
	
	
	

}
