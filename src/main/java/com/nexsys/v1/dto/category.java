package com.nexsys.v1.dto;
import lombok.Builder;
import lombok.Data;

/**
 * Esta clase representa una categoría.
 */
@Data
@Builder
public class category {

    /**
     * El identificador de la categoría.
     */
    private int cid;

    /**
     * El título de la categoría.
     */
    private String title;

}