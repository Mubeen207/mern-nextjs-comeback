package androidx.appcompat.view.menu;

import android.os.Looper;
/* loaded from: classes.dex */
public abstract class ci1 {
    public static volatile ClassLoader a;
    public static volatile Thread b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (ci1.class) {
            try {
                if (a == null) {
                    a = b();
                }
                classLoader = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return classLoader;
    }

    public static synchronized ClassLoader b() {
        synchronized (ci1.class) {
            ClassLoader classLoader = null;
            if (b == null) {
                b = c();
                if (b == null) {
                    return null;
                }
            }
            synchronized (b) {
                try {
                    classLoader = b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get thread context classloader ");
                    sb.append(message);
                }
            }
            return classLoader;
        }
    }

    public static synchronized Thread c() {
        SecurityException e;
        se1 se1Var;
        se1 se1Var2;
        ThreadGroup threadGroup;
        synchronized (ci1.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            se1Var2 = null;
                            break;
                        }
                        se1Var2 = threadArr[i];
                        if ("GmsDynamite".equals(se1Var2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    se1Var = null;
                }
                if (se1Var2 == null) {
                    try {
                        se1Var = new se1(threadGroup, "GmsDynamite");
                    } catch (SecurityException e3) {
                        e = e3;
                        se1Var = se1Var2;
                    }
                    try {
                        se1Var.setContextClassLoader(null);
                        se1Var.start();
                    } catch (SecurityException e4) {
                        e = e4;
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to enumerate thread/threadgroup ");
                        sb.append(message);
                        se1Var2 = se1Var;
                        return se1Var2;
                    }
                    se1Var2 = se1Var;
                }
            }
            return se1Var2;
        }
    }
}
