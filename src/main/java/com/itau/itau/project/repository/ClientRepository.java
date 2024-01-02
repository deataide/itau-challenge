package com.itau.itau.project.repository;

import com.itau.itau.project.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
