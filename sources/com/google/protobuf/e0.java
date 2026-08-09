package com.google.protobuf;

import com.google.protobuf.C;

/* JADX INFO: loaded from: classes.dex */
public enum e0 implements C.a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C.b f6757d = new C.b() { // from class: com.google.protobuf.e0.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6759a;

    e0(int i3) {
        this.f6759a = i3;
    }

    @Override // com.google.protobuf.C.a
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f6759a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
