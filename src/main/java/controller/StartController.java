package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StartController {

    @GetMapping("")
    public String indexView() {
        return "start";
    }
}

// <Listener className="org.apache.catalina.core.JreMemoryLeakPreventionListener" driverManagerProtection="false" />