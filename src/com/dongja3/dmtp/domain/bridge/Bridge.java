package com.dongja3.dmtp.domain.bridge;

import com.dongja3.dmtp.domain.ProcessFileType;
import com.dongja3.dmtp.domain.ProcessUnit;
import com.dongja3.dmtp.domain.TriggerCondition;

import java.util.List;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public abstract class Bridge extends ProcessUnit {
    private boolean stopMainFlow;
    private boolean isCallBack;
    private ProcessFileType fileType;
    @Override
    public List<TriggerCondition> process() {
        return null;
    }
}
