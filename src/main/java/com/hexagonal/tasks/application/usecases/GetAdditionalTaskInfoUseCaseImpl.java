package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.ports.input.GetAdditionalTaskInfoUseCase;
import com.hexagonal.tasks.domain.ports.output.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase{
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.geAdditionalTaskInfo(id);
    }

    
}
