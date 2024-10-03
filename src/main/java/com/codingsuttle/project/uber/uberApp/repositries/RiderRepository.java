package com.codingsuttle.project.uber.uberApp.repositries;

import com.codingsuttle.project.uber.uberApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
}
