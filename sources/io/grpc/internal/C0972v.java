package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: renamed from: io.grpc.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0972v extends AbstractC0933b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f9347f = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final f f9348l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final f f9349m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final f f9350n = new d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final g f9351o = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f9352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Deque f9353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f9355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9356e;

    /* JADX INFO: renamed from: io.grpc.internal.v$a */
    class a implements f {
        a() {
        }

        @Override // io.grpc.internal.C0972v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(z0 z0Var, int i3, Void r3, int i4) {
            return z0Var.readUnsignedByte();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$b */
    class b implements f {
        b() {
        }

        @Override // io.grpc.internal.C0972v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(z0 z0Var, int i3, Void r3, int i4) {
            z0Var.skipBytes(i3);
            return 0;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$c */
    class c implements f {
        c() {
        }

        @Override // io.grpc.internal.C0972v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(z0 z0Var, int i3, byte[] bArr, int i4) {
            z0Var.S(bArr, i4, i3);
            return i4 + i3;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$d */
    class d implements f {
        d() {
        }

        @Override // io.grpc.internal.C0972v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(z0 z0Var, int i3, ByteBuffer byteBuffer, int i4) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i3);
            z0Var.N(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$e */
    class e implements g {
        e() {
        }

        @Override // io.grpc.internal.C0972v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(z0 z0Var, int i3, OutputStream outputStream, int i4) {
            z0Var.E(outputStream, i3);
            return 0;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$f */
    private interface f extends g {
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$g */
    private interface g {
        int a(z0 z0Var, int i3, Object obj, int i4);
    }

    public C0972v() {
        this.f9355d = new ArrayDeque(2);
        this.f9352a = new ArrayDeque();
    }

    private void l() {
        if (!this.f9356e) {
            ((z0) this.f9352a.remove()).close();
            return;
        }
        this.f9353b.add((z0) this.f9352a.remove());
        z0 z0Var = (z0) this.f9352a.peek();
        if (z0Var != null) {
            z0Var.i();
        }
    }

    private void q() {
        if (((z0) this.f9352a.peek()).a() == 0) {
            l();
        }
    }

    private void r(z0 z0Var) {
        if (!(z0Var instanceof C0972v)) {
            this.f9352a.add(z0Var);
            this.f9354c += z0Var.a();
            return;
        }
        C0972v c0972v = (C0972v) z0Var;
        while (!c0972v.f9352a.isEmpty()) {
            this.f9352a.add((z0) c0972v.f9352a.remove());
        }
        this.f9354c += c0972v.f9354c;
        c0972v.f9354c = 0;
        c0972v.close();
    }

    private int u(g gVar, int i3, Object obj, int i4) {
        b(i3);
        if (this.f9352a.isEmpty()) {
            q();
            while (i3 > 0 && !this.f9352a.isEmpty()) {
                z0 z0Var = (z0) this.f9352a.peek();
                int iMin = Math.min(i3, z0Var.a());
                i4 = gVar.a(z0Var, iMin, obj, i4);
                i3 -= iMin;
                this.f9354c -= iMin;
            }
            if (i3 <= 0) {
                return i4;
            }
            throw new AssertionError("Failed executing read operation");
        }
        q();
    }

    private int z(f fVar, int i3, Object obj, int i4) {
        try {
            return u(fVar, i3, obj, i4);
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // io.grpc.internal.z0
    public void E(OutputStream outputStream, int i3) {
        u(f9351o, i3, outputStream, 0);
    }

    @Override // io.grpc.internal.z0
    public void N(ByteBuffer byteBuffer) {
        z(f9350n, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.z0
    public void S(byte[] bArr, int i3, int i4) {
        z(f9349m, i4, bArr, i3);
    }

    @Override // io.grpc.internal.z0
    public int a() {
        return this.f9354c;
    }

    @Override // io.grpc.internal.AbstractC0933b, io.grpc.internal.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f9352a.isEmpty()) {
            ((z0) this.f9352a.remove()).close();
        }
        if (this.f9353b != null) {
            while (!this.f9353b.isEmpty()) {
                ((z0) this.f9353b.remove()).close();
            }
        }
    }

    public void f(z0 z0Var) {
        boolean z2 = this.f9356e && this.f9352a.isEmpty();
        r(z0Var);
        if (z2) {
            ((z0) this.f9352a.peek()).i();
        }
    }

    @Override // io.grpc.internal.AbstractC0933b, io.grpc.internal.z0
    public void i() {
        if (this.f9353b == null) {
            this.f9353b = new ArrayDeque(Math.min(this.f9352a.size(), 16));
        }
        while (!this.f9353b.isEmpty()) {
            ((z0) this.f9353b.remove()).close();
        }
        this.f9356e = true;
        z0 z0Var = (z0) this.f9352a.peek();
        if (z0Var != null) {
            z0Var.i();
        }
    }

    @Override // io.grpc.internal.AbstractC0933b, io.grpc.internal.z0
    public boolean markSupported() {
        Iterator it = this.f9352a.iterator();
        while (it.hasNext()) {
            if (!((z0) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.grpc.internal.z0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.grpc.internal.z0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.grpc.internal.v] */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.grpc.internal.v] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // io.grpc.internal.z0
    public z0 p(int i3) {
        z0 z0VarP;
        int i4;
        z0 z0VarP2;
        ?? r12;
        ?? r02;
        if (i3 <= 0) {
            return A0.a();
        }
        b(i3);
        this.f9354c -= i3;
        ?? r03 = 0;
        ?? c0972v = 0;
        while (true) {
            z0 z0Var = (z0) this.f9352a.peek();
            int iA = z0Var.a();
            if (iA > i3) {
                z0VarP2 = z0Var.p(i3);
                i4 = 0;
            } else {
                if (this.f9356e) {
                    z0VarP = z0Var.p(iA);
                    l();
                } else {
                    z0VarP = (z0) this.f9352a.poll();
                }
                z0 z0Var2 = z0VarP;
                i4 = i3 - iA;
                z0VarP2 = z0Var2;
            }
            if (r03 == 0) {
                r02 = z0VarP2;
                r12 = c0972v;
            } else {
                if (c0972v == 0) {
                    c0972v = new C0972v(i4 != 0 ? Math.min(this.f9352a.size() + 2, 16) : 2);
                    c0972v.f(r03);
                    r03 = c0972v;
                }
                c0972v.f(z0VarP2);
                r02 = r03;
                r12 = c0972v;
            }
            if (i4 <= 0) {
                return r02;
            }
            i3 = i4;
            r03 = r02;
            c0972v = r12;
        }
    }

    @Override // io.grpc.internal.z0
    public int readUnsignedByte() {
        return z(f9347f, 1, null, 0);
    }

    @Override // io.grpc.internal.AbstractC0933b, io.grpc.internal.z0
    public void reset() {
        if (!this.f9356e) {
            throw new InvalidMarkException();
        }
        z0 z0Var = (z0) this.f9352a.peek();
        if (z0Var != null) {
            int iA = z0Var.a();
            z0Var.reset();
            this.f9354c += z0Var.a() - iA;
        }
        while (true) {
            z0 z0Var2 = (z0) this.f9353b.pollLast();
            if (z0Var2 == null) {
                return;
            }
            z0Var2.reset();
            this.f9352a.addFirst(z0Var2);
            this.f9354c += z0Var2.a();
        }
    }

    @Override // io.grpc.internal.z0
    public void skipBytes(int i3) {
        z(f9348l, i3, null, 0);
    }

    public C0972v(int i3) {
        this.f9355d = new ArrayDeque(2);
        this.f9352a = new ArrayDeque(i3);
    }
}
