package br.com.leofalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leofalves.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
