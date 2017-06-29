package com.dongja3.dmtp.domain.flow;

import com.dongja3.dmtp.domain.DomainObj;
import com.dongja3.dmtp.domain.ProcessUnit;
import com.dongja3.dmtp.domain.mapping.DataMapping;

import java.util.List;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public class ProcessFlowGroup extends DomainObj{
    private String name;
    private String email;
    private List<String> runHost;
    private List<AttributeType> attributeTypes;
    private DataMapping dataMapping;
    private List<ProcessUnit> commonProcessUnits;
    private List<ProcessFlow> commonProcessFlows;
}
