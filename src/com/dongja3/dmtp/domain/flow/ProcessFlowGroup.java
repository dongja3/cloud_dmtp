package com.dongja3.dmtp.domain.flow;

import com.dongja3.dmtp.domain.DomainObj;

import java.util.List;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public class ProcessFlowGroup extends DomainObj{
    private String name;
    private String email;
    private List<String> runHost;
    private List<AttributeType> attributeTypes;
}
