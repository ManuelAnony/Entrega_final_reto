package com.nexsys.v1.dto;

import lombok.Data;

/**
 * La clase "product" representa un producto.
 */
@Data
public class product {

    /**
     * El ID del producto.
     */
    private int pid;

    /**
     * El nombre del producto.
     */
    private String name;

    /**
     * El precio final del producto.
     */
    private double priceFinal;

    /**
     * La descripción del producto.
     */
    private String description;

}
