package io.grpc.internal;

import e0.AbstractC0821b;
import e0.AbstractC0829j;
import io.grpc.internal.AbstractC0931a;
import java.nio.charset.Charset;
import y1.M;
import y1.Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends AbstractC0931a.c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final M.a f8728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Z.g f8729x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y1.l0 f8730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private y1.Z f8731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Charset f8732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8733v;

    class a implements M.a {
        a() {
        }

        @Override // y1.Z.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, y1.M.f11799a));
        }

        @Override // y1.Z.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f8728w = aVar;
        f8729x = y1.M.b(":status", aVar);
    }

    protected V(int i3, P0 p02, V0 v02) {
        super(i3, p02, v02);
        this.f8732u = AbstractC0821b.f7063c;
    }

    private static Charset O(y1.Z z2) {
        String str = (String) z2.g(S.f8660j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC0821b.f7063c;
    }

    private y1.l0 Q(y1.Z z2) {
        y1.l0 l0Var = (y1.l0) z2.g(y1.O.f11802b);
        if (l0Var != null) {
            return l0Var.q((String) z2.g(y1.O.f11801a));
        }
        if (this.f8733v) {
            return y1.l0.f11962g.q("missing GRPC status in response");
        }
        Integer num = (Integer) z2.g(f8729x);
        return (num != null ? S.m(num.intValue()) : y1.l0.f11974s.q("missing HTTP status code")).e("missing GRPC status, inferred error from HTTP status code");
    }

    private static void R(y1.Z z2) {
        z2.e(f8729x);
        z2.e(y1.O.f11802b);
        z2.e(y1.O.f11801a);
    }

    private y1.l0 V(y1.Z z2) {
        Integer num = (Integer) z2.g(f8729x);
        if (num == null) {
            return y1.l0.f11974s.q("Missing HTTP status code");
        }
        String str = (String) z2.g(S.f8660j);
        if (S.n(str)) {
            return null;
        }
        return S.m(num.intValue()).e("invalid content-type: " + str);
    }

    protected abstract void P(y1.l0 l0Var, boolean z2, y1.Z z3);

    protected void S(z0 z0Var, boolean z2) throws Throwable {
        y1.l0 l0Var = this.f8730s;
        if (l0Var != null) {
            this.f8730s = l0Var.e("DATA-----------------------------\n" + A0.e(z0Var, this.f8732u));
            z0Var.close();
            if (this.f8730s.n().length() > 1000 || z2) {
                P(this.f8730s, false, this.f8731t);
                return;
            }
            return;
        }
        if (!this.f8733v) {
            P(y1.l0.f11974s.q("headers not received before payload"), false, new y1.Z());
            return;
        }
        int iA = z0Var.a();
        D(z0Var);
        if (z2) {
            this.f8730s = y1.l0.f11974s.q(iA > 0 ? "Received unexpected EOS on non-empty DATA frame from server" : "Received unexpected EOS on empty DATA frame from server");
            y1.Z z3 = new y1.Z();
            this.f8731t = z3;
            N(this.f8730s, false, z3);
        }
    }

    /* JADX WARN: Finally extract failed */
    protected void T(y1.Z z2) {
        AbstractC0829j.o(z2, "headers");
        y1.l0 l0Var = this.f8730s;
        if (l0Var != null) {
            this.f8730s = l0Var.e("headers: " + z2);
            return;
        }
        try {
            if (this.f8733v) {
                y1.l0 l0VarQ = y1.l0.f11974s.q("Received headers twice");
                this.f8730s = l0VarQ;
                if (l0VarQ != null) {
                    this.f8730s = l0VarQ.e("headers: " + z2);
                    this.f8731t = z2;
                    this.f8732u = O(z2);
                    return;
                }
                return;
            }
            Integer num = (Integer) z2.g(f8729x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                y1.l0 l0Var2 = this.f8730s;
                if (l0Var2 != null) {
                    this.f8730s = l0Var2.e("headers: " + z2);
                    this.f8731t = z2;
                    this.f8732u = O(z2);
                    return;
                }
                return;
            }
            this.f8733v = true;
            y1.l0 l0VarV = V(z2);
            this.f8730s = l0VarV;
            if (l0VarV != null) {
                if (l0VarV != null) {
                    this.f8730s = l0VarV.e("headers: " + z2);
                    this.f8731t = z2;
                    this.f8732u = O(z2);
                    return;
                }
                return;
            }
            R(z2);
            E(z2);
            y1.l0 l0Var3 = this.f8730s;
            if (l0Var3 != null) {
                this.f8730s = l0Var3.e("headers: " + z2);
                this.f8731t = z2;
                this.f8732u = O(z2);
            }
        } catch (Throwable th) {
            y1.l0 l0Var4 = this.f8730s;
            if (l0Var4 != null) {
                this.f8730s = l0Var4.e("headers: " + z2);
                this.f8731t = z2;
                this.f8732u = O(z2);
            }
            throw th;
        }
    }

    protected void U(y1.Z z2) {
        AbstractC0829j.o(z2, "trailers");
        if (this.f8730s == null && !this.f8733v) {
            y1.l0 l0VarV = V(z2);
            this.f8730s = l0VarV;
            if (l0VarV != null) {
                this.f8731t = z2;
            }
        }
        y1.l0 l0Var = this.f8730s;
        if (l0Var == null) {
            y1.l0 l0VarQ = Q(z2);
            R(z2);
            F(z2, l0VarQ);
        } else {
            y1.l0 l0VarE = l0Var.e("trailers: " + z2);
            this.f8730s = l0VarE;
            P(l0VarE, false, this.f8731t);
        }
    }

    @Override // io.grpc.internal.AbstractC0931a.c, io.grpc.internal.C0956m0.b
    public /* bridge */ /* synthetic */ void e(boolean z2) {
        super.e(z2);
    }
}
