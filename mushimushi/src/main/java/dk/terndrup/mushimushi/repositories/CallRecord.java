package dk.terndrup.mushimushi.repositories;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class CallRecord {

    @Id
    @GeneratedValue
    private long id;

    private LocalDateTime callTime;

    public CallRecord() {
        callTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format("Call %s was made at %s", String.valueOf(id), callTime.toString());
    }

}
