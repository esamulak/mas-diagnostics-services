package pl.es8it.mas.diagnostics.infrastructure.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.es8it.mas.contract.diagnostics.DiagnosticsAPI;
import pl.es8it.mas.contract.diagnostics.dto.LowBeamLightDTO;

@RestController
public class DiagnosticsController implements DiagnosticsAPI {

    @Override
    public ResponseEntity<LowBeamLightDTO> getLowBeamLight() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateLowBeamLight(LowBeamLightDTO lowBeamLightDTO) {
        return null;
    }
}
