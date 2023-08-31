package com.study.dto;

import java.io.Serializable;

import com.study.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CategoryDTO implements Serializable{

    private static final long serialVersionUID = 1L;
    
    Long id;
    String name;

    public CategoryDTO(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

}