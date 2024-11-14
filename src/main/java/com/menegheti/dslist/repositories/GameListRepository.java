package com.menegheti.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menegheti.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
