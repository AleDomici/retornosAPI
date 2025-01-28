package com.example.retornosAPI.models;

import java.util.Optional;
import java.util.stream.Stream;

public enum Category {
    Acessorios("Acessórios"),
    Eletrodomesticos("Eletrodomésticos"),
    Eletronicos("Eletronicos");

    private final String description;

    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Optional<Category> searchCategory(String description) {
        return Stream.of(Category.values())
                .filter(
                        category -> category.getDescription().equalsIgnoreCase(description)
                ).findAny();
    }
}