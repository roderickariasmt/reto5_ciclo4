package com.usa.ciclo4.retociclo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private Integer id;
    private String brand;
    private String category;
    private String name;
    private String description;
    private Double price;
    private boolean availability;
    
    private Integer quantity;
    private String photography;


}
