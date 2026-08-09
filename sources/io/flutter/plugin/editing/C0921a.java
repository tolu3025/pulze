package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: renamed from: io.flutter.plugin.editing.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0921a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f7827a;

    public C0921a(FlutterJNI flutterJNI) {
        this.f7827a = flutterJNI;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0133 A[PHI: r2 r4
      0x0133: PHI (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:58:0x00b9, B:80:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0133: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:58:0x00b9, B:80:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.CharSequence r10, int r11) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C0921a.a(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0141 A[PHI: r2 r4
      0x0141: PHI (r2v6 int) = (r2v3 int), (r2v8 int) binds: [B:79:0x010f, B:81:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:79:0x010f, B:81:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C0921a.b(java.lang.CharSequence, int):int");
    }

    public boolean c(int i3) {
        return this.f7827a.isCodePointEmoji(i3);
    }

    public boolean d(int i3) {
        return this.f7827a.isCodePointEmojiModifier(i3);
    }

    public boolean e(int i3) {
        return this.f7827a.isCodePointEmojiModifierBase(i3);
    }

    public boolean f(int i3) {
        return (48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42;
    }

    public boolean g(int i3) {
        return this.f7827a.isCodePointRegionalIndicator(i3);
    }

    public boolean h(int i3) {
        return 917536 <= i3 && i3 <= 917630;
    }

    public boolean i(int i3) {
        return this.f7827a.isCodePointVariantSelector(i3);
    }
}
