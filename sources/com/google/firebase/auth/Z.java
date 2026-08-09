package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Task;
import q0.C1157p;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    public static Task a(L l3) {
        AbstractC0643s.k(l3);
        C1157p c1157p = (C1157p) l3;
        return FirebaseAuth.getInstance(c1157p.s().O()).a0(c1157p);
    }

    public static Y b(InterfaceC0668b0 interfaceC0668b0, String str) {
        return new Y((String) AbstractC0643s.k(str), (InterfaceC0668b0) AbstractC0643s.k(interfaceC0668b0), null);
    }

    public static Y c(String str, String str2) {
        return new Y((String) AbstractC0643s.k(str2), null, (String) AbstractC0643s.k(str));
    }
}
