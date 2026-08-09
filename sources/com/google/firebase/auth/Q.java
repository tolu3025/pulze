package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0643s;
import k0.C0999m;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    public static class a extends N.a {
        public static final Parcelable.Creator<a> CREATOR = new C0();

        a() {
        }

        public static a s() {
            return new a();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            N.c.b(parcel, N.c.a(parcel));
        }
    }

    public static abstract class b {
        private static final P.a zza = new P.a("PhoneAuthProvider", new String[0]);

        public abstract void onCodeAutoRetrievalTimeOut(String str);

        public abstract void onCodeSent(String str, a aVar);

        public abstract void onVerificationCompleted(O o2);

        public abstract void onVerificationFailed(C0999m c0999m);
    }

    public static O a(String str, String str2) {
        return O.w(str, str2);
    }

    public static void b(P p2) {
        AbstractC0643s.k(p2);
        FirebaseAuth.j0(p2);
    }
}
