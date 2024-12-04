package com.billing.vmr.service;

import com.billing.vmr.collection.Login;
import com.billing.vmr.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final LoginRepository loginrepo;
    @Autowired
    public LoginService(LoginRepository loginrepo) {
        this.loginrepo = loginrepo;
    }

    public boolean login(String username, String password){
              return loginrepo.findByUserNameAndPassword(username, password) != null;
    }

    public String signup(String username, String password, String confirmPassword){
        if(!password.equalsIgnoreCase(confirmPassword)){
            return "Password and confirm password are not same";
        }
        if(username.isEmpty()){
            return "username is empty";
        }else{
            loginrepo.save(new Login(username,password));
        }

        return "successfully registered";
    }
}
