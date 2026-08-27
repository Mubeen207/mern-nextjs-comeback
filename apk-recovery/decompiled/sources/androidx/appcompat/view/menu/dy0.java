package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.pc0;
/* loaded from: classes.dex */
public class dy0 extends pc0 implements SubMenu {
    public pc0 B;
    public tc0 C;

    public dy0(Context context, pc0 pc0Var, tc0 tc0Var) {
        super(context);
        this.B = pc0Var;
        this.C = tc0Var;
    }

    @Override // androidx.appcompat.view.menu.pc0
    public boolean C() {
        return this.B.C();
    }

    @Override // androidx.appcompat.view.menu.pc0
    public boolean D() {
        return this.B.D();
    }

    @Override // androidx.appcompat.view.menu.pc0
    public boolean E() {
        return this.B.E();
    }

    @Override // androidx.appcompat.view.menu.pc0
    public void M(pc0.a aVar) {
        this.B.M(aVar);
    }

    public Menu X() {
        return this.B;
    }

    @Override // androidx.appcompat.view.menu.pc0
    public boolean e(tc0 tc0Var) {
        return this.B.e(tc0Var);
    }

    @Override // androidx.appcompat.view.menu.pc0
    public boolean g(pc0 pc0Var, MenuItem menuItem) {
        return super.g(pc0Var, menuItem) || this.B.g(pc0Var, menuItem);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    @Override // androidx.appcompat.view.menu.pc0
    public boolean j(tc0 tc0Var) {
        return this.B.j(tc0Var);
    }

    @Override // androidx.appcompat.view.menu.pc0, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.P(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.S(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.T(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.pc0, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.pc0
    public pc0 z() {
        return this.B.z();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.O(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.R(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.C.setIcon(i);
        return this;
    }
}
