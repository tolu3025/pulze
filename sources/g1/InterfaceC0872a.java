package g1;

import android.content.Context;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.l;
import io.flutter.view.TextureRegistry;
import l1.InterfaceC1017c;

/* JADX INFO: renamed from: g1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0872a {

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0127a {
    }

    /* JADX INFO: renamed from: g1.a$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f7337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.flutter.embedding.engine.a f7338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC1017c f7339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextureRegistry f7340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final l f7341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InterfaceC0127a f7342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final d f7343g;

        public b(Context context, io.flutter.embedding.engine.a aVar, InterfaceC1017c interfaceC1017c, TextureRegistry textureRegistry, l lVar, InterfaceC0127a interfaceC0127a, d dVar) {
            this.f7337a = context;
            this.f7338b = aVar;
            this.f7339c = interfaceC1017c;
            this.f7340d = textureRegistry;
            this.f7341e = lVar;
            this.f7342f = interfaceC0127a;
            this.f7343g = dVar;
        }

        public Context a() {
            return this.f7337a;
        }

        public InterfaceC1017c b() {
            return this.f7339c;
        }
    }

    void A(b bVar);

    void y(b bVar);
}
