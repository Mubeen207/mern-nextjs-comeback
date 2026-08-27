package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Matrix;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class h2 {
    public static final Matrix e = new Matrix();
    public final FlutterRenderer a;
    public final boolean c;
    public final Map d = new HashMap();
    public final zd0 b = zd0.a();

    public h2(FlutterRenderer flutterRenderer, boolean z) {
        this.a = flutterRenderer;
        this.c = z;
    }

    public final void a(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        b(motionEvent, i, i2, i3, matrix, byteBuffer, null);
    }

    public final void b(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        long j;
        int i4;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        InputDevice.MotionRange motionRange;
        int i5 = -1;
        if (i2 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i);
        int f = f(motionEvent.getToolType(i));
        float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
        matrix.mapPoints(fArr);
        if (f == 1) {
            j = motionEvent.getButtonState() & 31;
            if (j == 0 && motionEvent.getSource() == 8194 && i2 == 4) {
                this.d.put(Integer.valueOf(pointerId), fArr);
            }
        } else {
            j = f == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.d.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            int e2 = e(i2);
            if (e2 == -1) {
                return;
            }
            i5 = e2;
        }
        long d7 = this.c ? this.b.c(motionEvent).d() : 0L;
        int i6 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        int i7 = i5;
        byteBuffer.putLong(d7);
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        if (containsKey) {
            i4 = i7;
            byteBuffer.putLong(i4);
            byteBuffer.putLong(4L);
        } else {
            i4 = i7;
            byteBuffer.putLong(i2);
            byteBuffer.putLong(f);
        }
        byteBuffer.putLong(i6);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = (float[]) this.d.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d = 1.0d;
            d2 = 0.0d;
        } else {
            d2 = motionRange.getMin();
            d = motionRange.getMax();
        }
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d);
        if (f == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i));
            d3 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d3 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i));
        byteBuffer.putDouble(motionEvent.getToolMajor(i));
        byteBuffer.putDouble(motionEvent.getToolMinor(i));
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i));
        if (f == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i));
        } else {
            byteBuffer.putDouble(d3);
        }
        byteBuffer.putLong(i3);
        if (i6 == 1) {
            if (context != null) {
                d5 = c(context);
                d6 = g(context);
            } else {
                d5 = 48.0d;
                d6 = 48.0d;
            }
            byteBuffer.putDouble(d5 * (-motionEvent.getAxisValue(10, i)));
            byteBuffer.putDouble(d6 * (-motionEvent.getAxisValue(9, i)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = (float[]) this.d.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d4 = 0.0d;
        } else {
            d4 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d4);
        byteBuffer.putLong(0L);
        if (containsKey && i4 == 9) {
            this.d.remove(Integer.valueOf(pointerId));
        }
    }

    public final float c(Context context) {
        return ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
    }

    public final int d(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    public final int e(int i) {
        if (i == 4) {
            return 7;
        }
        if (i == 5) {
            return 8;
        }
        return (i == 6 || i == 0) ? 9 : -1;
    }

    public final int f(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? 5 : 3;
                }
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public final float g(Context context) {
        return h(context);
    }

    public final float h(Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    public boolean i(MotionEvent motionEvent, Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (isFromSource && z) {
            int d = d(motionEvent.getActionMasked());
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            b(motionEvent, motionEvent.getActionIndex(), d, 0, e, allocateDirect, context);
            if (allocateDirect.position() % 288 == 0) {
                this.a.h(allocateDirect, allocateDirect.position());
                return true;
            }
            throw new AssertionError("Packet position is not on field boundary.");
        }
        return false;
    }

    public boolean j(MotionEvent motionEvent) {
        return k(motionEvent, e);
    }

    public boolean k(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int d = d(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        if (z) {
            a(motionEvent, motionEvent.getActionIndex(), d, 0, matrix, allocateDirect);
        } else if (z2) {
            for (int i = 0; i < pointerCount; i++) {
                if (i != motionEvent.getActionIndex() && motionEvent.getToolType(i) == 1) {
                    a(motionEvent, i, 5, 1, matrix, allocateDirect);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), d, 0, matrix, allocateDirect);
        } else {
            for (int i2 = 0; i2 < pointerCount; i2++) {
                a(motionEvent, i2, d, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 288 == 0) {
            this.a.h(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }
}
