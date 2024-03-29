package majestatyczne.bestie.rewardsmanager.repository;

import majestatyczne.bestie.rewardsmanager.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {

    List<Result> findAllByQuizId(int quizId);
    List<Result> findAllByQuizIdOrderByScoreDescEndDateAsc(int quizId);
}
