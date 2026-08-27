package com.snake.helper;

import androidx.annotation.Keep;
import java.lang.reflect.Method;
import java.util.Objects;
@Keep
/* loaded from: classes.dex */
public class MethodUtils {
    public static String getDeclaringClass(Method method) {
        return method.getDeclaringClass().getName().replace(".", "/");
    }

    public static String getDesc(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append(getDesc(cls));
        }
        sb.append(")");
        sb.append(getDesc(method.getReturnType()));
        return sb.toString();
    }

    public static String getMethodName(Method method) {
        return method.getName();
    }

    private static String getPrimitiveLetter(Class<?> cls) {
        if (Integer.TYPE.equals(cls)) {
            return "I";
        }
        if (Void.TYPE.equals(cls)) {
            return "V";
        }
        if (Boolean.TYPE.equals(cls)) {
            return "Z";
        }
        if (Character.TYPE.equals(cls)) {
            return "C";
        }
        if (Byte.TYPE.equals(cls)) {
            return "B";
        }
        if (Short.TYPE.equals(cls)) {
            return "S";
        }
        if (Float.TYPE.equals(cls)) {
            return "F";
        }
        if (Long.TYPE.equals(cls)) {
            return "J";
        }
        if (Double.TYPE.equals(cls)) {
            return "D";
        }
        throw new IllegalStateException("Type: " + cls.getCanonicalName() + " is not a primitive type");
    }

    private static String getType(Class<?> cls) {
        if (!cls.isArray()) {
            return !cls.isPrimitive() ? cls.getName().replaceAll("\\.", "/") : getPrimitiveLetter(cls);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Class<?> componentType = cls.getComponentType();
        Objects.requireNonNull(componentType);
        sb.append(getDesc(componentType));
        return sb.toString();
    }

    private static String getDesc(Class<?> cls) {
        if (cls.isPrimitive()) {
            return getPrimitiveLetter(cls);
        }
        if (cls.isArray()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Class<?> componentType = cls.getComponentType();
            Objects.requireNonNull(componentType);
            sb.append(getDesc(componentType));
            return sb.toString();
        }
        return "L" + getType(cls) + ";";
    }
}
