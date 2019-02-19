package com.youzan.open.sdk.api;

import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.ByteWrapper;

public interface FileParams extends APIParams {

    Multimap<String, ByteWrapper> toFileParams();

}
