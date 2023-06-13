package com.nexsys.v1.dto;
import lombok.Data;

@Data
public class createProduct {

    // Identificador del producto
    private int id;

    // Título del producto
    private String title;

    // Precio del producto
    private int price;

    // Descripción del producto
    private String description;

    // Identificador de la categoría del producto
    private int categoryId;

    // Arreglo de imágenes del producto
    private String[] images;

}
