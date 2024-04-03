package com.yadav.techblog.votingdir.entity;

import com.toshiba.mwcloud.gs.RowKey;
import java.util.Date;
import lombok.Data;

@Data
public class Vote {
    @RowKey
    String blogId;

    @RowKey
    String userId;

    Integer voteType;
    Date createdAt;
}
