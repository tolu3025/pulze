package io.flutter.embedding.android;

import android.view.KeyEvent;
import b1.AbstractC0525b;
import io.flutter.embedding.android.G;
import io.flutter.embedding.android.L;
import io.flutter.embedding.android.M;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l1.InterfaceC1017c;

/* JADX INFO: loaded from: classes.dex */
public class K implements L.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1017c f7583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f7584b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f7585c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L.b f7586d = new L.b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7587a;

        static {
            int[] iArr = new int[G.b.values().length];
            f7587a = iArr;
            try {
                iArr[G.b.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7587a[G.b.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7587a[G.b.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public K(InterfaceC1017c interfaceC1017c) {
        this.f7583a = interfaceC1017c;
        for (M.e eVar : M.a()) {
            this.f7585c.put(Long.valueOf(eVar.f7607c), eVar);
        }
    }

    private static G.b e(KeyEvent keyEvent) {
        boolean z2 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z2 ? G.b.kRepeat : G.b.kDown;
        }
        if (action == 1) {
            return G.b.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long f(KeyEvent keyEvent) {
        Long l3 = (Long) M.f7599b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l3 != null ? l3 : Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
    }

    private Long g(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l3 = (Long) M.f7598a.get(Long.valueOf(scanCode2));
            if (l3 != null) {
                return l3;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(j(scanCode, 73014444032L));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144 A[LOOP:2: B:69:0x013e->B:71:0x0144, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean i(android.view.KeyEvent r18, io.flutter.embedding.android.L.d.a r19) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.K.i(android.view.KeyEvent, io.flutter.embedding.android.L$d$a):boolean");
    }

    private static long j(long j3, long j4) {
        return (j3 & 4294967295L) | j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(L.d.a aVar, ByteBuffer byteBuffer) {
        Boolean boolValueOf = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            AbstractC0525b.g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        aVar.a(boolValueOf.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(M.c cVar, long j3, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f7602b), Long.valueOf(j3), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(M.c cVar, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f7602b), Long.valueOf(cVar.f7601a), keyEvent.getEventTime());
    }

    private void n(G g3, final L.d.a aVar) {
        this.f7583a.c("flutter/keydata", g3.a(), aVar == null ? null : new InterfaceC1017c.b() { // from class: io.flutter.embedding.android.H
            @Override // l1.InterfaceC1017c.b
            public final void a(ByteBuffer byteBuffer) {
                K.k(aVar, byteBuffer);
            }
        });
    }

    private void q(boolean z2, Long l3, Long l4, long j3) {
        G g3 = new G();
        g3.f7556a = j3;
        g3.f7557b = z2 ? G.b.kDown : G.b.kUp;
        g3.f7559d = l3.longValue();
        g3.f7558c = l4.longValue();
        g3.f7562g = null;
        g3.f7560e = true;
        g3.f7561f = G.a.kKeyboard;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z2) {
                l3 = null;
            }
            r(l4, l3);
        }
        n(g3, null);
    }

    @Override // io.flutter.embedding.android.L.d
    public void a(KeyEvent keyEvent, L.d.a aVar) {
        if (i(keyEvent, aVar)) {
            return;
        }
        q(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    public Map h() {
        return Collections.unmodifiableMap(this.f7584b);
    }

    void o(M.d dVar, boolean z2, long j3, final long j4, final KeyEvent keyEvent, ArrayList arrayList) {
        M.c[] cVarArr = dVar.f7604b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            M.c[] cVarArr2 = dVar.f7604b;
            boolean z4 = true;
            if (i3 >= cVarArr2.length) {
                break;
            }
            final M.c cVar = cVarArr2[i3];
            boolean zContainsKey = this.f7584b.containsKey(Long.valueOf(cVar.f7601a));
            zArr[i3] = zContainsKey;
            if (cVar.f7602b == j3) {
                int i4 = a.f7587a[e(keyEvent).ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    } else if (i4 == 3) {
                        if (!z2) {
                            arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.J
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f7580a.m(cVar, keyEvent);
                                }
                            });
                        }
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    }
                    i3++;
                } else {
                    boolArr[i3] = Boolean.FALSE;
                    if (!z2) {
                        arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.I
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f7576a.l(cVar, j4, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z3 && !zContainsKey) {
                z4 = false;
            }
            z3 = z4;
            i3++;
        }
        if (z2) {
            for (int i5 = 0; i5 < dVar.f7604b.length; i5++) {
                if (boolArr[i5] == null) {
                    if (z3) {
                        boolArr[i5] = Boolean.valueOf(zArr[i5]);
                    } else {
                        boolArr[i5] = Boolean.TRUE;
                        z3 = true;
                    }
                }
            }
            if (!z3) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i6 = 0; i6 < dVar.f7604b.length; i6++) {
                if (boolArr[i6] == null) {
                    boolArr[i6] = Boolean.FALSE;
                }
            }
        }
        for (int i7 = 0; i7 < dVar.f7604b.length; i7++) {
            if (zArr[i7] != boolArr[i7].booleanValue()) {
                M.c cVar2 = dVar.f7604b[i7];
                q(boolArr[i7].booleanValue(), Long.valueOf(cVar2.f7602b), Long.valueOf(cVar2.f7601a), keyEvent.getEventTime());
            }
        }
    }

    void p(M.e eVar, boolean z2, long j3, KeyEvent keyEvent) {
        if (eVar.f7607c == j3 || eVar.f7608d == z2) {
            return;
        }
        boolean zContainsKey = this.f7584b.containsKey(Long.valueOf(eVar.f7606b));
        boolean z3 = !zContainsKey;
        if (z3) {
            eVar.f7608d = !eVar.f7608d;
        }
        q(z3, Long.valueOf(eVar.f7607c), Long.valueOf(eVar.f7606b), keyEvent.getEventTime());
        if (!z3) {
            eVar.f7608d = !eVar.f7608d;
        }
        q(zContainsKey, Long.valueOf(eVar.f7607c), Long.valueOf(eVar.f7606b), keyEvent.getEventTime());
    }

    void r(Long l3, Long l4) {
        if (l4 != null) {
            if (((Long) this.f7584b.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) this.f7584b.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
