package br.com.eskcti.admin.catalog.application;

import br.com.eskcti.admin.catalog.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}