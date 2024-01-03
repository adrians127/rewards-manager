package majestatyczne.bestie.frontend.service;

import majestatyczne.bestie.frontend.model.Quiz;
import majestatyczne.bestie.frontend.model.Result;
import majestatyczne.bestie.frontend.model.Reward;
import majestatyczne.bestie.frontend.model.RewardCategory;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface APIService {

    @GET("quizzes")
    Call<List<Quiz>> getQuizzes();

    @GET("results")
    Call<List<Result>> getResults(@Query("quizId") int quizId);

    @GET("rewards")
    Call<List<Reward>> getRewards();

    @GET("reward-categories")
    Call<List<RewardCategory>> getRewardCategories();
}
