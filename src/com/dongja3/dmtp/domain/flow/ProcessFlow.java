package com.dongja3.dmtp.domain.flow;

import com.dongja3.dmtp.domain.DomainObj;
import com.dongja3.dmtp.domain.ProcessUnit;

import java.util.List;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public class ProcessFlow extends DomainObj {
    private List<AttributeValue> attributeValues;
    private ProcessUnit first;
}
