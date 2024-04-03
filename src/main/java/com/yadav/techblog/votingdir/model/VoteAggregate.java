package com.yadav.techblog.votingdir.model;

import java.util.Date;
import lombok.Data;

@Data
public class VoteAggregate {
    private final Date timestamp;
    private final Long count;
    private final String label;
}
