package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f7556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f7557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f7558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f7559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f7560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    a f7561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f7562g;

    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f7569a;

        a(long j3) {
            this.f7569a = j3;
        }

        public long e() {
            return this.f7569a;
        }
    }

    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f7574a;

        b(long j3) {
            this.f7574a = j3;
        }

        public long e() {
            return this.f7574a;
        }
    }

    ByteBuffer a() {
        try {
            String str = this.f7562g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(this.f7556a);
            byteBufferAllocateDirect.putLong(this.f7557b.e());
            byteBufferAllocateDirect.putLong(this.f7558c);
            byteBufferAllocateDirect.putLong(this.f7559d);
            byteBufferAllocateDirect.putLong(this.f7560e ? 1L : 0L);
            byteBufferAllocateDirect.putLong(this.f7561f.e());
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            return byteBufferAllocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
