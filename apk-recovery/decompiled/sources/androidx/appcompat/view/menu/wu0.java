package androidx.appcompat.view.menu;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public abstract class wu0 implements WindowManager {
    public final WindowManager a;
    public ru0 b;

    public wu0(WindowManager windowManager, ru0 ru0Var) {
        this.a = windowManager;
        this.b = ru0Var;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.a.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        ru0 ru0Var = this.b;
        if (ru0Var == null) {
            ha0.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            ru0Var.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.a.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public Display getDefaultDisplay() {
        return this.a.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.a.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.a.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.a.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(View view) {
        ru0 ru0Var = this.b;
        if (ru0Var == null) {
            ha0.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            ru0Var.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        if (this.b == null) {
            ha0.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        this.b.removeView(view);
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        ru0 ru0Var = this.b;
        if (ru0Var == null) {
            ha0.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            ru0Var.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.a.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
