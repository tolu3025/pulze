package com.google.firebase.firestore;

import A0.C0215m;
import J0.AbstractC0386b;
import com.google.firebase.firestore.C0731i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class K0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6227a;

        static {
            int[] iArr = new int[C0215m.a.values().length];
            try {
                iArr[C0215m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C0215m.a.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C0215m.a.MODIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C0215m.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6227a = iArr;
        }
    }

    public static final List a(EnumC0736k0 metadataChanges, A0.E0 snapshot, U1.r fromDocument) {
        int iO;
        int iO2;
        kotlin.jvm.internal.m.e(metadataChanges, "metadataChanges");
        kotlin.jvm.internal.m.e(snapshot, "snapshot");
        kotlin.jvm.internal.m.e(fromDocument, "fromDocument");
        ArrayList arrayList = new ArrayList();
        if (snapshot.g().isEmpty()) {
            D0.i iVar = null;
            int i3 = 0;
            for (C0215m c0215m : snapshot.d()) {
                D0.i iVarB = c0215m.b();
                AbstractC0386b.d(c0215m.c() == C0215m.a.ADDED, "Invalid added event for first snapshot", new Object[0]);
                AbstractC0386b.d(iVar == null || snapshot.h().a().compare(iVar, iVarB) < 0, "Got added events in wrong order", new Object[0]);
                kotlin.jvm.internal.m.b(iVarB);
                arrayList.add(fromDocument.h(iVarB, C0731i.a.ADDED, -1, Integer.valueOf(i3)));
                iVar = iVarB;
                i3++;
            }
        } else {
            D0.n nVarG = snapshot.g();
            for (C0215m c0215m2 : snapshot.d()) {
                if (metadataChanges != EnumC0736k0.EXCLUDE || c0215m2.c() != C0215m.a.METADATA) {
                    D0.i iVarB2 = c0215m2.b();
                    kotlin.jvm.internal.m.b(c0215m2);
                    C0731i.a aVarB = b(c0215m2);
                    if (aVarB != C0731i.a.ADDED) {
                        iO = nVarG.o(iVarB2.getKey());
                        AbstractC0386b.d(iO >= 0, "Index for document not found", new Object[0]);
                        nVarG = nVarG.q(iVarB2.getKey());
                    } else {
                        iO = -1;
                    }
                    if (aVarB != C0731i.a.REMOVED) {
                        nVarG = nVarG.b(iVarB2);
                        iO2 = nVarG.o(iVarB2.getKey());
                        AbstractC0386b.d(iO2 >= 0, "Index for document not found", new Object[0]);
                    } else {
                        iO2 = -1;
                    }
                    kotlin.jvm.internal.m.b(iVarB2);
                    arrayList.add(fromDocument.h(iVarB2, aVarB, Integer.valueOf(iO), Integer.valueOf(iO2)));
                }
            }
        }
        return arrayList;
    }

    private static final C0731i.a b(C0215m c0215m) {
        C0215m.a aVarC = c0215m.c();
        int i3 = aVarC == null ? -1 : a.f6227a[aVarC.ordinal()];
        if (i3 == 1) {
            return C0731i.a.ADDED;
        }
        if (i3 == 2 || i3 == 3) {
            return C0731i.a.MODIFIED;
        }
        if (i3 == 4) {
            return C0731i.a.REMOVED;
        }
        throw new IllegalArgumentException("Unknown view change type: " + c0215m.c());
    }
}
