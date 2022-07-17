package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{
    
	
	@Query(nativeQuery=true,value="select * from users where email = :username")
	UserEntity getByUsername(String username);
     
	
	@Query(nativeQuery=true,value="select * from users where email = :username and password= :password")
	UserEntity getByPassword(String username,String password);

}
