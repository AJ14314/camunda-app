package com.anand.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FetchEmailDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Coming from FetchEmail Delegate");
        System.out.println("userIdInput in FetchEmail Delegate :: " + execution.getVariable("userIdInput"));

        // variable set to global scope
        execution.setVariable("userEmailIdFromDelegate", "anand@gmail.com");
    }
}
