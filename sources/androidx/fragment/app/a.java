package androidx.fragment.app;

import V0.I;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends n implements j.InterfaceC0090j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final j f4467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f4468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f4469u = -1;

    public a(j jVar) {
        this.f4467s = jVar;
    }

    private static boolean r(n.a aVar) {
        Fragment fragment = aVar.f4626b;
        return (fragment == null || !fragment.f4435p || fragment.f4408L == null || fragment.f4401E || fragment.f4400D || !fragment.R()) ? false : true;
    }

    @Override // androidx.fragment.app.j.InterfaceC0090j
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (j.f4517M) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4614h) {
            return true;
        }
        this.f4467s.k(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public int d() {
        return i(false);
    }

    @Override // androidx.fragment.app.n
    public int e() {
        return i(true);
    }

    @Override // androidx.fragment.app.n
    void f(int i3, Fragment fragment, String str, int i4) {
        super.f(i3, fragment, str, i4);
        fragment.f4442w = this.f4467s;
    }

    @Override // androidx.fragment.app.n
    public n g(Fragment fragment) {
        j jVar = fragment.f4442w;
        if (jVar == null || jVar == this.f4467s) {
            return super.g(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void h(int i3) {
        if (this.f4614h) {
            if (j.f4517M) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            int size = this.f4607a.size();
            for (int i4 = 0; i4 < size; i4++) {
                n.a aVar = (n.a) this.f4607a.get(i4);
                Fragment fragment = aVar.f4626b;
                if (fragment != null) {
                    fragment.f4441v += i3;
                    if (j.f4517M) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4626b + " to " + aVar.f4626b.f4441v);
                    }
                }
            }
        }
    }

    int i(boolean z2) {
        if (this.f4468t) {
            throw new IllegalStateException("commit already called");
        }
        if (j.f4517M) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new j.c("FragmentManager"));
            j("  ", printWriter);
            printWriter.close();
        }
        this.f4468t = true;
        this.f4469u = this.f4614h ? this.f4467s.n(this) : -1;
        this.f4467s.i0(this, z2);
        return this.f4469u;
    }

    public void j(String str, PrintWriter printWriter) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4616j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4469u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4468t);
            if (this.f4612f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4612f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f4613g));
            }
            if (this.f4608b != 0 || this.f4609c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4608b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4609c));
            }
            if (this.f4610d != 0 || this.f4611e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4610d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4611e));
            }
            if (this.f4617k != 0 || this.f4618l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4617k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4618l);
            }
            if (this.f4619m != 0 || this.f4620n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4619m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4620n);
            }
        }
        if (this.f4607a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4607a.size();
        for (int i3 = 0; i3 < size; i3++) {
            n.a aVar = (n.a) this.f4607a.get(i3);
            switch (aVar.f4625a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f4625a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i3);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4626b);
            if (z2) {
                if (aVar.f4627c != 0 || aVar.f4628d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4627c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4628d));
                }
                if (aVar.f4629e != 0 || aVar.f4630f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4629e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4630f));
                }
            }
        }
    }

    void l() {
        int size = this.f4607a.size();
        for (int i3 = 0; i3 < size; i3++) {
            n.a aVar = (n.a) this.f4607a.get(i3);
            Fragment fragment = aVar.f4626b;
            if (fragment != null) {
                fragment.k1(this.f4612f, this.f4613g);
            }
            switch (aVar.f4625a) {
                case 1:
                    fragment.j1(aVar.f4627c);
                    this.f4467s.l(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4625a);
                case 3:
                    fragment.j1(aVar.f4628d);
                    this.f4467s.Y0(fragment);
                    break;
                case 4:
                    fragment.j1(aVar.f4628d);
                    this.f4467s.C0(fragment);
                    break;
                case 5:
                    fragment.j1(aVar.f4627c);
                    this.f4467s.l1(fragment);
                    break;
                case 6:
                    fragment.j1(aVar.f4628d);
                    this.f4467s.x(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f4627c);
                    this.f4467s.q(fragment);
                    break;
                case 8:
                    this.f4467s.k1(fragment);
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    this.f4467s.k1(null);
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    this.f4467s.j1(fragment, aVar.f4632h);
                    break;
            }
            if (!this.f4623q && aVar.f4625a != 1 && fragment != null) {
                this.f4467s.O0(fragment);
            }
        }
        if (this.f4623q) {
            return;
        }
        j jVar = this.f4467s;
        jVar.P0(jVar.f4545u, true);
    }

    void m(boolean z2) {
        for (int size = this.f4607a.size() - 1; size >= 0; size--) {
            n.a aVar = (n.a) this.f4607a.get(size);
            Fragment fragment = aVar.f4626b;
            if (fragment != null) {
                fragment.k1(j.d1(this.f4612f), this.f4613g);
            }
            switch (aVar.f4625a) {
                case 1:
                    fragment.j1(aVar.f4630f);
                    this.f4467s.Y0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4625a);
                case 3:
                    fragment.j1(aVar.f4629e);
                    this.f4467s.l(fragment, false);
                    break;
                case 4:
                    fragment.j1(aVar.f4629e);
                    this.f4467s.l1(fragment);
                    break;
                case 5:
                    fragment.j1(aVar.f4630f);
                    this.f4467s.C0(fragment);
                    break;
                case 6:
                    fragment.j1(aVar.f4629e);
                    this.f4467s.q(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f4630f);
                    this.f4467s.x(fragment);
                    break;
                case 8:
                    this.f4467s.k1(null);
                    break;
                case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    this.f4467s.k1(fragment);
                    break;
                case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    this.f4467s.j1(fragment, aVar.f4631g);
                    break;
            }
            if (!this.f4623q && aVar.f4625a != 3 && fragment != null) {
                this.f4467s.O0(fragment);
            }
        }
        if (this.f4623q || !z2) {
            return;
        }
        j jVar = this.f4467s;
        jVar.P0(jVar.f4545u, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment n(java.util.ArrayList r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f4607a
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList r5 = r0.f4607a
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.n$a r5 = (androidx.fragment.app.n.a) r5
            int r6 = r5.f4625a
            r7 = 1
            if (r6 == r7) goto Lb2
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L58
            if (r6 == r10) goto L41
            r8 = 6
            if (r6 == r8) goto L41
            r8 = 7
            if (r6 == r8) goto Lb2
            r8 = 8
            if (r6 == r8) goto L31
            goto Lb7
        L31:
            java.util.ArrayList r6 = r0.f4607a
            androidx.fragment.app.n$a r8 = new androidx.fragment.app.n$a
            r8.<init>(r11, r3)
            r6.add(r4, r8)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f4626b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f4626b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f4626b
            if (r5 != r3) goto Lb7
            java.util.ArrayList r3 = r0.f4607a
            androidx.fragment.app.n$a r6 = new androidx.fragment.app.n$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f4626b
            int r8 = r6.f4398B
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.f4398B
            if (r15 != r8) goto L9f
            if (r14 != r6) goto L72
            r13 = r7
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList r3 = r0.f4607a
            androidx.fragment.app.n$a r15 = new androidx.fragment.app.n$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L81:
            androidx.fragment.app.n$a r15 = new androidx.fragment.app.n$a
            r15.<init>(r10, r14)
            int r2 = r5.f4627c
            r15.f4627c = r2
            int r2 = r5.f4629e
            r15.f4629e = r2
            int r2 = r5.f4628d
            r15.f4628d = r2
            int r2 = r5.f4630f
            r15.f4630f = r2
            java.util.ArrayList r2 = r0.f4607a
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList r2 = r0.f4607a
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f4625a = r7
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f4626b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r7
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.n(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String o() {
        return this.f4616j;
    }

    boolean p(int i3) {
        int size = this.f4607a.size();
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = ((n.a) this.f4607a.get(i4)).f4626b;
            int i5 = fragment != null ? fragment.f4398B : 0;
            if (i5 != 0 && i5 == i3) {
                return true;
            }
        }
        return false;
    }

    boolean q(ArrayList arrayList, int i3, int i4) {
        if (i4 == i3) {
            return false;
        }
        int size = this.f4607a.size();
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            Fragment fragment = ((n.a) this.f4607a.get(i6)).f4626b;
            int i7 = fragment != null ? fragment.f4398B : 0;
            if (i7 != 0 && i7 != i5) {
                for (int i8 = i3; i8 < i4; i8++) {
                    a aVar = (a) arrayList.get(i8);
                    int size2 = aVar.f4607a.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        Fragment fragment2 = ((n.a) aVar.f4607a.get(i9)).f4626b;
                        if ((fragment2 != null ? fragment2.f4398B : 0) == i7) {
                            return true;
                        }
                    }
                }
                i5 = i7;
            }
        }
        return false;
    }

    boolean s() {
        for (int i3 = 0; i3 < this.f4607a.size(); i3++) {
            if (r((n.a) this.f4607a.get(i3))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (this.f4624r != null) {
            for (int i3 = 0; i3 < this.f4624r.size(); i3++) {
                ((Runnable) this.f4624r.get(i3)).run();
            }
            this.f4624r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4469u >= 0) {
            sb.append(" #");
            sb.append(this.f4469u);
        }
        if (this.f4616j != null) {
            sb.append(" ");
            sb.append(this.f4616j);
        }
        sb.append("}");
        return sb.toString();
    }

    void u(Fragment.f fVar) {
        for (int i3 = 0; i3 < this.f4607a.size(); i3++) {
            n.a aVar = (n.a) this.f4607a.get(i3);
            if (r(aVar)) {
                aVar.f4626b.l1(fVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment v(java.util.ArrayList r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f4607a
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f4607a
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.n$a r2 = (androidx.fragment.app.n.a) r2
            int r3 = r2.f4625a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.e$b r3 = r2.f4631g
            r2.f4632h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f4626b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f4626b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f4626b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.v(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }
}
