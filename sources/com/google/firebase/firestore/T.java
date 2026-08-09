package com.google.firebase.firestore;

import J0.AbstractC0386b;
import android.util.SparseArray;
import k0.C0999m;

/* JADX INFO: loaded from: classes.dex */
public class T extends C0999m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6256a;

    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final SparseArray f6274x = e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6276a;

        a(int i3) {
            this.f6276a = i3;
        }

        private static SparseArray e() {
            SparseArray sparseArray = new SparseArray();
            for (a aVar : values()) {
                a aVar2 = (a) sparseArray.get(aVar.h());
                if (aVar2 != null) {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
                sparseArray.put(aVar.h(), aVar);
            }
            return sparseArray;
        }

        public static a g(int i3) {
            return (a) f6274x.get(i3, UNKNOWN);
        }

        public int h() {
            return this.f6276a;
        }
    }

    public T(String str, a aVar) {
        super(str);
        J0.C.c(str, "Provided message must not be null.");
        AbstractC0386b.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f6256a = (a) J0.C.c(aVar, "Provided code must not be null.");
    }

    public a a() {
        return this.f6256a;
    }

    public T(String str, a aVar, Throwable th) {
        super(str, th);
        J0.C.c(str, "Provided message must not be null.");
        AbstractC0386b.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f6256a = (a) J0.C.c(aVar, "Provided code must not be null.");
    }
}
