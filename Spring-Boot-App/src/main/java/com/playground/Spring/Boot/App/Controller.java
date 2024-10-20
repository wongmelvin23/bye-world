/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.playground.Spring.Boot.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Melvin
 */

@RestController
public class Controller {
  
    // One syntax to implement a
    // GET method
    @GetMapping("/")
    public String home()
    {
        String str
            = "<html><body><font color=\"green\">"
              + "<h1>WELCOME To GeeksForGeeks</h1>"
              + "</font></body></html>";
        return str;
    }
  
    // Another syntax to implement a GET method
    @RequestMapping(
        method = { RequestMethod.GET },
        value = { "/gfg" })
    public String info()
    {
        String str2
            = "<html><body><font color=\"green\">"
              + "<h2>GeeksForGeeks is a Computer"
              + " Science portal for Geeks. "
              + "This portal has been "
              + "created to provide well written, "
              + "well thought and well explained "
              + "solutions for selected questions."
              + "</h2></font></body></html>";
        return str2;
    }
}
