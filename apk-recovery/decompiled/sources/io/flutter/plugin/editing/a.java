package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.view.menu.a01;
import androidx.appcompat.view.menu.ha0;
import androidx.appcompat.view.menu.lu;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.b;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a extends BaseInputConnection implements b.InterfaceC0070b {
    public final View a;
    public final int b;
    public final a01 c;
    public final b d;
    public final EditorInfo e;
    public ExtractedTextRequest f;
    public boolean g;
    public CursorAnchorInfo.Builder h;
    public ExtractedText i;
    public InputMethodManager j;
    public final Layout k;
    public lu l;
    public final InterfaceC0069a m;
    public int n;

    /* renamed from: io.flutter.plugin.editing.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0069a {
        boolean b(KeyEvent keyEvent);
    }

    public a(View view, int i, a01 a01Var, InterfaceC0069a interfaceC0069a, b bVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.g = false;
        this.i = new ExtractedText();
        this.n = 0;
        this.a = view;
        this.b = i;
        this.c = a01Var;
        this.d = bVar;
        bVar.a(this);
        this.e = editorInfo;
        this.m = interfaceC0069a;
        this.l = new lu(flutterJNI);
        this.k = new DynamicLayout(bVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.b.InterfaceC0070b
    public void a(boolean z, boolean z2, boolean z3) {
        this.j.updateSelection(this.a, this.d.i(), this.d.h(), this.d.g(), this.d.f());
        ExtractedTextRequest extractedTextRequest = this.f;
        if (extractedTextRequest != null) {
            this.j.updateExtractedText(this.a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.g) {
            this.j.updateCursorAnchorInfo(this.a, c());
        }
    }

    public final boolean b(int i) {
        if (i == 16908319) {
            setSelection(0, this.d.length());
            return true;
        } else if (i == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.d);
            int selectionEnd = Selection.getSelectionEnd(this.d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.d.subSequence(min, max)));
                this.d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.d);
            int selectionEnd2 = Selection.getSelectionEnd(this.d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) this.a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.d.delete(min2, max4);
                }
                this.d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.d.b();
        this.n++;
        return super.beginBatchEdit();
    }

    public final CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.h;
        if (builder == null) {
            this.h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.h.setSelectionRange(this.d.i(), this.d.h());
        int g = this.d.g();
        int f = this.d.f();
        if (g < 0 || f <= g) {
            this.h.setComposingText(-1, "");
        } else {
            this.h.setComposingText(g, this.d.toString().subSequence(g, f));
        }
        return this.h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        return super.clearMetaKeyStates(i);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.d.l(this);
        while (this.n > 0) {
            endBatchEdit();
            this.n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h);
                                hashMap.put("uri", contentUri.toString());
                                this.c.b(this.b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        return super.commitText(charSequence, i);
    }

    public final ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.d.i();
        this.i.selectionEnd = this.d.h();
        this.i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.d.toString() : this.d;
        return this.i;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (this.d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public final boolean e(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.d);
        int selectionEnd = Selection.getSelectionEnd(this.d);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z ? Math.max(this.l.b(this.d, selectionEnd), 0) : Math.min(this.l.a(this.d, selectionEnd), this.d.length());
        if (selectionStart != selectionEnd || z2) {
            setSelection(selectionStart, max);
            return true;
        }
        setSelection(max, max);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.n--;
        this.d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.e;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.d);
            int selectionEnd = Selection.getSelectionEnd(this.d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.d.delete(min, max);
                }
                this.d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                int i = min + 1;
                setSelection(i, i);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public final boolean g(boolean z, boolean z2) {
        int selectionStart = Selection.getSelectionStart(this.d);
        int selectionEnd = Selection.getSelectionEnd(this.d);
        boolean z3 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z2) {
            z3 = true;
        }
        beginBatchEdit();
        if (z3) {
            if (z) {
                Selection.moveUp(this.d, this.k);
            } else {
                Selection.moveDown(this.d, this.k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z) {
                Selection.extendUp(this.d, this.k);
            } else {
                Selection.extendDown(this.d, this.k);
            }
            setSelection(Selection.getSelectionStart(this.d), Selection.getSelectionEnd(this.d));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        if (z == (this.f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z ? "on" : "off");
            ha0.a("InputConnectionAdaptor", sb.toString());
        }
        this.f = z ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    public final byte[] h(InputStream inputStream, int i) {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            try {
                i2 = inputStream.read(bArr);
            } catch (IOException unused) {
                i2 = -1;
            }
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean b = b(i);
        endBatchEdit();
        return b;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        if (i == 0) {
            this.c.o(this.b);
        } else if (i == 1) {
            this.c.g(this.b);
        } else if (i == 2) {
            this.c.f(this.b);
        } else if (i == 3) {
            this.c.l(this.b);
        } else if (i == 4) {
            this.c.m(this.b);
        } else if (i == 5) {
            this.c.h(this.b);
        } else if (i != 7) {
            this.c.e(this.b);
        } else {
            this.c.j(this.b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.c.i(this.b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        if ((i & 1) != 0) {
            this.j.updateCursorAnchorInfo(this.a, c());
        }
        boolean z = (i & 2) != 0;
        if (z != this.g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z ? "on" : "off");
            ha0.a("InputConnectionAdaptor", sb.toString());
        }
        this.g = z;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.m.b(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        return super.setComposingRegion(i, i2);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i2);
        endBatchEdit();
        return selection;
    }

    public a(View view, int i, a01 a01Var, InterfaceC0069a interfaceC0069a, b bVar, EditorInfo editorInfo) {
        this(view, i, a01Var, interfaceC0069a, bVar, editorInfo, new FlutterJNI());
    }
}
