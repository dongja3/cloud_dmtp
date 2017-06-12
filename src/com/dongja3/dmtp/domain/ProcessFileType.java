package com.dongja3.dmtp.domain;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public enum ProcessFileType {
    SOURCE("S"),TARGET("T");
    private String name;
    private ProcessFileType(String name){
        this.name=name;
    }
}
