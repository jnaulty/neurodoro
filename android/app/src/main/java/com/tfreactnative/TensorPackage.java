package com.tfreactnative;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.tfreactnative.tensorflow.TensorFlowModule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dano on 01/03/17.
 */

public class TensorPackage implements com.facebook.react.ReactPackage {
    @Override
    // Register Native Modules to JS
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.<NativeModule>asList(
                new TensorFlowModule(reactApplicationContext)
        );
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    // Registers Java ViewManagers to JS
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
