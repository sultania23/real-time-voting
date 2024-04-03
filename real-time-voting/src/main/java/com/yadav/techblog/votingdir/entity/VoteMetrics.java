package com.yadav.techblog.votingdir.entity;

import com.toshiba.mwcloud.gs.RowKey;
import java.util.Date;
import lombok.Data;

@Data
public class VoteMetrics {
    @RowKey
    Date timestamp;

    String blogId;
    String userId;
    Integer voteType;
}
