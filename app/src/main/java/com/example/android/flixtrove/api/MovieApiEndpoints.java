package com.example.android.flixtrove.api;

import com.example.android.flixtrove.pojos.MainResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiEndpoints {

	@GET("movie/now_playing")
	Call<MainResponse> getNowPlayingMovies(@Query("api_key") String apiKey, @Query("page") int pageNumber);

	@GET("movie/top_rated")
	Call<MainResponse> getTopRatedMovies(@Query("api_key") String apiKey, @Query("page") int pageNumber);

	@GET("movie/most_popular")
	Call<MainResponse> getMostPopularMovies(@Query("api_key") String apiKey, @Query("page") int pageNumber);

}
