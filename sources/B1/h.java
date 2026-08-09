package B1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f685b = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f686c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f687d = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f688a;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    class b implements PrivilegedExceptionAction {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    class c implements PrivilegedExceptionAction {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    private static class d extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final B1.g f689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final B1.g f690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Method f691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Method f692h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final B1.g f693i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final B1.g f694j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final EnumC0004h f695k;

        public d(B1.g gVar, B1.g gVar2, Method method, Method method2, B1.g gVar3, B1.g gVar4, Provider provider, EnumC0004h enumC0004h) {
            super(provider);
            this.f689e = gVar;
            this.f690f = gVar2;
            this.f691g = method;
            this.f692h = method2;
            this.f693i = gVar3;
            this.f694j = gVar4;
            this.f695k = enumC0004h;
        }

        @Override // B1.h
        public void c(SSLSocket sSLSocket, String str, List list) {
            if (str != null) {
                this.f689e.e(sSLSocket, Boolean.TRUE);
                this.f690f.e(sSLSocket, str);
            }
            if (this.f694j.g(sSLSocket)) {
                this.f694j.f(sSLSocket, h.b(list));
            }
        }

        @Override // B1.h
        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f693i.g(sSLSocket) && (bArr = (byte[]) this.f693i.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.f727b);
            }
            return null;
        }

        @Override // B1.h
        public EnumC0004h i() {
            return this.f695k;
        }
    }

    private static class e extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Method f696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Method f697f;

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f696e = method;
            this.f697f = method2;
        }

        @Override // B1.h
        public void c(SSLSocket sSLSocket, String str, List list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f696e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // B1.h
        public String h(SSLSocket sSLSocket) {
            try {
                return (String) this.f697f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // B1.h
        public EnumC0004h i() {
            return EnumC0004h.ALPN_AND_NPN;
        }

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }
    }

    private static class f extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Method f698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Method f699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Method f700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class f701h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Class f702i;

        public f(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
            super(provider);
            this.f698e = method;
            this.f699f = method2;
            this.f700g = method3;
            this.f701h = cls;
            this.f702i = cls2;
        }

        @Override // B1.h
        public void a(SSLSocket sSLSocket) {
            try {
                this.f700g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e3) {
                h.f685b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e3);
            }
        }

        @Override // B1.h
        public void c(SSLSocket sSLSocket, String str, List list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = (i) list.get(i3);
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f698e.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f701h, this.f702i}, new g(arrayList)));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // B1.h
        public String h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f699f.invoke(null, sSLSocket));
                if (!gVar.f704b && gVar.f705c == null) {
                    h.f685b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.f704b) {
                    return null;
                }
                return gVar.f705c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // B1.h
        public EnumC0004h i() {
            return EnumC0004h.ALPN_AND_NPN;
        }
    }

    private static class g implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f705c;

        public g(List list) {
            this.f703a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f726a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f704b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f703a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof List) {
                    List list = (List) obj3;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj2 = this.f703a.get(0);
                            break;
                        }
                        if (this.f703a.contains(list.get(i3))) {
                            obj2 = list.get(i3);
                            break;
                        }
                        i3++;
                    }
                    String str = (String) obj2;
                    this.f705c = str;
                    return str;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f705c = (String) objArr[0];
            return null;
        }
    }

    /* JADX INFO: renamed from: B1.h$h, reason: collision with other inner class name */
    public enum EnumC0004h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public h(Provider provider) {
        this.f688a = provider;
    }

    public static byte[] b(List list) {
        m2.d dVar = new m2.d();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = (i) list.get(i3);
            if (iVar != i.HTTP_1_0) {
                dVar.v(iVar.toString().length());
                dVar.O(iVar.toString());
            }
        }
        return dVar.P();
    }

    private static h d() throws NoSuchMethodException {
        Method method;
        Method method2;
        Class<?> cls;
        Provider providerF = f();
        a aVar = null;
        if (providerF != null) {
            B1.g gVar = new B1.g(null, "setUseSessionTickets", Boolean.TYPE);
            B1.g gVar2 = new B1.g(null, "setHostname", String.class);
            B1.g gVar3 = new B1.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            B1.g gVar4 = new B1.g(null, "setAlpnProtocols", byte[].class);
            try {
                cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method = null;
            }
            try {
                method2 = cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = null;
            }
            return new d(gVar, gVar2, method, method2, gVar3, gVar4, providerF, (providerF.getName().equals("GmsCore_OpenSSL") || providerF.getName().equals("Conscrypt") || providerF.getName().equals("Ssl_Guard") || k()) ? EnumC0004h.ALPN_AND_NPN : j() ? EnumC0004h.NPN : EnumC0004h.NONE);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                sSLContext.init(null, null, null);
                ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), aVar);
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    return new h(provider);
                }
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static h e() {
        return f687d;
    }

    private static Provider f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f686c) {
                if (str.equals(provider.getClass().getName())) {
                    f685b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f685b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean j() {
        try {
            h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e3) {
            f685b.log(Level.FINE, "Can't find class", (Throwable) e3);
            return false;
        }
    }

    private static boolean k() {
        try {
            h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e3) {
            f685b.log(Level.FINE, "Can't find class", (Throwable) e3);
            return false;
        }
    }

    public Provider g() {
        return this.f688a;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public EnumC0004h i() {
        return EnumC0004h.NONE;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
