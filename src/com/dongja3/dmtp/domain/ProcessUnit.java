package com.dongja3.dmtp.domain;

import com.dongja3.dmtp.domain.bridge.BridgeTrigger;

import java.util.List;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public abstract  class ProcessUnit extends DomainObj {
    private BridgeTrigger bridgeable;
    private ProcessUnit first;
    private ProcessUnit next;
    private boolean storeSource;
    private boolean storeTarget;
    private String name;
    private List<BridgeTrigger> bridgeTriggers;
    abstract  public List<TriggerCondition> getSupportedConditions();

    public BridgeTrigger getBridgeable() {
        return bridgeable;
    }

    public void setBridgeable(BridgeTrigger bridgeable) {
        this.bridgeable = bridgeable;
    }

    public ProcessUnit getFirst() {
        return first;
    }

    public void setFirst(ProcessUnit first) {
        this.first = first;
    }

    public boolean isStoreSource() {
        return storeSource;
    }

    public void setStoreSource(boolean storeSource) {
        this.storeSource = storeSource;
    }

    public boolean isStoreTarget() {
        return storeTarget;
    }

    public void setStoreTarget(boolean storeTarget) {
        this.storeTarget = storeTarget;
    }

    public ProcessUnit getNext() {
        return next;
    }

    public void setNext(ProcessUnit next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BridgeTrigger> getBridgeTriggers() {
        return bridgeTriggers;
    }

    public void setBridgeTriggers(List<BridgeTrigger> bridgeTriggers) {
        this.bridgeTriggers = bridgeTriggers;
    }
}
