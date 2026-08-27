package androidx.appcompat.view.menu;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class g01 implements mg0 {
    public static CharSequence b(Context context, ClipData.Item item, int i) {
        if ((i & 1) != 0) {
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
        return item.coerceToStyledText(context);
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.appcompat.view.menu.mg0
    public uf a(View view, uf ufVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(ufVar);
        }
        if (ufVar.d() == 2) {
            return ufVar;
        }
        ClipData b = ufVar.b();
        int c = ufVar.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b.getItemCount(); i++) {
            CharSequence b2 = b(context, b.getItemAt(i), c);
            if (b2 != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                } else {
                    c(editable, b2);
                    z = true;
                }
            }
        }
        return null;
    }
}
