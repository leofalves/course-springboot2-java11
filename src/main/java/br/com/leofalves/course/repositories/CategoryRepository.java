package br.com.leofalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leofalves.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
