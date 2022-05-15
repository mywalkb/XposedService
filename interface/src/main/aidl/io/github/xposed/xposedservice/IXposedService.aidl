package io.github.xposed.xposedservice;

import io.github.xposed.xposedservice.models.Application;

interface IXposedService {
    int getXposedApiVersion() = 1;
    int getXposedVersionCode() = 2;
    String getXposedVersionName() = 3;
    String getApi() = 4;
    boolean setModuleScope(in List<Application> scope) = 5;
    List<Application> getModuleScope() = 6;
}
