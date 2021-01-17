package dk.terndrup.mushimushi.services;

import dk.terndrup.mushimushi.repositories.CallHistoryRepository;
import dk.terndrup.mushimushi.repositories.CallRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CallHistoryService {
    private CallHistoryRepository callHistoryRepository;

    public CallHistoryService(CallHistoryRepository callHistoryRepository) {
        this.callHistoryRepository = callHistoryRepository;
    }

    public List<String> updateAndGetCallHistory() {
        callHistoryRepository.save(new CallRecord());
        return callHistoryRepository
                .findAll()
                .stream()
                .map(CallRecord::toString)
                .collect(Collectors.toUnmodifiableList());
    }
}
