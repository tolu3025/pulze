package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
abstract class F {
    static void a(Buffer buffer, int i3) {
        buffer.limit(i3);
    }

    static void b(Buffer buffer, int i3) {
        buffer.position(i3);
    }
}
