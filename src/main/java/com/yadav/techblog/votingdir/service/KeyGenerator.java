package com.yadav.techblog.votingdir.service;

import com.github.f4b6a3.tsid.TsidCreator;

public class KeyGenerator {
    public static String next(String prefix) {
        return TsidCreator.getTsid().format(prefix + "_%S");
    }
}
