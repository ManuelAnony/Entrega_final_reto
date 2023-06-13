package com.nexsys.v1.service;

import com.nexsys.v1.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class serviceProduct {

    private final RestTemplate restTemplate;

    // Obtiene todos los productos
    public List<product> getAllProducts() {
        // Realiza una solicitud GET a la API para obtener la lista de productos
        var response = restTemplate.exchange(
                "https://api.escuelajs.co/api/v1/products",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<product>>() {
                });

        return response.getBody(); // Retorna la lista de productos obtenida en la respuesta
    }

    // Crea un producto
    public int createProducts(createProduct createProductDto) {
        // Crea una entidad HttpEntity con el objeto createProductDto como cuerpo de la solicitud
        HttpEntity<createProduct> entity = new HttpEntity<createProduct>(createProductDto,null);
        // Realiza una solicitud POST a la API para crear un producto
        var response = restTemplate.exchange(
                "https://api.escuelajs.co/api/v1/products/",
                HttpMethod.POST,
                entity,
                new ParameterizedTypeReference<createProduct>() {
                });

        return response.getBody().getId(); // Retorna el ID del producto creado obtenido en la respuesta
    }
}
