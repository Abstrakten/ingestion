package dk.terndrup.mushimushi.controllers;

import dk.terndrup.mushimushi.services.CallHistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class doTheThingController {

    private CallHistoryService callHistoryService;

    public doTheThingController(CallHistoryService callHistoryService) {
        this.callHistoryService = callHistoryService;
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<String>> doTheThing() {
        var callHistory = callHistoryService.updateAndGetCallHistory();
        return ResponseEntity.ok(callHistory);
    }

}
