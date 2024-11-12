package com.menegheti.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menegheti.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
