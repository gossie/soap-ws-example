package com.github.gossie.ws;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface MealEntityRepository extends JpaRepository<MealEntity, Long> {

    List<MealEntity> findByTags(String tag);

}
