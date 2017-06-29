package com.dongja3.dmtp.domain.bridge;

import com.dongja3.dmtp.domain.ProcessFileType;
import com.dongja3.dmtp.domain.TriggerCondition;

import java.util.List;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public  class Bridge extends AbstractBridge{
    private boolean stopMainFlow;
    private ProcessFileType fileType;
    private int sequence;

    @Override
    public List<TriggerCondition> getSupportedConditions() {
        return null;
    }
}
