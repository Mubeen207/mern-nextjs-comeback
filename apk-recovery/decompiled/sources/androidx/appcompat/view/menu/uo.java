package androidx.appcompat.view.menu;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* loaded from: classes.dex */
public class uo extends DialogFragment {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    public Dialog c;

    public static uo a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        uo uoVar = new uo();
        Dialog dialog2 = (Dialog) pj0.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        uoVar.a = dialog2;
        if (onCancelListener != null) {
            uoVar.b = onCancelListener;
        }
        return uoVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.c == null) {
                this.c = new AlertDialog.Builder((Context) pj0.i(getActivity())).create();
            }
            return this.c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
