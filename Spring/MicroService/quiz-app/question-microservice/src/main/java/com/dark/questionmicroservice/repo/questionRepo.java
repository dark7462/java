package repo;

import model.question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface questionRepo extends JpaRepository<question,Integer> {

    public List<question> findByCategory(String category);

    @Query (
            value = "SELECT q.questionId FROM question q where " +
                    "q.category =:category " +
                    "ORDER BY RANDOM() LIMIT :limit",
            nativeQuery = true
        )
    public List<Integer> findRandomQuestionsByCategory(String category, int limit);

}
