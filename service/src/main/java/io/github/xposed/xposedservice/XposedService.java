package io.github.xposed.xposedservice;

import android.os.IBinder;
import android.os.RemoteException;

import java.util.List;

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
    public boolean setModuleScope(List<Application> scope) throws RemoteException {
        return service.setModuleScope(scope);
    }

    @Override
    public List<Application> getModuleScope() throws RemoteException {
        return service.getModuleScope();
    }

    @Override
    public List<String> getDenyListPackages() throws RemoteException {
        return service.getDenyListPackages();
    }

    @Override
    public IBinder asBinder() {
        return serviceBinder;
    }
}
