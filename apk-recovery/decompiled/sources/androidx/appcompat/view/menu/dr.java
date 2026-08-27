package androidx.appcompat.view.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
/* loaded from: classes.dex */
public final class dr {
    public static final dr a = new dr();

    public final Object a(String str, ClassLoader classLoader, Class cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final List b(Class cls, ClassLoader classLoader) {
        List u;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            u = ad.u(ServiceLoader.load(cls, classLoader));
            return u;
        }
    }

    public final List c() {
        ua0 ua0Var;
        if (er.a()) {
            try {
                ArrayList arrayList = new ArrayList(2);
                ua0 ua0Var2 = null;
                try {
                    ua0Var = (ua0) ua0.class.cast(Class.forName("androidx.appcompat.view.menu.d2", true, ua0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused) {
                    ua0Var = null;
                }
                if (ua0Var != null) {
                    arrayList.add(ua0Var);
                }
                try {
                    ua0Var2 = (ua0) ua0.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, ua0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (ClassNotFoundException unused2) {
                }
                if (ua0Var2 != null) {
                    arrayList.add(ua0Var2);
                    return arrayList;
                }
                return arrayList;
            } catch (Throwable unused3) {
                return b(ua0.class, ua0.class.getClassLoader());
            }
        }
        return b(ua0.class, ua0.class.getClassLoader());
    }

    public final List d(Class cls, ClassLoader classLoader) {
        Set<String> x;
        int j;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        c60.d(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            xc.k(arrayList, a.e(url));
        }
        x = ad.x(arrayList);
        if (!x.isEmpty()) {
            j = tc.j(x, 10);
            ArrayList arrayList2 = new ArrayList(j);
            for (String str : x) {
                arrayList2.add(a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    public final List e(URL url) {
        boolean i;
        String z;
        String E;
        String z2;
        String url2 = url.toString();
        i = zx0.i(url2, "jar", false, 2, null);
        if (!i) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List f = a.f(bufferedReader);
                gc.a(bufferedReader, null);
                return f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    gc.a(bufferedReader, th);
                    throw th2;
                }
            }
        }
        z = ay0.z(url2, "jar:file:", null, 2, null);
        E = ay0.E(z, '!', null, 2, null);
        z2 = ay0.z(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(E, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(z2)), "UTF-8"));
            List f2 = a.f(bufferedReader2);
            gc.a(bufferedReader2, null);
            jarFile.close();
            return f2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    pp.a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    public final List f(BufferedReader bufferedReader) {
        List u;
        String F;
        CharSequence G;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                u = ad.u(linkedHashSet);
                return u;
            }
            F = ay0.F(readLine, "#", null, 2, null);
            G = ay0.G(F);
            String obj = G.toString();
            for (int i = 0; i < obj.length(); i++) {
                char charAt = obj.charAt(i);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }
}
