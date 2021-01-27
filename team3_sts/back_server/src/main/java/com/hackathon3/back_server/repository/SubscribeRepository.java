package com.hackathon3.back_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon3.back_server.domain.Subscribe;

public interface SubscribeRepository extends JpaRepository<Subscribe, Long> {

}
