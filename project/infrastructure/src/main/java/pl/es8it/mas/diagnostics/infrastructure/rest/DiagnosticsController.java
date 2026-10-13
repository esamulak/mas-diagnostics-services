package pl.es8it.mas.diagnostics.infrastructure.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.es8it.mas.contract.diagnostics.VehicleApi;
import pl.es8it.mas.contract.diagnostics.dto.LowBeamLightDTO;

@RestController
public class DiagnosticsController implements VehicleApi {

    @Override
    public ResponseEntity<LowBeamLightDTO> getLowBeamLightState() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateLowBeamLightState(LowBeamLightDTO lowBeamLightDTO) {
        return null;
    }
}
