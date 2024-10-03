package com.codingsuttle.project.uber.uberApp.repositries;

import com.codingsuttle.project.uber.uberApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
}
