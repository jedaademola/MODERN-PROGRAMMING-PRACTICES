package edu.mum.mpp.lesson5;

import java.awt.Component;



final public class CustomerProfileRuleSet implements RuleSet {
	//package level access
	CustomerProfileRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow custProf = (ProfileWindow)ob;
		//check data
		
	}

}
