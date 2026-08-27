package com.snake.billing;

import android.content.Context;

import com.snake.BuildConfig;

/**
 * Local entitlement provider for development and reconstruction work.
 * Release builds do not receive an entitlement from this provider.
 */
public final class DebugEntitlementManager {
    private static final String VPN_FEATURE = "vpn";

    private DebugEntitlementManager() {
    }

    public static boolean hasEntitlement(Context context, String feature) {
        return BuildConfig.DEBUG && VPN_FEATURE.equals(feature);
    }

    public static boolean isDebugEntitlementActive() {
        return BuildConfig.DEBUG;
    }
}