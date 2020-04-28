package br.com.leofalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leofalves.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
