/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lynxprogramming.ToDoList.controller;

import com.lynxprogramming.ToDoList.model.Task;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author daniel
 */
@Controller
public class MainController {
    
    @RequestMapping("/")
    public String getTasks(Model model) {
        
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, 2, "Pay bills", LocalDate.of(2023, 4, 30)));
        tasks.add(new Task(2, 3, "Call Kychelle", LocalDate.of(2023, 04, 18)));
        tasks.add(new Task(3, 1, "Develop new feature in my app", LocalDate.of(2023, 05, 31)));
        tasks.add(new Task(4, 2, "Prepare for presentation", LocalDate.of(2023, 04, 24)));
        
        model.addAttribute("tasks", tasks);
        return "index";
    }
}
