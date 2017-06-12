package com.dongja3.dmtp.domain;

import com.dongja3.dmtp.domain.bridge.Bridgeable;

import java.util.List;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public abstract  class ProcessUnit extends DomainObj {
    private  Bridgeable bridgeable;
    private ProcessUnit first;
    private ProcessUnit next;
    private boolean storeSource;
    private boolean storeTarget;
    abstract  public  String getName();
    abstract  public List<TriggerCondition> getSupportedConditions();
    abstract  public List<TriggerCondition> process();

    public void doFlow(){
        ProcessUnit processUnit = first;
        do{
            doProcessUnit(processUnit);
            processUnit = processUnit.next;
        }while (processUnit!=null);
    }

    private void doProcessUnit(ProcessUnit processUnit){
        List<TriggerCondition> triggerConditions = processUnit.process();
        processUnit.getBridgeable().bridge(triggerConditions);
    }


    public Bridgeable getBridgeable() {
        return bridgeable;
    }

    public void setBridgeable(Bridgeable bridgeable) {
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
}
