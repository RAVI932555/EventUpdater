package com.eventUpdater.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventUpdater.sEntity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}
