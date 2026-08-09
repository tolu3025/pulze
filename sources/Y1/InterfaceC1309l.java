package y1;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: y1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1309l extends InterfaceC1311n, InterfaceC1317u {

    /* JADX INFO: renamed from: y1.l$a */
    public static final class a implements InterfaceC1309l {
        @Override // y1.InterfaceC1311n, y1.InterfaceC1317u
        public String a() {
            return "gzip";
        }

        @Override // y1.InterfaceC1317u
        public InputStream b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // y1.InterfaceC1311n
        public OutputStream c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* JADX INFO: renamed from: y1.l$b */
    public static final class b implements InterfaceC1309l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterfaceC1309l f11958a = new b();

        private b() {
        }

        @Override // y1.InterfaceC1311n, y1.InterfaceC1317u
        public String a() {
            return "identity";
        }

        @Override // y1.InterfaceC1317u
        public InputStream b(InputStream inputStream) {
            return inputStream;
        }

        @Override // y1.InterfaceC1311n
        public OutputStream c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
