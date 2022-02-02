package app.business.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UbuntuHost3Controller {


    @GetMapping("/get-hi-ubuntu-host2")
    public String getHelloFromUbuntuAppFromHost1(){
        return "Hi, I app2 from Ubuntu host 2";
    }
}
