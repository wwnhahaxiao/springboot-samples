package com.roshan.api;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloApi {

    @RequestMapping("/initLimit")
    public void initLimit() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("myLimitResource");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // Set limit QPS.
        rule.setCount(1);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }

    @RequestMapping("/testSentinel")
    @SentinelResource(value = "myLimitResource", blockHandler = "limitHandler")
    public String testSentinel() {
        initLimit();
        return "hello";
    }

    public String limitHandler(BlockException exception) {
        System.out.println(exception.getRule().getResource() + "has been limited");
        return "block";
    }

}
