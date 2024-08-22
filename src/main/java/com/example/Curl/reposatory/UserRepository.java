package com.example.Curl.reposatory;

import com.example.Curl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
