package br.com.leofalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leofalves.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
