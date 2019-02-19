package com.youzan.open.sdk.client.executor;

import com.youzan.open.sdk.model.AuthType;

public interface Executor {

    String execute(ExecutionContext context, AuthType authType);

}
