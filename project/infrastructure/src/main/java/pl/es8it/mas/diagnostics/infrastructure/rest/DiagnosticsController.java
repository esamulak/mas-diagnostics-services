package pl.es8it.mas.diagnostics.infrastructure.rest;

import org.springframework.http.ResponseEntity;
import pl.es8it.mas.contract.diagnostics.LowBeamLightApi;
import pl.es8it.mas.contract.diagnostics.dto.LowBeamLightStateDTO;

public class DiagnosticsController implements LowBeamLightApi {

    @Override
    public ResponseEntity<LowBeamLightStateDTO> getLowBeamLightState() {
        return null;
    }
}
