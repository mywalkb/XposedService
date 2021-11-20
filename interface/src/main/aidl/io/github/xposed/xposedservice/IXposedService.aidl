package io.github.xposed.xposedservice;

import io.github.xposed.xposedservice.utils.ParceledListSlice;

interface IXposedService {
    int getVersion() = 1;
    ParcelFileDescriptor getModuleFile() = 2;
}
