package com.yadav.techblog.votingdir.entity;

import java.util.Date;
import lombok.Data;

@Data
public class VoteUpMetric {
    Date timestamp;
    String blogId;
    String userId;
}
