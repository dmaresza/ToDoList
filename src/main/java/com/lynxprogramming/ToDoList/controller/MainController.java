/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lynxprogramming.ToDoList.controller;

import com.lynxprogramming.ToDoList.model.Task;
import com.lynxprogramming.ToDoList.repository.TaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author daniel
 */
@Controller
public class MainController {
    
    @Autowired
    private TaskRepository taskRepository;
    
    @RequestMapping("/")
    public String getTasks(Model model) {
        List<Task> tasks = taskRepository.findAll();
        model.addAttribute("tasks", tasks);
        return "index";
    }
    
    @RequestMapping("/tasks/{id}")
    public String closeTask(@PathVariable int id) {
        taskRepository.deleteById(id);
        return "redirect:/";
    }
    
    @RequestMapping("/newTask")
    public String getTaskForm() {
        return "task-form";
    }
    
    @PostMapping("processForm")
    public String addTask(@ModelAttribute Task task) {
        taskRepository.save(task);
        return "redirect:/";
    }
    
    @RequestMapping("/sortByPriority")
    public String getAllByPriority(Model model) {
        List<Task> tasks = taskRepository.findAllByOrderByPriority();
        model.addAttribute("tasks", tasks);
        return "index";
    }
}
