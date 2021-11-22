package prima.android.splashscreentest;

import android.app.Application;

import com.zoho.salesiqembed.ZohoSalesIQ;

public class AndroidApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZohoSalesIQ.init(this, "vBLi%2BflXWenRizaSh0ArLVpawlXWxurB8%2Fx8akQwW%2BHS1866lNaJzZJTtDeLksncE8IA0L0udBo%3D", "q8KDFaSiyFYQ6FUMOkXXGP113UF2fli1lN65IL4az1ZwiRbbu6dAxHsLwCWwb3diO3zwJM7tGsZqLEGp58cIcXMVw6Fgr1YdYqFxIS23zrhks99w45XbiJWfj8QNBJXqKRDKXgyvF4NmCfEvhqlUtvi4NXjkZGUCDUSPa2Wl3Fc%3D");
        //ZohoSalesIQ.init(this, "vBLi%2BflXWenRizaSh0ArLVpawlXWxurB8%2Fx8akQwW%2BHS1866lNaJzZJTtDeLksncE8IA0L0udBo%3D", "B0WSVnw7AHwbtA3Bn%2FJnfKdf9HLFM5B36t32sbqSoXbbGfTJMFHeYvhdtKqRL5BNXm%2BfuW4gpTDf9wWlsgafpwCA1bWtQjJXEMmZxJKRJDxZfFjCtnv3gHIugdv3prBdssjqrpcskKUYsJZFJ%2FWcOVPuLhLuVhj5taks8sadsyQ%3D");
    }
}
