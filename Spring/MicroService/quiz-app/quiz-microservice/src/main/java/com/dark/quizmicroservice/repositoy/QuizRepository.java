package com.dark.quizmicroservice.repositoy;

import com.dark.quizmicroservice.model.quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<quiz,Integer> {
}
