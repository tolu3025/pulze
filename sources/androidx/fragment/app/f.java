package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.D;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f4508a;

    private f(h hVar) {
        this.f4508a = hVar;
    }

    public static f b(h hVar) {
        return new f((h) j.e.c(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h hVar = this.f4508a;
        hVar.f4514e.p(hVar, hVar, fragment);
    }

    public void c() {
        this.f4508a.f4514e.y();
    }

    public void d(Configuration configuration) {
        this.f4508a.f4514e.z(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f4508a.f4514e.A(menuItem);
    }

    public void f() {
        this.f4508a.f4514e.B();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f4508a.f4514e.C(menu, menuInflater);
    }

    public void h() {
        this.f4508a.f4514e.D();
    }

    public void i() {
        this.f4508a.f4514e.F();
    }

    public void j(boolean z2) {
        this.f4508a.f4514e.G(z2);
    }

    public boolean k(MenuItem menuItem) {
        return this.f4508a.f4514e.V(menuItem);
    }

    public void l(Menu menu) {
        this.f4508a.f4514e.W(menu);
    }

    public void m() {
        this.f4508a.f4514e.Y();
    }

    public void n(boolean z2) {
        this.f4508a.f4514e.Z(z2);
    }

    public boolean o(Menu menu) {
        return this.f4508a.f4514e.a0(menu);
    }

    public void p() {
        this.f4508a.f4514e.c0();
    }

    public void q() {
        this.f4508a.f4514e.d0();
    }

    public void r() {
        this.f4508a.f4514e.f0();
    }

    public boolean s() {
        return this.f4508a.f4514e.l0();
    }

    public Fragment t(String str) {
        return this.f4508a.f4514e.q0(str);
    }

    public i u() {
        return this.f4508a.f4514e;
    }

    public void v() {
        this.f4508a.f4514e.S0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4508a.f4514e.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h hVar = this.f4508a;
        if (!(hVar instanceof D)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        hVar.f4514e.c1(parcelable);
    }

    public Parcelable y() {
        return this.f4508a.f4514e.e1();
    }
}
