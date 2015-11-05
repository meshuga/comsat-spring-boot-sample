package io.katharsis.comsat.example.controller;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() throws InterruptedException, SuspendExecution {
        Fiber.sleep(10);
        return "hello world from the outer space!";
    }
}