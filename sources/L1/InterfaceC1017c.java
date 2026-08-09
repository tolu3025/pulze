package l1;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1017c {

    /* JADX INFO: renamed from: l1.c$a */
    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    /* JADX INFO: renamed from: l1.c$b */
    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* JADX INFO: renamed from: l1.c$c, reason: collision with other inner class name */
    public interface InterfaceC0146c {
    }

    /* JADX INFO: renamed from: l1.c$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9764a = true;

        public boolean a() {
            return this.f9764a;
        }
    }

    InterfaceC0146c a(d dVar);

    void b(String str, a aVar);

    void c(String str, ByteBuffer byteBuffer, b bVar);

    InterfaceC0146c d();

    void e(String str, ByteBuffer byteBuffer);

    void h(String str, a aVar, InterfaceC0146c interfaceC0146c);
}
