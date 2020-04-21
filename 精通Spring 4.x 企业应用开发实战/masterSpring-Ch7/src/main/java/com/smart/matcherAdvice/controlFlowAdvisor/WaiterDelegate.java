package com.smart.matcherAdvice.controlFlowAdvisor;

import com.smart.matcherAdvice.Waiter;

public class WaiterDelegate {

    private Waiter waiter;

    public void service(String clientName){
        waiter.greetTo(clientName);
        waiter.serveTo(clientName);
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }
}

