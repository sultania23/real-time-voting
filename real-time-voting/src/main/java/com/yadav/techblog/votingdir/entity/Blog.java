package com.yadav.techblog.votingdir.entity;

import com.toshiba.mwcloud.gs.RowKey;
import java.util.Date;
import lombok.Data;

@Data
public class Blog {
    @RowKey
    String id;

    String title;
    Integer voteUpCount;
    Integer voteDownCount;
    Date createdAt;
}
