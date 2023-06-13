package com.nexsys.v1.service;
import com.nexsys.v1.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class serviceCategory {

    private final RestTemplate restTemplate;

    // Obtiene todas las categorías
    public List<category> getAllCategory() {
        // Realiza una solicitud HTTP GET a la API de escuelajs para obtener las categorías
        var response = restTemplate.exchange(
                "https://api.escuelajs.co/api/v1/categories",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<categoryPlatzi>>() {
                });

        // Mapea la respuesta obtenida a una lista de objetos "category" y la devuelve
        return response.getBody().stream().map(dto -> category.builder()
                .cid(dto.getId()) // Establece el ID de la categoría
                .title(dto.getName()) // Establece el nombre de la categoría
                .build()).toList();
    }
}
