package com.backend.controller;


import com.backend.domain.Const;
import com.backend.entity.User;
import com.backend.repository.RoleRepository;
import com.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Secured({Const.ROLE_ADMIN})
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<User> save(@RequestBody User user){
        user = this.userRepository.save(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @Secured({Const.ROLE_ADMIN})
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseEntity<User> edit(@RequestBody User user){
        user = this.userRepository.save(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @Secured({Const.ROLE_CLIENT, Const.ROLE_ADMIN})
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Page<User>> list(
            @RequestParam("page") int page,
            @RequestParam("size") int size
    ){
        Pageable pageable = PageRequest.of(page, size, Sort.by("name"));
        return new ResponseEntity<Page<User>>(userRepository.findAll(pageable), HttpStatus.OK);
    }


}
