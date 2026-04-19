package com.dark.questionmicroservice.repo;

import com.dark.questionmicroservice.model.question;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface questionRepo extends JpaRepository<question,Integer> {

    public List<question> findByCategory(String category);

    @Query (
            value = "SELECT q.question_id FROM question q where " +
                    "q.category =:category " +
                    "ORDER BY RANDOM() LIMIT :limit",
            nativeQuery = true
        )
        public List<Integer> findRandomQuestionsByCategory(@Param("category") String category, @Param("limit") int limit);

}
