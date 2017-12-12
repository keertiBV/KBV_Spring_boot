package com.keerti.javabrains.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String name, String password) {
        // in28minutes, dummy
        return name.equalsIgnoreCase("Keerti")
                && password.equalsIgnoreCase("keerti");
    }

	
}
