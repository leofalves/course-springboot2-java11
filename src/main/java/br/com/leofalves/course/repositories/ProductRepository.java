package br.com.leofalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leofalves.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
