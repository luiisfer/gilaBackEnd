package com.gila.backendgila.repository;


import com.gila.backendgila.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
