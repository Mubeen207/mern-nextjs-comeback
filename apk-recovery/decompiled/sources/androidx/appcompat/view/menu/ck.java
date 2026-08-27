package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.appcompat.view.menu.ck;
import androidx.appcompat.view.menu.hv;
import androidx.appcompat.view.menu.jw0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class ck extends jw0 {

    /* loaded from: classes.dex */
    public static final class a extends jw0.b {
        public final b d;

        /* renamed from: androidx.appcompat.view.menu.ck$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class animation.Animation$AnimationListenerC0002a implements Animation.AnimationListener {
            public final /* synthetic */ jw0.d a;
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ View c;
            public final /* synthetic */ a d;

            public animation.Animation$AnimationListenerC0002a(jw0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.a = dVar;
                this.b = viewGroup;
                this.c = view;
                this.d = aVar;
            }

            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                c60.e(viewGroup, "$container");
                c60.e(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().f(aVar);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                c60.e(animation, "animation");
                final ViewGroup viewGroup = this.b;
                final View view = this.c;
                final a aVar = this.d;
                viewGroup.post(new Runnable() { // from class: androidx.appcompat.view.menu.bk
                    @Override // java.lang.Runnable
                    public final void run() {
                        ck.a.animation.Animation$AnimationListenerC0002a.b(viewGroup, view, aVar);
                    }
                });
                if (rv.v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Animation from operation ");
                    sb.append(this.a);
                    sb.append(" has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                c60.e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                c60.e(animation, "animation");
                if (rv.v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Animation from operation ");
                    sb.append(this.a);
                    sb.append(" has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            c60.e(bVar, "animationInfo");
            this.d = bVar;
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void c(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
            jw0.d a = this.d.a();
            View view = a.i().H;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.d.a().f(this);
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(a);
                sb.append(" has been cancelled.");
            }
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void d(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
            if (this.d.b()) {
                this.d.a().f(this);
                return;
            }
            Context context = viewGroup.getContext();
            jw0.d a = this.d.a();
            View view = a.i().H;
            b bVar = this.d;
            c60.d(context, "context");
            hv.a c = bVar.c(context);
            if (c == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Animation animation = c.a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (a.h() != jw0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.d.a().f(this);
                return;
            }
            viewGroup.startViewTransition(view);
            hv.b bVar2 = new hv.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new animation.Animation$AnimationListenerC0002a(a, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(a);
                sb.append(" has started.");
            }
        }

        public final b h() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {
        public final boolean b;
        public boolean c;
        public hv.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jw0.d dVar, boolean z) {
            super(dVar);
            c60.e(dVar, "operation");
            this.b = z;
        }

        public final hv.a c(Context context) {
            c60.e(context, "context");
            if (this.c) {
                return this.d;
            }
            hv.a b = hv.b(context, a().i(), a().h() == jw0.d.b.VISIBLE, this.b);
            this.d = b;
            this.c = true;
            return b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jw0.b {
        public final b d;
        public AnimatorSet e;

        /* loaded from: classes.dex */
        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ ViewGroup a;
            public final /* synthetic */ View b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ jw0.d d;
            public final /* synthetic */ c e;

            public a(ViewGroup viewGroup, View view, boolean z, jw0.d dVar, c cVar) {
                this.a = viewGroup;
                this.b = view;
                this.c = z;
                this.d = dVar;
                this.e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                c60.e(animator, "anim");
                this.a.endViewTransition(this.b);
                if (this.c) {
                    jw0.d.b h = this.d.h();
                    View view = this.b;
                    c60.d(view, "viewToAnimate");
                    h.e(view, this.a);
                }
                this.e.h().a().f(this.e);
                if (rv.v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Animator from operation ");
                    sb.append(this.d);
                    sb.append(" has ended.");
                }
            }
        }

        public c(b bVar) {
            c60.e(bVar, "animatorInfo");
            this.d = bVar;
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public boolean b() {
            return true;
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void c(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
                return;
            }
            jw0.d a2 = this.d.a();
            if (a2.n()) {
                e.a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(a2);
                sb.append(" has been canceled");
                sb.append(a2.n() ? " with seeking." : ".");
                sb.append(' ');
            }
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void d(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
            jw0.d a2 = this.d.a();
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
                return;
            }
            animatorSet.start();
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(a2);
                sb.append(" has started.");
            }
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void e(h7 h7Var, ViewGroup viewGroup) {
            c60.e(h7Var, "backEvent");
            c60.e(viewGroup, "container");
            jw0.d a2 = this.d.a();
            AnimatorSet animatorSet = this.e;
            if (animatorSet == null) {
                this.d.a().f(this);
            } else if (Build.VERSION.SDK_INT < 34 || !a2.i().m) {
            } else {
                if (rv.v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Adding BackProgressCallbacks for Animators to operation ");
                    sb.append(a2);
                }
                long a3 = d.a.a(animatorSet);
                long a4 = h7Var.a() * ((float) a3);
                if (a4 == 0) {
                    a4 = 1;
                }
                if (a4 == a3) {
                    a4 = a3 - 1;
                }
                if (rv.v0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Setting currentPlayTime to ");
                    sb2.append(a4);
                    sb2.append(" for Animator ");
                    sb2.append(animatorSet);
                    sb2.append(" on operation ");
                    sb2.append(a2);
                }
                e.a.b(animatorSet, a4);
            }
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void f(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
            if (this.d.b()) {
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.d;
            c60.d(context, "context");
            hv.a c = bVar.c(context);
            this.e = c != null ? c.b : null;
            jw0.d a2 = this.d.a();
            fv i = a2.i();
            boolean z = a2.h() == jw0.d.b.GONE;
            View view = i.H;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.e;
            if (animatorSet != null) {
                animatorSet.addListener(new a(viewGroup, view, z, a2, this));
            }
            AnimatorSet animatorSet2 = this.e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static final d a = new d();

        public final long a(AnimatorSet animatorSet) {
            c60.e(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e a = new e();

        public final void a(AnimatorSet animatorSet) {
            c60.e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j) {
            c60.e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public final jw0.d a;

        public f(jw0.d dVar) {
            c60.e(dVar, "operation");
            this.a = dVar;
        }

        public final jw0.d a() {
            return this.a;
        }

        public final boolean b() {
            jw0.d.b bVar;
            View view = this.a.i().H;
            jw0.d.b a = view != null ? jw0.d.b.m.a(view) : null;
            jw0.d.b h = this.a.h();
            return a == h || !(a == (bVar = jw0.d.b.VISIBLE) || h == bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jw0.b {
        public final List d;
        public final jw0.d e;
        public final jw0.d f;
        public final fw g;
        public final Object h;
        public final ArrayList i;
        public final ArrayList j;
        public final o4 k;
        public final ArrayList l;
        public final ArrayList m;
        public final o4 n;
        public final o4 o;
        public final boolean p;
        public final ca q;
        public Object r;

        /* loaded from: classes.dex */
        public static final class a extends j80 implements iw {
            public final /* synthetic */ ViewGroup o;
            public final /* synthetic */ Object p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.o = viewGroup;
                this.p = obj;
            }

            public final void a() {
                g.this.v().e(this.o, this.p);
            }

            @Override // androidx.appcompat.view.menu.iw
            public /* bridge */ /* synthetic */ Object d() {
                a();
                return u31.a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends j80 implements iw {
            public final /* synthetic */ ViewGroup o;
            public final /* synthetic */ Object p;
            public final /* synthetic */ eo0 q;

            /* loaded from: classes.dex */
            public static final class a extends j80 implements iw {
                public final /* synthetic */ g n;
                public final /* synthetic */ ViewGroup o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, ViewGroup viewGroup) {
                    super(0);
                    this.n = gVar;
                    this.o = viewGroup;
                }

                public static final void c(g gVar, ViewGroup viewGroup) {
                    c60.e(gVar, "this$0");
                    c60.e(viewGroup, "$container");
                    for (h hVar : gVar.w()) {
                        jw0.d a = hVar.a();
                        View P = a.i().P();
                        if (P != null) {
                            a.h().e(P, viewGroup);
                        }
                    }
                }

                public final void b() {
                    rv.v0(2);
                    fw v = this.n.v();
                    Object s = this.n.s();
                    c60.b(s);
                    final g gVar = this.n;
                    final ViewGroup viewGroup = this.o;
                    v.d(s, new Runnable() { // from class: androidx.appcompat.view.menu.jk
                        @Override // java.lang.Runnable
                        public final void run() {
                            ck.g.b.a.c(ck.g.this, viewGroup);
                        }
                    });
                }

                @Override // androidx.appcompat.view.menu.iw
                public /* bridge */ /* synthetic */ Object d() {
                    b();
                    return u31.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, eo0 eo0Var) {
                super(0);
                this.o = viewGroup;
                this.p = obj;
                this.q = eo0Var;
            }

            public final void a() {
                g gVar = g.this;
                gVar.C(gVar.v().j(this.o, this.p));
                boolean z = g.this.s() != null;
                Object obj = this.p;
                ViewGroup viewGroup = this.o;
                if (!z) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.q.m = new a(g.this, viewGroup);
                if (rv.v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Started executing operations from ");
                    sb.append(g.this.t());
                    sb.append(" to ");
                    sb.append(g.this.u());
                }
            }

            @Override // androidx.appcompat.view.menu.iw
            public /* bridge */ /* synthetic */ Object d() {
                a();
                return u31.a;
            }
        }

        public g(List list, jw0.d dVar, jw0.d dVar2, fw fwVar, Object obj, ArrayList arrayList, ArrayList arrayList2, o4 o4Var, ArrayList arrayList3, ArrayList arrayList4, o4 o4Var2, o4 o4Var3, boolean z) {
            c60.e(list, "transitionInfos");
            c60.e(fwVar, "transitionImpl");
            c60.e(arrayList, "sharedElementFirstOutViews");
            c60.e(arrayList2, "sharedElementLastInViews");
            c60.e(o4Var, "sharedElementNameMapping");
            c60.e(arrayList3, "enteringNames");
            c60.e(arrayList4, "exitingNames");
            c60.e(o4Var2, "firstOutViews");
            c60.e(o4Var3, "lastInViews");
            this.d = list;
            this.e = dVar;
            this.f = dVar2;
            this.g = fwVar;
            this.h = obj;
            this.i = arrayList;
            this.j = arrayList2;
            this.k = o4Var;
            this.l = arrayList3;
            this.m = arrayList4;
            this.n = o4Var2;
            this.o = o4Var3;
            this.p = z;
            this.q = new ca();
        }

        public static final void A(jw0.d dVar, g gVar) {
            c60.e(dVar, "$operation");
            c60.e(gVar, "this$0");
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append(dVar);
                sb.append(" has completed");
            }
            dVar.f(gVar);
        }

        public static final void p(jw0.d dVar, jw0.d dVar2, g gVar) {
            c60.e(gVar, "this$0");
            dw.a(dVar.i(), dVar2.i(), gVar.p, gVar.o, false);
        }

        public static final void q(fw fwVar, View view, Rect rect) {
            c60.e(fwVar, "$impl");
            c60.e(rect, "$lastInEpicenterRect");
            fwVar.k(view, rect);
        }

        public static final void r(ArrayList arrayList) {
            c60.e(arrayList, "$transitioningViews");
            dw.d(arrayList, 4);
        }

        public static final void y(jw0.d dVar, g gVar) {
            c60.e(dVar, "$operation");
            c60.e(gVar, "this$0");
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append(dVar);
                sb.append(" has completed");
            }
            dVar.f(gVar);
        }

        public static final void z(eo0 eo0Var) {
            c60.e(eo0Var, "$seekCancelLambda");
            iw iwVar = (iw) eo0Var.m;
            if (iwVar != null) {
                iwVar.d();
            }
        }

        public final void B(ArrayList arrayList, ViewGroup viewGroup, iw iwVar) {
            dw.d(arrayList, 4);
            ArrayList q = this.g.q(this.j);
            if (rv.v0(2)) {
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    c60.d(next, "sharedElementFirstOutViews");
                    View view = (View) next;
                    StringBuilder sb = new StringBuilder();
                    sb.append("View: ");
                    sb.append(view);
                    sb.append(" Name: ");
                    sb.append(p51.F(view));
                }
                Iterator it2 = this.j.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    c60.d(next2, "sharedElementLastInViews");
                    View view2 = (View) next2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("View: ");
                    sb2.append(view2);
                    sb2.append(" Name: ");
                    sb2.append(p51.F(view2));
                }
            }
            iwVar.d();
            this.g.y(viewGroup, this.i, this.j, q, this.k);
            dw.d(arrayList, 0);
            this.g.A(this.h, this.i, this.j);
        }

        public final void C(Object obj) {
            this.r = obj;
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public boolean b() {
            if (this.g.m()) {
                List<h> list = this.d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (h hVar : list) {
                        if (Build.VERSION.SDK_INT < 34) {
                            break;
                        } else if (hVar.f() == null) {
                            break;
                        } else if (!this.g.n(hVar.f())) {
                            break;
                        }
                    }
                }
                Object obj = this.h;
                if (obj == null || this.g.n(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void c(ViewGroup viewGroup) {
            c60.e(viewGroup, "container");
            this.q.a();
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void d(ViewGroup viewGroup) {
            int j;
            c60.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.d) {
                    jw0.d a2 = hVar.a();
                    if (rv.v0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Container ");
                        sb.append(viewGroup);
                        sb.append(" has not been laid out. Completing operation ");
                        sb.append(a2);
                    }
                    hVar.a().f(this);
                }
                return;
            }
            Object obj = this.r;
            if (obj != null) {
                fw fwVar = this.g;
                c60.b(obj);
                fwVar.c(obj);
                if (rv.v0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ending execution of operations from ");
                    sb2.append(this.e);
                    sb2.append(" to ");
                    sb2.append(this.f);
                    return;
                }
                return;
            }
            oh0 o = o(viewGroup, this.f, this.e);
            ArrayList arrayList = (ArrayList) o.a();
            Object b2 = o.b();
            List<h> list = this.d;
            j = tc.j(list, 10);
            ArrayList<jw0.d> arrayList2 = new ArrayList(j);
            for (h hVar2 : list) {
                arrayList2.add(hVar2.a());
            }
            for (final jw0.d dVar : arrayList2) {
                this.g.w(dVar.i(), b2, this.q, new Runnable() { // from class: androidx.appcompat.view.menu.dk
                    @Override // java.lang.Runnable
                    public final void run() {
                        ck.g.y(jw0.d.this, this);
                    }
                });
            }
            B(arrayList, viewGroup, new a(viewGroup, b2));
            if (rv.v0(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Completed executing operations from ");
                sb3.append(this.e);
                sb3.append(" to ");
                sb3.append(this.f);
            }
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void e(h7 h7Var, ViewGroup viewGroup) {
            c60.e(h7Var, "backEvent");
            c60.e(viewGroup, "container");
            Object obj = this.r;
            if (obj != null) {
                this.g.t(obj, h7Var.a());
            }
        }

        @Override // androidx.appcompat.view.menu.jw0.b
        public void f(ViewGroup viewGroup) {
            int j;
            c60.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.d) {
                    jw0.d a2 = hVar.a();
                    if (rv.v0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Container ");
                        sb.append(viewGroup);
                        sb.append(" has not been laid out. Skipping onStart for operation ");
                        sb.append(a2);
                    }
                }
                return;
            }
            if (x() && this.h != null && !b()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring shared elements transition ");
                sb2.append(this.h);
                sb2.append(" between ");
                sb2.append(this.e);
                sb2.append(" and ");
                sb2.append(this.f);
                sb2.append(" as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final eo0 eo0Var = new eo0();
                oh0 o = o(viewGroup, this.f, this.e);
                ArrayList arrayList = (ArrayList) o.a();
                Object b2 = o.b();
                List<h> list = this.d;
                j = tc.j(list, 10);
                ArrayList<jw0.d> arrayList2 = new ArrayList(j);
                for (h hVar2 : list) {
                    arrayList2.add(hVar2.a());
                }
                for (final jw0.d dVar : arrayList2) {
                    this.g.x(dVar.i(), b2, this.q, new Runnable() { // from class: androidx.appcompat.view.menu.ek
                        @Override // java.lang.Runnable
                        public final void run() {
                            ck.g.z(eo0.this);
                        }
                    }, new Runnable() { // from class: androidx.appcompat.view.menu.fk
                        @Override // java.lang.Runnable
                        public final void run() {
                            ck.g.A(jw0.d.this, this);
                        }
                    });
                }
                B(arrayList, viewGroup, new b(viewGroup, b2, eo0Var));
            }
        }

        public final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (v51.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    c60.d(childAt, "child");
                    n(arrayList, childAt);
                }
            }
        }

        public final oh0 o(ViewGroup viewGroup, jw0.d dVar, final jw0.d dVar2) {
            Iterator it;
            Set x;
            Set x2;
            final jw0.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            boolean z = false;
            View view2 = null;
            for (h hVar : this.d) {
                if (hVar.g() && dVar2 != null && dVar3 != null && (!this.k.isEmpty()) && this.h != null) {
                    dw.a(dVar.i(), dVar2.i(), this.p, this.n, true);
                    rg0.a(viewGroup, new Runnable() { // from class: androidx.appcompat.view.menu.gk
                        @Override // java.lang.Runnable
                        public final void run() {
                            ck.g.p(jw0.d.this, dVar2, this);
                        }
                    });
                    this.i.addAll(this.n.values());
                    if (!this.m.isEmpty()) {
                        Object obj = this.m.get(0);
                        c60.d(obj, "exitingNames[0]");
                        view2 = (View) this.n.get((String) obj);
                        this.g.v(this.h, view2);
                    }
                    this.j.addAll(this.o.values());
                    if (!this.l.isEmpty()) {
                        Object obj2 = this.l.get(0);
                        c60.d(obj2, "enteringNames[0]");
                        final View view3 = (View) this.o.get((String) obj2);
                        if (view3 != null) {
                            final fw fwVar = this.g;
                            rg0.a(viewGroup, new Runnable() { // from class: androidx.appcompat.view.menu.hk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ck.g.q(fw.this, view3, rect);
                                }
                            });
                            z = true;
                        }
                    }
                    this.g.z(this.h, view, this.i);
                    fw fwVar2 = this.g;
                    Object obj3 = this.h;
                    fwVar2.s(obj3, null, null, null, null, obj3, this.j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.d.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                jw0.d a2 = hVar2.a();
                Object h = this.g.h(hVar2.f());
                if (h != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    it = it2;
                    View view4 = a2.i().H;
                    Object obj6 = obj5;
                    c60.d(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.h != null && (a2 == dVar2 || a2 == dVar3)) {
                        if (a2 == dVar2) {
                            x2 = ad.x(this.i);
                            arrayList2.removeAll(x2);
                        } else {
                            x = ad.x(this.j);
                            arrayList2.removeAll(x);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.g.a(h, view);
                    } else {
                        this.g.b(h, arrayList2);
                        this.g.s(h, h, arrayList2, null, null, null, null);
                        if (a2.h() == jw0.d.b.GONE) {
                            a2.r(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(a2.i().H);
                            this.g.r(h, a2.i().H, arrayList3);
                            rg0.a(viewGroup, new Runnable() { // from class: androidx.appcompat.view.menu.ik
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ck.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (a2.h() == jw0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z) {
                            this.g.u(h, rect);
                        }
                        if (rv.v0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Entering Transition: ");
                            sb.append(h);
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                c60.d(next, "transitioningViews");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("View: ");
                                sb2.append((View) next);
                            }
                        }
                    } else {
                        this.g.v(h, view2);
                        if (rv.v0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Exiting Transition: ");
                            sb3.append(h);
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next2 = it4.next();
                                c60.d(next2, "transitioningViews");
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("View: ");
                                sb4.append((View) next2);
                            }
                        }
                    }
                    if (hVar2.h()) {
                        obj4 = this.g.p(obj4, h, null);
                        dVar3 = dVar;
                        it2 = it;
                        obj5 = obj6;
                    } else {
                        obj5 = this.g.p(obj6, h, null);
                    }
                } else {
                    it = it2;
                }
                dVar3 = dVar;
                it2 = it;
            }
            Object o = this.g.o(obj4, obj5, this.h);
            if (rv.v0(2)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Final merged transition: ");
                sb5.append(o);
            }
            return new oh0(arrayList, o);
        }

        public final Object s() {
            return this.r;
        }

        public final jw0.d t() {
            return this.e;
        }

        public final jw0.d u() {
            return this.f;
        }

        public final fw v() {
            return this.g;
        }

        public final List w() {
            return this.d;
        }

        public final boolean x() {
            List<h> list = this.d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            for (h hVar : list) {
                if (!hVar.a().i().m) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends f {
        public final Object b;
        public final boolean c;
        public final Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(jw0.d dVar, boolean z, boolean z2) {
            super(dVar);
            Object J;
            c60.e(dVar, "operation");
            jw0.d.b h = dVar.h();
            jw0.d.b bVar = jw0.d.b.VISIBLE;
            if (h == bVar) {
                fv i = dVar.i();
                J = z ? i.H() : i.s();
            } else {
                fv i2 = dVar.i();
                J = z ? i2.J() : i2.v();
            }
            this.b = J;
            this.c = dVar.h() == bVar ? z ? dVar.i().n() : dVar.i().m() : true;
            this.d = z2 ? z ? dVar.i().L() : dVar.i().K() : null;
        }

        public final fw c() {
            fw d = d(this.b);
            fw d2 = d(this.d);
            if (d == null || d2 == null || d == d2) {
                return d == null ? d2 : d;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().i() + " returned Transition " + this.b + " which uses a different Transition  type than its shared element transition " + this.d).toString());
        }

        public final fw d(Object obj) {
            if (obj == null) {
                return null;
            }
            fw fwVar = dw.b;
            if (fwVar == null || !fwVar.g(obj)) {
                fw fwVar2 = dw.c;
                if (fwVar2 == null || !fwVar2.g(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().i() + " is not a valid framework Transition or AndroidX Transition");
                }
                return fwVar2;
            }
            return fwVar;
        }

        public final Object e() {
            return this.d;
        }

        public final Object f() {
            return this.b;
        }

        public final boolean g() {
            return this.d != null;
        }

        public final boolean h() {
            return this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends j80 implements kw {
        public final /* synthetic */ Collection n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.n = collection;
        }

        @Override // androidx.appcompat.view.menu.kw
        /* renamed from: a */
        public final Boolean i(Map.Entry entry) {
            boolean n;
            c60.e(entry, "entry");
            n = ad.n(this.n, p51.F((View) entry.getValue()));
            return Boolean.valueOf(n);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(ViewGroup viewGroup) {
        super(viewGroup);
        c60.e(viewGroup, "container");
    }

    public static final void D(ck ckVar, jw0.d dVar) {
        c60.e(ckVar, "this$0");
        c60.e(dVar, "$operation");
        ckVar.c(dVar);
    }

    public final void C(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xc.k(arrayList2, ((b) it.next()).a().g());
        }
        boolean z = !arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            jw0.d a2 = bVar.a();
            c60.d(context, "context");
            hv.a c2 = bVar.c(context);
            if (c2 != null) {
                if (c2.b == null) {
                    arrayList.add(bVar);
                } else {
                    fv i2 = a2.i();
                    if (!(!a2.g().isEmpty())) {
                        if (a2.h() == jw0.d.b.GONE) {
                            a2.r(false);
                        }
                        a2.b(new c(bVar));
                        z2 = true;
                    } else if (rv.v0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Ignoring Animator set on ");
                        sb.append(i2);
                        sb.append(" as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            jw0.d a3 = bVar2.a();
            fv i3 = a3.i();
            if (z) {
                if (rv.v0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(i3);
                    sb2.append(" as Animations cannot run alongside Transitions.");
                }
            } else if (!z2) {
                a3.b(new a(bVar2));
            } else if (rv.v0(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Ignoring Animation set on ");
                sb3.append(i3);
                sb3.append(" as Animations cannot run alongside Animators.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02b6 A[LOOP:10: B:75:0x02b0->B:77:0x02b6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.util.List r21, boolean r22, androidx.appcompat.view.menu.jw0.d r23, androidx.appcompat.view.menu.jw0.d r24) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ck.E(java.util.List, boolean, androidx.appcompat.view.menu.jw0$d, androidx.appcompat.view.menu.jw0$d):void");
    }

    public final void F(Map map, View view) {
        String F = p51.F(view);
        if (F != null) {
            map.put(F, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    c60.d(childAt, "child");
                    F(map, childAt);
                }
            }
        }
    }

    public final void G(o4 o4Var, Collection collection) {
        Set entrySet = o4Var.entrySet();
        c60.d(entrySet, "entries");
        xc.m(entrySet, new i(collection));
    }

    public final void H(List list) {
        Object s;
        s = ad.s(list);
        fv i2 = ((jw0.d) s).i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jw0.d dVar = (jw0.d) it.next();
            dVar.i().K.b = i2.K.b;
            dVar.i().K.c = i2.K.c;
            dVar.i().K.d = i2.K.d;
            dVar.i().K.e = i2.K.e;
        }
    }

    @Override // androidx.appcompat.view.menu.jw0
    public void d(List list, boolean z) {
        Object obj;
        Object obj2;
        c60.e(list, "operations");
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            jw0.d dVar = (jw0.d) obj2;
            jw0.d.b.a aVar = jw0.d.b.m;
            View view = dVar.i().H;
            c60.d(view, "operation.fragment.mView");
            jw0.d.b a2 = aVar.a(view);
            jw0.d.b bVar = jw0.d.b.VISIBLE;
            if (a2 == bVar && dVar.h() != bVar) {
                break;
            }
        }
        jw0.d dVar2 = (jw0.d) obj2;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            jw0.d dVar3 = (jw0.d) previous;
            jw0.d.b.a aVar2 = jw0.d.b.m;
            View view2 = dVar3.i().H;
            c60.d(view2, "operation.fragment.mView");
            jw0.d.b a3 = aVar2.a(view2);
            jw0.d.b bVar2 = jw0.d.b.VISIBLE;
            if (a3 != bVar2 && dVar3.h() == bVar2) {
                obj = previous;
                break;
            }
        }
        jw0.d dVar4 = (jw0.d) obj;
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(dVar2);
            sb.append(" to ");
            sb.append(dVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        H(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final jw0.d dVar5 = (jw0.d) it2.next();
            arrayList.add(new b(dVar5, z));
            boolean z2 = false;
            if (z) {
                if (dVar5 != dVar2) {
                    arrayList2.add(new h(dVar5, z, z2));
                    dVar5.a(new Runnable() { // from class: androidx.appcompat.view.menu.ak
                        @Override // java.lang.Runnable
                        public final void run() {
                            ck.D(ck.this, dVar5);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new h(dVar5, z, z2));
                dVar5.a(new Runnable() { // from class: androidx.appcompat.view.menu.ak
                    @Override // java.lang.Runnable
                    public final void run() {
                        ck.D(ck.this, dVar5);
                    }
                });
            } else {
                if (dVar5 != dVar4) {
                    arrayList2.add(new h(dVar5, z, z2));
                    dVar5.a(new Runnable() { // from class: androidx.appcompat.view.menu.ak
                        @Override // java.lang.Runnable
                        public final void run() {
                            ck.D(ck.this, dVar5);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new h(dVar5, z, z2));
                dVar5.a(new Runnable() { // from class: androidx.appcompat.view.menu.ak
                    @Override // java.lang.Runnable
                    public final void run() {
                        ck.D(ck.this, dVar5);
                    }
                });
            }
        }
        E(arrayList2, z, dVar2, dVar4);
        C(arrayList);
    }
}
