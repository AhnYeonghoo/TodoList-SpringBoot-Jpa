package com.example.demo.controller;


import com.example.demo.entity.TodoEntity;
import com.example.demo.repository.TodoRepository;
import com.example.demo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class TodoController {

    private final TodoService todoService;

    @RequestMapping("/todo")
    public String list(Model model) {
        List<TodoEntity> todoEntityList = this.todoService.getList();
        model.addAttribute("todoEntityList", todoEntityList);
        return "todo_list";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/todo";
    }

}
