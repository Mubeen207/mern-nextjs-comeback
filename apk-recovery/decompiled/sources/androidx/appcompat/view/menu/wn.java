package androidx.appcompat.view.menu;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class wn {
    public final b a;

    /* loaded from: classes.dex */
    public static class a extends b {
        public final TextView a;
        public final tn b;
        public boolean c = true;

        public a(TextView textView) {
            this.a = textView;
            this.b = new tn(textView);
        }

        @Override // androidx.appcompat.view.menu.wn.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.c ? f(inputFilterArr) : d(inputFilterArr);
        }

        @Override // androidx.appcompat.view.menu.wn.b
        public void b(boolean z) {
            if (z) {
                j();
            }
        }

        @Override // androidx.appcompat.view.menu.wn.b
        public void c(boolean z) {
            this.c = z;
            j();
            i();
        }

        public final InputFilter[] d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        public final SparseArray e(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof tn) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            SparseArray e = e(inputFilterArr);
            if (e.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - e.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (e.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        public void g(boolean z) {
            this.c = z;
        }

        public final TransformationMethod h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof yn ? ((yn) transformationMethod).a() : transformationMethod;
        }

        public final void i() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        public void j() {
            this.a.setTransformationMethod(l(this.a.getTransformationMethod()));
        }

        public final TransformationMethod k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof yn) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new yn(transformationMethod);
        }

        public TransformationMethod l(TransformationMethod transformationMethod) {
            return this.c ? k(transformationMethod) : h(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract void b(boolean z);

        public abstract void c(boolean z);
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public final a a;

        public c(TextView textView) {
            this.a = new a(textView);
        }

        @Override // androidx.appcompat.view.menu.wn.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // androidx.appcompat.view.menu.wn.b
        public void b(boolean z) {
            if (d()) {
                return;
            }
            this.a.b(z);
        }

        @Override // androidx.appcompat.view.menu.wn.b
        public void c(boolean z) {
            if (d()) {
                this.a.g(z);
            } else {
                this.a.c(z);
            }
        }

        public final boolean d() {
            return !androidx.emoji2.text.c.i();
        }
    }

    public wn(TextView textView, boolean z) {
        tj0.h(textView, "textView cannot be null");
        if (z) {
            this.a = new a(textView);
        } else {
            this.a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public void b(boolean z) {
        this.a.b(z);
    }

    public void c(boolean z) {
        this.a.c(z);
    }
}
