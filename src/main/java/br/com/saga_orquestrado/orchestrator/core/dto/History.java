package br.com.saga_orquestrado.orchestrator.core.dto;

import br.com.saga_orquestrado.orchestrator.core.enums.EEventSource;
import br.com.saga_orquestrado.orchestrator.core.enums.ESagaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class History {
    private EEventSource source;
    private ESagaStatus status;
    private String message;
    private LocalDateTime createdAt;
}
