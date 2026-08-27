package androidx.appcompat.view.menu;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.view.menu.uf;
/* loaded from: classes.dex */
public abstract class f50 {

    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z, b bVar) {
            super(inputConnection, z);
            this.a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.a.a(g50.f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(g50 g50Var, int i, Bundle bundle);
    }

    public static b b(final View view) {
        tj0.g(view);
        return new b() { // from class: androidx.appcompat.view.menu.e50
            @Override // androidx.appcompat.view.menu.f50.b
            public final boolean a(g50 g50Var, int i, Bundle bundle) {
                boolean e;
                e = f50.e(view, g50Var, i, bundle);
                return e;
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        bg0.d(inputConnection, "inputConnection must be non-null");
        bg0.d(editorInfo, "editorInfo must be non-null");
        bg0.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }

    public static /* synthetic */ boolean e(View view, g50 g50Var, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                g50Var.d();
                Parcelable parcelable = (Parcelable) g50Var.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return p51.a0(view, new uf.a(new ClipData(g50Var.b(), new ClipData.Item(g50Var.a())), 2).d(g50Var.c()).b(bundle).a()) == null;
    }
}
