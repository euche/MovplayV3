package com.example.movplayv3.domain.usecase.tvshow

import com.example.movplayv3.data.model.DeviceLanguage
import com.example.movplayv3.data.model.tvshow.TvShowDetails
import com.example.movplayv3.data.remote.api.ApiResponse
import com.example.movplayv3.domain.usecase.interfaces.tvshow.GetTvShowDetailsUseCase
import javax.inject.Inject


class GetTvShowDetailsUseCaseImpl @Inject constructor() : GetTvShowDetailsUseCase {
    override suspend fun invoke(
        tvShowId: Int,
        deviceLanguage: DeviceLanguage
    ): ApiResponse<TvShowDetails> {
        TODO("Not yet implemented")
    }

}