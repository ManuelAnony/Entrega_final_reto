package com.nexsys.v1.controller;

import com.nexsys.v1.dto.*;
import com.nexsys.v1.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/nexsys/v1/categories/")

public class controllerCategory {

    private final serviceCategory categoryService;

    // Obtiene todas las categorías
    @GetMapping
    public List<category> getAllCategorys () { return categoryService.getAllCategory(); }
}
