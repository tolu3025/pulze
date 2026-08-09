package q1;

import com.google.firebase.firestore.T;

/* JADX INFO: renamed from: q1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1169a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10949b;

    /* JADX INFO: renamed from: q1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0163a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10950a;

        static {
            int[] iArr = new int[T.a.values().length];
            f10950a = iArr;
            try {
                iArr[T.a.ABORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10950a[T.a.ALREADY_EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10950a[T.a.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10950a[T.a.DATA_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10950a[T.a.DEADLINE_EXCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10950a[T.a.FAILED_PRECONDITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10950a[T.a.INTERNAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10950a[T.a.INVALID_ARGUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10950a[T.a.NOT_FOUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10950a[T.a.OUT_OF_RANGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10950a[T.a.PERMISSION_DENIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10950a[T.a.RESOURCE_EXHAUSTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10950a[T.a.UNAUTHENTICATED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10950a[T.a.UNAVAILABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10950a[T.a.UNIMPLEMENTED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10950a[T.a.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1169a(com.google.firebase.firestore.T r27, java.lang.Throwable r28) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C1169a.<init>(com.google.firebase.firestore.T, java.lang.Throwable):void");
    }

    public String a() {
        return this.f10948a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f10949b;
    }
}
