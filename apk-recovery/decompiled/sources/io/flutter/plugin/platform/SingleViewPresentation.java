package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.appcompat.view.menu.d0;
import androidx.appcompat.view.menu.da1;
import androidx.appcompat.view.menu.ru0;
import androidx.appcompat.view.menu.ui0;
@Keep
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final d0 accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final d state;
    private int viewId;

    /* loaded from: classes.dex */
    public static class a extends FrameLayout {
    }

    /* loaded from: classes.dex */
    public static class b extends ContextWrapper {
        public final InputMethodManager a;

        public b(Context context) {
            this(context, null);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new b(super.createDisplayContext(display), this.a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.a : super.getSystemService(str);
        }

        public b(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ContextWrapper {
        public final da1 a;
        public WindowManager b;
        public final Context c;

        public c(Context context, da1 da1Var, Context context2) {
            super(context);
            this.a = da1Var;
            this.c = context2;
        }

        public final WindowManager a() {
            if (this.b == null) {
                this.b = this.a;
            }
            return this.b;
        }

        public final boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 0; i < stackTrace.length && i < 11; i++) {
                if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public da1 a;
        public ru0 b;

        public static /* synthetic */ ui0 a(d dVar) {
            dVar.getClass();
            return null;
        }

        /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
            java.lang.NullPointerException
            	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
            	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
            	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
            	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
            	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
            	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
            */
        public static /* synthetic */ androidx.appcompat.view.menu.ui0 b(io.flutter.plugin.platform.SingleViewPresentation.d r0, androidx.appcompat.view.menu.ui0 r1) {
            /*
                r0.getClass()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.SingleViewPresentation.d.b(io.flutter.plugin.platform.SingleViewPresentation$d, androidx.appcompat.view.menu.ui0):androidx.appcompat.view.menu.ui0");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: io.flutter.plugin.platform.SingleViewPresentation.d.b(io.flutter.plugin.platform.SingleViewPresentation$d, androidx.appcompat.view.menu.ui0):androidx.appcompat.view.menu.ui0
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
        	... 1 more
        */
    public SingleViewPresentation(android.content.Context r2, android.view.Display r3, androidx.appcompat.view.menu.ui0 r4, androidx.appcompat.view.menu.d0 r5, int r6, android.view.View.OnFocusChangeListener r7) {
        /*
            r1 = this;
            io.flutter.plugin.platform.SingleViewPresentation$b r0 = new io.flutter.plugin.platform.SingleViewPresentation$b
            r0.<init>(r2)
            r1.<init>(r0, r3)
            r3 = 0
            r1.startFocused = r3
            r1.accessibilityEventsDelegate = r5
            r1.viewId = r6
            r1.focusChangeListener = r7
            r1.outerContext = r2
            io.flutter.plugin.platform.SingleViewPresentation$d r2 = new io.flutter.plugin.platform.SingleViewPresentation$d
            r2.<init>()
            r1.state = r2
            io.flutter.plugin.platform.SingleViewPresentation.d.b(r2, r4)
            android.view.Window r2 = r1.getWindow()
            r3 = 8
            r2.setFlags(r3, r3)
            android.view.Window r2 = r1.getWindow()
            r3 = 2030(0x7ee, float:2.845E-42)
            r2.setType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.SingleViewPresentation.<init>(android.content.Context, android.view.Display, androidx.appcompat.view.menu.ui0, androidx.appcompat.view.menu.d0, int, android.view.View$OnFocusChangeListener):void");
    }

    public d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public ui0 getView() {
        d.a(this.state);
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.b == null) {
            this.state.b = new ru0(getContext());
        }
        if (this.state.a == null) {
            d dVar = this.state;
            dVar.a = new da1((WindowManager) getContext().getSystemService("window"), dVar.b);
        }
        this.container = new FrameLayout(getContext());
        new c(getContext(), this.state.a, this.outerContext);
        d.a(this.state);
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, d0 d0Var, d dVar, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = d0Var;
        this.state = dVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }
}
