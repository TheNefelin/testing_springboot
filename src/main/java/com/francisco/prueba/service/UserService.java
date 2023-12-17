package com.francisco.prueba.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.francisco.prueba.dto.request.UserDto;
import com.francisco.prueba.dto.request.UserDtoUpdate;
import com.francisco.prueba.dto.response.UserDtoRes;
import com.francisco.prueba.entity.User;
import com.francisco.prueba.entity.repository.UserRepository;
import com.francisco.prueba.utils.Utils;

@Service
public class UserService {
    
    private UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(UserDto userDto) {
        User user = new User();

        user.setName(userDto.getName());
        user.setMail(userDto.getMail());
        user.setPassword(userDto.getPassword());

        this.userRepository.save(user);
    }

    public List<UserDtoRes> getAll() {
        ModelMapper modelMapper = new ModelMapper();

        List<User> users = this.userRepository.findAll();
        
        return users.stream().map(user -> {
            return modelMapper.map(user, UserDtoRes.class);
        }).collect(Collectors.toList());
    }

    public UserDtoRes getById(String id) {
        if (Utils.isNumber(id)) return null;

        ModelMapper modelMapper = new ModelMapper();
        Optional<User> user = this.userRepository.findById(Integer.parseInt(id));
        
        return modelMapper.map(user, UserDtoRes.class);
    }

    public boolean delete(String id) {
        if (!Utils.isNumber(id)) return false;

        this.userRepository.deleteById(Integer.parseInt(id));
        return true;
    }

    public boolean update(UserDtoUpdate userDtoUpdate) {
        Optional<User> updateUser = this.userRepository.findById(userDtoUpdate.getId());

        if (updateUser.isEmpty()) return false;
        
        User user = updateUser.get();
        user.setName(Utils.isNullOrEmpty(userDtoUpdate.getName()) ? user.getName() : userDtoUpdate.getName());
        user.setMail(Utils.isNullOrEmpty(userDtoUpdate.getMail()) ? user.getMail() : userDtoUpdate.getMail());

        this.userRepository.save(user);

        return true;
    }
}

