package com.hexagonal.tasks.domain.ports.input;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
