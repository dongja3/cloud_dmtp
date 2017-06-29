package com.dongja3.dmtp.domain.split;

/**
 * Created by DONGJA3 on 6/22/2017.
 */
public abstract  class SplittableProcessUnit {
    private boolean needSplit;

    public boolean isNeedSplit() {
        return needSplit;
    }

    public void setNeedSplit(boolean needSplit) {
        this.needSplit = needSplit;
    }
}
