package com.snake.helper;

import android.net.VpnService;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;

import com.snake.billing.DebugEntitlementManager;

/**
 * VPN Service for the Snake Engine proxy
 * This service handles VPN connections and routing
 */
public class ProxyVpnService extends VpnService {
    private static final String TAG = "ProxyVpnService";
    private ParcelFileDescriptor vpnInterface;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (!DebugEntitlementManager.hasEntitlement(this, "vpn")
                || VpnService.prepare(this) != null) {
            stopSelf();
            return START_NOT_STICKY;
        }
        establishVpnConnection();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        stopVpnConnection();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * Establish a VPN connection
     */
    private void establishVpnConnection() {
        Builder builder = new Builder();
        builder.setSession("Snake Engine VPN");
        
        // Configure routing
        try {
            // Add default route
            builder.addRoute("0.0.0.0", 0);
            
            vpnInterface = builder.establish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Stop the VPN connection
     */
    private void stopVpnConnection() {
        if (vpnInterface != null) {
            try {
                vpnInterface.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            vpnInterface = null;
        }
    }
}
