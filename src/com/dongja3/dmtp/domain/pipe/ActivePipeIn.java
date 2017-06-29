package com.dongja3.dmtp.domain.pipe;

import com.dongja3.dmtp.domain.TriggerCondition;

import java.util.List;

/**
 * Created by DONGJA3 on 6/22/2017.
 */
public class ActivePipeIn extends  AbstractPipeIn {
    private String cronExpression;
    private String failedRouteFolder;
    private List<RouteFilter> routeFilters;
    @Override
    public List<TriggerCondition> getSupportedConditions() {
        return null;
    }
}
