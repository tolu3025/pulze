package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.L;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public class F implements L.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k1.i f7554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L.b f7555b = new L.b();

    public F(k1.i iVar) {
        this.f7554a = iVar;
    }

    @Override // io.flutter.embedding.android.L.d
    public void a(KeyEvent keyEvent, final L.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f7554a.e(new i.b(keyEvent, this.f7555b.a(keyEvent.getUnicodeChar())), action != 0, new i.a() { // from class: io.flutter.embedding.android.E
                @Override // k1.i.a
                public final void a(boolean z2) {
                    aVar.a(z2);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
