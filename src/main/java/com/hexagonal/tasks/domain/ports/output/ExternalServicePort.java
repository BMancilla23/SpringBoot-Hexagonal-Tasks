package com.hexagonal.tasks.domain.ports.output;

import com.hexagonal.tasks.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo geAdditionalTaskInfo(Long taskId);
}
