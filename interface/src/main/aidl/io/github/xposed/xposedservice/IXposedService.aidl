package io.github.xposed.xposedservice;

import android.os.ParcelFileDescriptor;

import io.github.xposed.xposedservice.models.Application;

interface IXposedService {
    ParcelFileDescriptor getModuleFile() = 1;
    int getXposedApiVersion() = 2;
    int getXposedVersionCode() = 3;
    String getXposedVersionName() = 4;
    String getApi() = 5;
    boolean setModuleScope(in List<Application> scope) = 6;
    List<Application> getModuleScope() = 7;
}
