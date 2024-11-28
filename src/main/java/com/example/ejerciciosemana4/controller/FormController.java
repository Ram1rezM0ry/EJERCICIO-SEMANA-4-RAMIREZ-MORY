/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ejerciciosemana4.controller;

import com.example.ejerciciosemana4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author aaron
 */
@Controller
public class FormController {
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form"; // Debe coincidir con form.html
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "success"; // Asegúrate de que success.html exista
    }
}