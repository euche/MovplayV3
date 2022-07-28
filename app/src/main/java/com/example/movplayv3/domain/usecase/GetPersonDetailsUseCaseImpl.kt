package com.example.movplayv3.domain.usecase

import com.example.movplayv3.data.model.DeviceLanguage
import com.example.movplayv3.data.model.PersonDetails
import com.example.movplayv3.data.remote.api.ApiResponse
import com.example.movplayv3.domain.usecase.interfaces.GetPersonDetailsUseCase
import javax.inject.Inject

class GetPersonDetailsUseCaseImpl @Inject constructor() : GetPersonDetailsUseCase{
    override suspend fun invoke(
        personId: Int,
        deviceLanguage: DeviceLanguage
    ): ApiResponse<PersonDetails> {
        TODO("Not yet implemented")
    }

}