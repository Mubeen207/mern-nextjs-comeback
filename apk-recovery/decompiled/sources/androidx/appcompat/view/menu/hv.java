package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
/* loaded from: classes.dex */
public abstract class hv {
    public static int a(fv fvVar, boolean z, boolean z2) {
        return z2 ? z ? fvVar.E() : fvVar.F() : z ? fvVar.r() : fvVar.u();
    }

    public static a b(Context context, fv fvVar, boolean z, boolean z2) {
        int A = fvVar.A();
        int a2 = a(fvVar, z, z2);
        fvVar.W0(0, 0, 0, 0);
        ViewGroup viewGroup = fvVar.G;
        if (viewGroup != null && viewGroup.getTag(qm0.c) != null) {
            fvVar.G.setTag(qm0.c, null);
        }
        ViewGroup viewGroup2 = fvVar.G;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation c0 = fvVar.c0(A, z, a2);
            if (c0 != null) {
                return new a(c0);
            }
            Animator d0 = fvVar.d0(A, z, a2);
            if (d0 != null) {
                return new a(d0);
            }
            if (a2 == 0 && A != 0) {
                a2 = d(context, A, z);
            }
            if (a2 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(a2));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, a2);
                        if (loadAnimation != null) {
                            return new a(loadAnimation);
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, a2);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? yl0.e : yl0.f;
        } else if (i == 8194) {
            return z ? yl0.a : yl0.b;
        } else if (i == 8197) {
            return z ? c(context, 16842938) : c(context, 16842939);
        } else if (i == 4099) {
            return z ? yl0.c : yl0.d;
        } else if (i != 4100) {
            return -1;
        } else {
            return z ? c(context, 16842936) : c(context, 16842937);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public final Animation a;
        public final AnimatorSet b;

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup m;
        public final View n;
        public boolean o;
        public boolean p;
        public boolean q;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.q = true;
            this.m = viewGroup;
            this.n = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.q = true;
            if (this.o) {
                return !this.p;
            }
            if (!super.getTransformation(j, transformation)) {
                this.o = true;
                rg0.a(this.m, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.o || !this.q) {
                this.m.endViewTransition(this.n);
                this.p = true;
                return;
            }
            this.q = false;
            this.m.post(this);
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.q = true;
            if (this.o) {
                return !this.p;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.o = true;
                rg0.a(this.m, this);
            }
            return true;
        }
    }
}
