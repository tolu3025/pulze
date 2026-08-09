package A1;

import B1.h;
import e0.AbstractC0829j;
import io.grpc.internal.S;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f501b = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final B1.h f502c = B1.h.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static k f503d = d(k.class.getClassLoader());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final B1.h f504a;

    static final class a extends k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final B1.g f505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final B1.g f506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final B1.g f507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final B1.g f508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final B1.g f509i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final B1.g f510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Method f511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Method f512l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Method f513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Method f514n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final Method f515o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final Method f516p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Constructor f517q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            f505e = new B1.g(null, "setUseSessionTickets", cls);
            f506f = new B1.g(null, "setHostname", String.class);
            f507g = new B1.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f508h = new B1.g(null, "setAlpnProtocols", byte[].class);
            f509i = new B1.g(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f510j = new B1.g(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method2 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    k.f501b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f513m = method;
                    f514n = method2;
                    f515o = method3;
                    f511k = method4;
                    f512l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f516p = method6;
                    f517q = constructor;
                } catch (NoSuchMethodException e4) {
                    e = e4;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    k.f501b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f513m = method;
                    f514n = method2;
                    f515o = method3;
                    f511k = method4;
                    f512l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f516p = method6;
                    f517q = constructor;
                }
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                    try {
                        Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                        } catch (ClassNotFoundException e5) {
                            e = e5;
                            k.f501b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                            method5 = null;
                        } catch (NoSuchMethodException e6) {
                            e = e6;
                            k.f501b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                            method5 = null;
                        }
                    } catch (ClassNotFoundException | NoSuchMethodException e7) {
                        e = e7;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    method3 = null;
                    method4 = method3;
                    k.f501b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f513m = method;
                    f514n = method2;
                    f515o = method3;
                    f511k = method4;
                    f512l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f516p = method6;
                    f517q = constructor;
                } catch (NoSuchMethodException e9) {
                    e = e9;
                    method3 = null;
                    method4 = method3;
                    k.f501b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f513m = method;
                    f514n = method2;
                    f515o = method3;
                    f511k = method4;
                    f512l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f516p = method6;
                    f517q = constructor;
                }
            } catch (ClassNotFoundException e10) {
                e = e10;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e11) {
                e = e11;
                method = null;
                method2 = null;
            }
            f513m = method;
            f514n = method2;
            f515o = method3;
            f511k = method4;
            f512l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            } catch (ClassNotFoundException | NoSuchMethodException e12) {
                e = e12;
                method6 = null;
            }
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e13) {
                e = e13;
                k.f501b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
            } catch (NoSuchMethodException e14) {
                e = e14;
                k.f501b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
            }
            f516p = method6;
            f517q = constructor;
        }

        a(B1.h hVar) {
            super(hVar);
        }

        @Override // A1.k
        protected void c(SSLSocket sSLSocket, String str, List list) {
            Constructor constructor;
            boolean z2;
            Method method;
            String[] strArrI = k.i(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (k.g(str)) {
                            Method method2 = f511k;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f505e.e(sSLSocket, Boolean.TRUE);
                            } else {
                                f512l.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f516p;
                            if (method3 == null || (constructor = f517q) == null) {
                                f506f.e(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InstantiationException e5) {
                    throw new RuntimeException(e5);
                }
            }
            Method method4 = f515o;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, new Object[0]);
                    f513m.invoke(sSLParameters, strArrI);
                    z2 = true;
                } catch (InvocationTargetException e6) {
                    if (!(e6.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e6;
                    }
                    k.f501b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z2 && (method = f514n) != null && Arrays.equals(strArrI, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
                return;
            }
            Object[] objArr = {B1.h.b(list)};
            if (this.f504a.i() == h.EnumC0004h.ALPN_AND_NPN) {
                f508h.f(sSLSocket, objArr);
            }
            if (this.f504a.i() == h.EnumC0004h.NONE) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            f510j.f(sSLSocket, objArr);
        }

        @Override // A1.k
        public String f(SSLSocket sSLSocket) {
            Method method = f515o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e4);
                    }
                    k.f501b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f504a.i() == h.EnumC0004h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f507g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, B1.l.f727b);
                    }
                } catch (Exception e5) {
                    k.f501b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e5);
                }
            }
            if (this.f504a.i() == h.EnumC0004h.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f509i.f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, B1.l.f727b);
                }
                return null;
            } catch (Exception e6) {
                k.f501b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e6);
                return null;
            }
        }

        @Override // A1.k
        public String h(SSLSocket sSLSocket, String str, List list) {
            String strF = f(sSLSocket);
            return strF == null ? super.h(sSLSocket, str, list) : strF;
        }
    }

    k(B1.h hVar) {
        this.f504a = (B1.h) AbstractC0829j.o(hVar, "platform");
    }

    static k d(ClassLoader classLoader) {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e3) {
            f501b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e3);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e4) {
                f501b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e4);
                return new k(f502c);
            }
        }
        return new a(f502c);
    }

    public static k e() {
        return f503d;
    }

    static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            S.c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((B1.i) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.f504a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.f504a.h(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strF = f(sSLSocket);
            if (strF != null) {
                return strF;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f504a.a(sSLSocket);
        }
    }
}
