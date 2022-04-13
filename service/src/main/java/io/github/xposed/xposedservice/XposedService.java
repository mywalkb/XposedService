package io.github.xposed.xposedservice;

import android.os.IBinder;
import android.os.RemoteException;

import io.github.xposed.xposedservice.utils.ParceledListSlice;
import io.github.xposed.xposedservice.models.Application;

public class XposedService implements IXposedService {
    private static IBinder serviceBinder = null;
    private static IXposedService service = null;
    private static XposedService instance = null;

    public static XposedService getService() {
        if (serviceBinder != null && service == null) {
            service = IXposedService.Stub.asInterface(serviceBinder);
        }
        if (instance == null) {
            instance = new XposedService();
        }
        return service == null ? null : instance;
    }

    @Override
    public int getXposedApiVersion() throws RemoteException {
        return service.getXposedApiVersion();
    }

    @Override
    public int getXposedVersionCode() throws RemoteException {
        return service.getXposedVersionCode();
    }

    @Override
    public String getXposedVersionName() throws RemoteException {
        return service.getXposedVersionName();
    }

    @Override
    public String getApi() throws RemoteException {
        return service.getApi();
    }

    @Override
    public boolean setModuleScope(ParceledListSlice<Application> scope) throws RemoteException {
        return service.setModuleScope(scope);
    }

    @Override
    public ParceledListSlice<Application> getModuleScope() throws RemoteException {
        return service.getModuleScope();
    }

    @Override
    public IBinder asBinder() {
        return serviceBinder;
    }
}
