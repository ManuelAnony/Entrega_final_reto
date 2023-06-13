package com.nexsys.v1.controller;

import com.nexsys.v1.dto.*;

import com.nexsys.v1.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/nexsys/v1/products/")
public class controllerProduct {

    private final serviceProduct productService;

    // Obtener todos los productos
    @GetMapping
    public List<product> allProducts() {
        return productService.getAllProducts();
    }

    // Crear un producto
    @PostMapping
    public int crateProduct(@RequestBody createProduct createProductDto) {
        return productService.createProducts(createProductDto);
    }
}
