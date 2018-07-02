package Behaviours;

import Visitors.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);

}
