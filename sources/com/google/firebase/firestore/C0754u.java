package com.google.firebase.firestore;

import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.firestore.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0754u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseFirestore f6403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D0.l f6404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D0.i f6405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O0 f6406d;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.firebase.firestore.u$a, still in use, count: 1, list:
      (r0v0 com.google.firebase.firestore.u$a) from 0x0024: SPUT (r0v0 com.google.firebase.firestore.u$a) com.google.firebase.firestore.u.a.d com.google.firebase.firestore.u$a
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.google.firebase.firestore.u$a */
    public static final class a {
        NONE,
        ESTIMATE,
        PREVIOUS;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final a f6410d = new a();

        static {
        }

        private a() {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6411e.clone();
        }
    }

    C0754u(FirebaseFirestore firebaseFirestore, D0.l lVar, D0.i iVar, boolean z2, boolean z3) {
        this.f6403a = (FirebaseFirestore) J0.C.b(firebaseFirestore);
        this.f6404b = (D0.l) J0.C.b(lVar);
        this.f6405c = iVar;
        this.f6406d = new O0(z3, z2);
    }

    static C0754u b(FirebaseFirestore firebaseFirestore, D0.i iVar, boolean z2, boolean z3) {
        return new C0754u(firebaseFirestore, iVar.getKey(), iVar, z2, z3);
    }

    static C0754u c(FirebaseFirestore firebaseFirestore, D0.l lVar, boolean z2) {
        return new C0754u(firebaseFirestore, lVar, null, z2, false);
    }

    public boolean a() {
        return this.f6405c != null;
    }

    public Map d() {
        return e(a.f6410d);
    }

    public Map e(a aVar) {
        J0.C.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        W0 w02 = new W0(this.f6403a, aVar);
        D0.i iVar = this.f6405c;
        if (iVar == null) {
            return null;
        }
        return w02.b(iVar.b().k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0754u)) {
            return false;
        }
        C0754u c0754u = (C0754u) obj;
        if (this.f6403a.equals(c0754u.f6403a) && this.f6404b.equals(c0754u.f6404b) && this.f6406d.equals(c0754u.f6406d)) {
            D0.i iVar = this.f6405c;
            if (iVar == null) {
                if (c0754u.f6405c == null) {
                    return true;
                }
            } else if (c0754u.f6405c != null && iVar.b().equals(c0754u.f6405c.b())) {
                return true;
            }
        }
        return false;
    }

    public O0 f() {
        return this.f6406d;
    }

    public C0752t g() {
        return new C0752t(this.f6404b, this.f6403a);
    }

    public int hashCode() {
        int iHashCode = ((this.f6403a.hashCode() * 31) + this.f6404b.hashCode()) * 31;
        D0.i iVar = this.f6405c;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.getKey().hashCode() : 0)) * 31;
        D0.i iVar2 = this.f6405c;
        return ((iHashCode2 + (iVar2 != null ? iVar2.b().hashCode() : 0)) * 31) + this.f6406d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.f6404b + ", metadata=" + this.f6406d + ", doc=" + this.f6405c + '}';
    }
}
