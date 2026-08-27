package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import androidx.appcompat.view.menu.de;
import androidx.appcompat.view.menu.f90;
import androidx.appcompat.view.menu.fl;
import androidx.appcompat.view.menu.h31;
import androidx.appcompat.view.menu.hl0;
import androidx.appcompat.view.menu.i31;
import androidx.appcompat.view.menu.k8;
import androidx.appcompat.view.menu.ki;
import androidx.appcompat.view.menu.m80;
import androidx.appcompat.view.menu.u7;
import androidx.appcompat.view.menu.ud;
import androidx.appcompat.view.menu.xd;
import androidx.appcompat.view.menu.xl0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final m80 a = new m80(new hl0() { // from class: androidx.appcompat.view.menu.yp
        @Override // androidx.appcompat.view.menu.hl0
        public final Object get() {
            ScheduledExecutorService p;
            p = ExecutorsRegistrar.p();
            return p;
        }
    });
    public static final m80 b = new m80(new hl0() { // from class: androidx.appcompat.view.menu.zp
        @Override // androidx.appcompat.view.menu.hl0
        public final Object get() {
            ScheduledExecutorService q;
            q = ExecutorsRegistrar.q();
            return q;
        }
    });
    public static final m80 c = new m80(new hl0() { // from class: androidx.appcompat.view.menu.aq
        @Override // androidx.appcompat.view.menu.hl0
        public final Object get() {
            ScheduledExecutorService r;
            r = ExecutorsRegistrar.r();
            return r;
        }
    });
    public static final m80 d = new m80(new hl0() { // from class: androidx.appcompat.view.menu.bq
        @Override // androidx.appcompat.view.menu.hl0
        public final Object get() {
            ScheduledExecutorService s;
            s = ExecutorsRegistrar.s();
            return s;
        }
    });

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return detectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i) {
        return new ki(str, i, null);
    }

    public static ThreadFactory k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new ki(str, i, threadPolicy);
    }

    public static /* synthetic */ ScheduledExecutorService l(xd xdVar) {
        return (ScheduledExecutorService) a.get();
    }

    public static /* synthetic */ ScheduledExecutorService m(xd xdVar) {
        return (ScheduledExecutorService) c.get();
    }

    public static /* synthetic */ ScheduledExecutorService n(xd xdVar) {
        return (ScheduledExecutorService) b.get();
    }

    public static /* synthetic */ Executor o(xd xdVar) {
        return h31.INSTANCE;
    }

    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    public static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new fl(executorService, (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(ud.d(xl0.a(u7.class, ScheduledExecutorService.class), xl0.a(u7.class, ExecutorService.class), xl0.a(u7.class, Executor.class)).f(new de() { // from class: androidx.appcompat.view.menu.cq
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                ScheduledExecutorService l;
                l = ExecutorsRegistrar.l(xdVar);
                return l;
            }
        }).d(), ud.d(xl0.a(k8.class, ScheduledExecutorService.class), xl0.a(k8.class, ExecutorService.class), xl0.a(k8.class, Executor.class)).f(new de() { // from class: androidx.appcompat.view.menu.dq
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                ScheduledExecutorService m;
                m = ExecutorsRegistrar.m(xdVar);
                return m;
            }
        }).d(), ud.d(xl0.a(f90.class, ScheduledExecutorService.class), xl0.a(f90.class, ExecutorService.class), xl0.a(f90.class, Executor.class)).f(new de() { // from class: androidx.appcompat.view.menu.eq
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                ScheduledExecutorService n;
                n = ExecutorsRegistrar.n(xdVar);
                return n;
            }
        }).d(), ud.c(xl0.a(i31.class, Executor.class)).f(new de() { // from class: androidx.appcompat.view.menu.fq
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                Executor o;
                o = ExecutorsRegistrar.o(xdVar);
                return o;
            }
        }).d());
    }
}
