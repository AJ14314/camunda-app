package com.anand.controllers;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "!Spring Boot Application!";
    }

    @RequestMapping(value = "/execute/{processKey}", method = RequestMethod.GET)
    public String execute(@PathVariable("processKey") String processKey) {
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey(processKey);

        String item = "variable from code to bpmn process";
        instance.setVariable("itemName", item);
        instance.businessKey("execute-endpoint");
        instance.executeWithVariablesInReturn();
        return ":--BPMN has executed--:" + processKey;
    }

//    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
//    public String tasks() {
//        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
//        ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey("tasks_execute");
//
//        instance.executeWithVariablesInReturn();
//        return "Tasks BPMN has executed";
//    }
}
