package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.zc0;
/* loaded from: classes.dex */
public final class tc0 implements ny0 {
    public View A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public pc0 n;
    public dy0 o;
    public Runnable p;
    public MenuItem.OnMenuItemClickListener q;
    public CharSequence r;
    public CharSequence s;
    public int z;
    public int i = 4096;
    public int k = 4096;
    public int m = 0;
    public ColorStateList t = null;
    public PorterDuff.Mode u = null;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public int y = 16;
    public boolean C = false;

    public tc0(pc0 pc0Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = pc0Var;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.z = i5;
    }

    public static void b(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public boolean A() {
        return (this.z & 4) == 4;
    }

    public void a() {
        this.n.F(this);
    }

    public final Drawable c(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = om.l(drawable).mutate();
            if (this.v) {
                om.i(drawable, this.t);
            }
            if (this.w) {
                om.j(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.e(this);
        }
        return false;
    }

    public int d() {
        return this.d;
    }

    public char e() {
        return this.n.D() ? this.j : this.h;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (i()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.n.j(this);
            }
            return false;
        }
        return false;
    }

    public String f() {
        char e = e();
        if (e == 0) {
            return "";
        }
        Resources resources = this.n.s().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.s()).hasPermanentMenuKey()) {
            sb.append(resources.getString(fn0.k));
        }
        int i = this.n.D() ? this.k : this.i;
        b(sb, i, 65536, resources.getString(fn0.g));
        b(sb, i, 4096, resources.getString(fn0.c));
        b(sb, i, 2, resources.getString(fn0.b));
        b(sb, i, 1, resources.getString(fn0.h));
        b(sb, i, 4, resources.getString(fn0.j));
        b(sb, i, 8, resources.getString(fn0.f));
        if (e == '\b') {
            sb.append(resources.getString(fn0.d));
        } else if (e == '\n') {
            sb.append(resources.getString(fn0.e));
        } else if (e != ' ') {
            sb.append(e);
        } else {
            sb.append(resources.getString(fn0.i));
        }
        return sb.toString();
    }

    public y0 g() {
        return null;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return c(drawable);
        }
        if (this.m != 0) {
            Drawable b = i3.b(this.n.s(), this.m);
            this.m = 0;
            this.l = b;
            return c(b);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    public CharSequence h(zc0.a aVar) {
        return (aVar == null || !aVar.b()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    public boolean i() {
        return ((this.z & 8) == 0 || this.A == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.y & 8) == 0;
    }

    public boolean j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            pc0 pc0Var = this.n;
            if (pc0Var.g(pc0Var, this)) {
                return true;
            }
            Runnable runnable = this.p;
            if (runnable != null) {
                runnable.run();
                return true;
            } else if (this.g != null) {
                try {
                    this.n.s().startActivity(this.g);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean k() {
        return (this.y & 32) == 32;
    }

    public boolean l() {
        return (this.y & 4) != 0;
    }

    public boolean m() {
        return (this.z & 1) == 1;
    }

    public boolean n() {
        return (this.z & 2) == 2;
    }

    @Override // android.view.MenuItem
    /* renamed from: o */
    public ny0 setActionView(int i) {
        Context s = this.n.s();
        setActionView(LayoutInflater.from(s).inflate(i, (ViewGroup) new LinearLayout(s), false));
        return this;
    }

    @Override // android.view.MenuItem
    /* renamed from: p */
    public ny0 setActionView(View view) {
        int i;
        this.A = view;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        this.n.F(this);
        return this;
    }

    public void q(boolean z) {
        this.C = z;
        this.n.H(false);
    }

    public void r(boolean z) {
        int i = this.y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.y = i2;
        if (i != i2) {
            this.n.H(false);
        }
    }

    public void s(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.y = i2;
        if (i != i2) {
            this.n.H(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.N(this);
        } else {
            r(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.H(false);
        return this;
    }

    @Override // androidx.appcompat.view.menu.ny0, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.H(false);
        return this;
    }

    @Override // androidx.appcompat.view.menu.ny0, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i;
        this.n.F(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.H(false);
        dy0 dy0Var = this.o;
        if (dy0Var != null) {
            dy0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (x(z)) {
            this.n.G(this);
        }
        return this;
    }

    public void t(boolean z) {
        if (z) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.D = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    /* renamed from: v */
    public ny0 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public void w(dy0 dy0Var) {
        this.o = dy0Var;
        dy0Var.setHeaderTitle(getTitle());
    }

    public boolean x(boolean z) {
        int i = this.y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.y = i2;
        return i != i2;
    }

    public boolean y() {
        return this.n.w();
    }

    public boolean z() {
        return this.n.E() && e() != 0;
    }

    @Override // android.view.MenuItem
    public ny0 setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.x = true;
        this.n.H(false);
        return this;
    }

    @Override // androidx.appcompat.view.menu.ny0, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public ny0 setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.H(false);
        return this;
    }

    @Override // androidx.appcompat.view.menu.ny0, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.H(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.n.s().getString(i));
    }
}
