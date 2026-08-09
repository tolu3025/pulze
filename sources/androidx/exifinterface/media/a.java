package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import com.google.android.gms.common.api.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static SimpleDateFormat f4322U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static SimpleDateFormat f4323V;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final e[] f4327Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final e[] f4328a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final e[] f4329b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final e[] f4330c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final e[] f4331d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final e f4332e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final e[] f4333f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final e[] f4334g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final e[] f4335h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final e[] f4336i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final e[][] f4337j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final e[] f4338k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f4339l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashMap[] f4340m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashSet f4341n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final HashMap f4342o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final Charset f4343p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final byte[] f4344q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final byte[] f4345r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f4346s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f4347t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f4348u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f4350v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f4356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f4357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap[] f4360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f4361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f4362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f4368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f4369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f4370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f4371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f4373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f4375u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f4349v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f4351w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List f4352x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f4353y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f4354z = {4};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f4302A = {8};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final byte[] f4303B = {-1, -40, -1};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final byte[] f4304C = {102, 116, 121, 112};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final byte[] f4305D = {109, 105, 102, 49};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final byte[] f4306E = {104, 101, 105, 99};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final byte[] f4307F = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final byte[] f4308G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final byte[] f4309H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final byte[] f4310I = {101, 88, 73, 102};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final byte[] f4311J = {73, 72, 68, 82};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final byte[] f4312K = {73, 69, 78, 68};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final byte[] f4313L = {82, 73, 70, 70};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final byte[] f4314M = {87, 69, 66, 80};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final byte[] f4315N = {69, 88, 73, 70};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final byte[] f4316O = {-99, 1, 42};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final byte[] f4317P = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final byte[] f4318Q = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final byte[] f4319R = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final byte[] f4320S = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final byte[] f4321T = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    static final String[] f4324W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    static final int[] f4325X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    static final byte[] f4326Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C0088a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f4376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f4377b;

        C0088a(g gVar) {
            this.f4377b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j3, byte[] bArr, int i3, int i4) {
            if (i4 == 0) {
                return 0;
            }
            if (j3 < 0) {
                return -1;
            }
            try {
                long j4 = this.f4376a;
                if (j4 != j3) {
                    if (j4 >= 0 && j3 >= j4 + ((long) this.f4377b.available())) {
                        return -1;
                    }
                    this.f4377b.r(j3);
                    this.f4376a = j3;
                }
                if (i4 > this.f4377b.available()) {
                    i4 = this.f4377b.available();
                }
                int i5 = this.f4377b.read(bArr, i3, i4);
                if (i5 >= 0) {
                    this.f4376a += (long) i5;
                    return i5;
                }
            } catch (IOException unused) {
            }
            this.f4376a = -1L;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final DataInputStream f4379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f4380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f4381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f4382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4383e;

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4379a.available();
        }

        public int b() {
            return this.f4383e;
        }

        public int c() {
            return this.f4380b;
        }

        public long f() {
            return ((long) readInt()) & 4294967295L;
        }

        public void l(ByteOrder byteOrder) {
            this.f4381c = byteOrder;
        }

        @Override // java.io.InputStream
        public void mark(int i3) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public void q(int i3) throws IOException {
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i3 - i4;
                int iSkip = (int) this.f4379a.skip(i5);
                if (iSkip <= 0) {
                    if (this.f4382d == null) {
                        this.f4382d = new byte[8192];
                    }
                    iSkip = this.f4379a.read(this.f4382d, 0, Math.min(8192, i5));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i3 + " bytes.");
                    }
                }
                i4 += iSkip;
            }
            this.f4380b += i4;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f4380b++;
            return this.f4379a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f4380b++;
            return this.f4379a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f4380b++;
            int i3 = this.f4379a.read();
            if (i3 >= 0) {
                return (byte) i3;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f4380b += 2;
            return this.f4379a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f4380b += bArr.length;
            this.f4379a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f4380b += 4;
            int i3 = this.f4379a.read();
            int i4 = this.f4379a.read();
            int i5 = this.f4379a.read();
            int i6 = this.f4379a.read();
            if ((i3 | i4 | i5 | i6) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4381c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
            }
            throw new IOException("Invalid byte order: " + this.f4381c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f4380b += 8;
            int i3 = this.f4379a.read();
            int i4 = this.f4379a.read();
            int i5 = this.f4379a.read();
            int i6 = this.f4379a.read();
            int i7 = this.f4379a.read();
            int i8 = this.f4379a.read();
            int i9 = this.f4379a.read();
            int i10 = this.f4379a.read();
            if ((i3 | i4 | i5 | i6 | i7 | i8 | i9 | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4381c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i10) << 56) + (((long) i9) << 48) + (((long) i8) << 40) + (((long) i7) << 32) + (((long) i6) << 24) + (((long) i5) << 16) + (((long) i4) << 8) + ((long) i3);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i3) << 56) + (((long) i4) << 48) + (((long) i5) << 40) + (((long) i6) << 32) + (((long) i7) << 24) + (((long) i8) << 16) + (((long) i9) << 8) + ((long) i10);
            }
            throw new IOException("Invalid byte order: " + this.f4381c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f4380b += 2;
            int i3 = this.f4379a.read();
            int i4 = this.f4379a.read();
            if ((i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4381c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i4 << 8) + i3);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i3 << 8) + i4);
            }
            throw new IOException("Invalid byte order: " + this.f4381c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f4380b += 2;
            return this.f4379a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f4380b++;
            return this.f4379a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f4380b += 2;
            int i3 = this.f4379a.read();
            int i4 = this.f4379a.read();
            if ((i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4381c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i4 << 8) + i3;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i3 << 8) + i4;
            }
            throw new IOException("Invalid byte order: " + this.f4381c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i3) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4379a = dataInputStream;
            dataInputStream.mark(0);
            this.f4380b = 0;
            this.f4381c = byteOrder;
            this.f4383e = inputStream instanceof b ? ((b) inputStream).b() : -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i3, int i4) throws IOException {
            int i5 = this.f4379a.read(bArr, i3, i4);
            this.f4380b += i5;
            return i5;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i3, int i4) throws IOException {
            this.f4380b += i4;
            this.f4379a.readFully(bArr, i3, i4);
        }

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f4383e = bArr.length;
        }
    }

    private static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final OutputStream f4384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteOrder f4385b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f4384a = outputStream;
            this.f4385b = byteOrder;
        }

        public void b(ByteOrder byteOrder) {
            this.f4385b = byteOrder;
        }

        public void c(int i3) throws IOException {
            this.f4384a.write(i3);
        }

        public void f(int i3) throws IOException {
            OutputStream outputStream;
            ByteOrder byteOrder = this.f4385b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4384a.write(i3 & 255);
                this.f4384a.write((i3 >>> 8) & 255);
                this.f4384a.write((i3 >>> 16) & 255);
                outputStream = this.f4384a;
                i3 >>>= 24;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f4384a.write((i3 >>> 24) & 255);
                this.f4384a.write((i3 >>> 16) & 255);
                this.f4384a.write((i3 >>> 8) & 255);
                outputStream = this.f4384a;
            }
            outputStream.write(i3 & 255);
        }

        public void l(short s2) throws IOException {
            OutputStream outputStream;
            int i3;
            ByteOrder byteOrder = this.f4385b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f4384a.write(s2 & 255);
                outputStream = this.f4384a;
                i3 = s2 >>> 8;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f4384a.write((s2 >>> 8) & 255);
                outputStream = this.f4384a;
                i3 = s2;
            }
            outputStream.write(i3 & 255);
        }

        public void q(long j3) throws IOException {
            if (j3 > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            f((int) j3);
        }

        public void r(int i3) throws IOException {
            if (i3 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            l((short) i3);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f4384a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i3, int i4) throws IOException {
            this.f4384a.write(bArr, i3, i4);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f4389d;

        d(int i3, int i4, long j3, byte[] bArr) {
            this.f4386a = i3;
            this.f4387b = i4;
            this.f4388c = j3;
            this.f4389d = bArr;
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f4343p0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f4325X[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d3 : dArr) {
                byteBufferWrap.putDouble(d3);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f4325X[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i3 : iArr) {
                byteBufferWrap.putInt(i3);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f4325X[10] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f4394a);
                byteBufferWrap.putInt((int) fVar.f4395b);
            }
            return new d(10, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f4343p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j3, ByteOrder byteOrder) {
            return g(new long[]{j3}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f4325X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j3 : jArr) {
                byteBufferWrap.putInt((int) j3);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f4325X[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f4394a);
                byteBufferWrap.putInt((int) fVar.f4395b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d j(int i3, ByteOrder byteOrder) {
            return k(new int[]{i3}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f4325X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i3 : iArr) {
                byteBufferWrap.putShort((short) i3);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double l(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objO instanceof String) {
                return Double.parseDouble((String) objO);
            }
            if (objO instanceof long[]) {
                if (((long[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof int[]) {
                if (((int[]) objO).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objO;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objO instanceof String) {
                return Integer.parseInt((String) objO);
            }
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objO instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objO;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) throws Throwable {
            Object objO = o(byteOrder);
            if (objO == null) {
                return null;
            }
            if (objO instanceof String) {
                return (String) objO;
            }
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            if (objO instanceof long[]) {
                long[] jArr = (long[]) objO;
                while (i3 < jArr.length) {
                    sb.append(jArr[i3]);
                    i3++;
                    if (i3 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof int[]) {
                int[] iArr = (int[]) objO;
                while (i3 < iArr.length) {
                    sb.append(iArr[i3]);
                    i3++;
                    if (i3 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objO instanceof double[]) {
                double[] dArr = (double[]) objO;
                while (i3 < dArr.length) {
                    sb.append(dArr[i3]);
                    i3++;
                    if (i3 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objO instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objO;
            while (i3 < fVarArr.length) {
                sb.append(fVarArr[i3].f4394a);
                sb.append('/');
                sb.append(fVarArr[i3].f4395b);
                i3++;
                if (i3 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:18:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object o(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 446
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.f4325X[this.f4386a] * this.f4387b;
        }

        public String toString() {
            return "(" + a.f4324W[this.f4386a] + ", data length:" + this.f4389d.length + ")";
        }

        d(int i3, int i4, byte[] bArr) {
            this(i3, i4, -1L, bArr);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4393d;

        e(String str, int i3, int i4) {
            this.f4391b = str;
            this.f4390a = i3;
            this.f4392c = i4;
            this.f4393d = -1;
        }

        boolean a(int i3) {
            int i4;
            int i5 = this.f4392c;
            if (i5 == 7 || i3 == 7 || i5 == i3 || (i4 = this.f4393d) == i3) {
                return true;
            }
            if ((i5 == 4 || i4 == 4) && i3 == 3) {
                return true;
            }
            if ((i5 == 9 || i4 == 9) && i3 == 8) {
                return true;
            }
            return (i5 == 12 || i4 == 12) && i3 == 11;
        }

        e(String str, int i3, int i4, int i5) {
            this.f4391b = str;
            this.f4390a = i3;
            this.f4392c = i4;
            this.f4393d = i5;
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4395b;

        f(double d3) {
            this((long) (d3 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f4394a / this.f4395b;
        }

        public String toString() {
            return this.f4394a + "/" + this.f4395b;
        }

        f(long j3, long j4) {
            if (j4 == 0) {
                this.f4394a = 0L;
                this.f4395b = 1L;
            } else {
                this.f4394a = j3;
                this.f4395b = j4;
            }
        }
    }

    private static class g extends b {
        g(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f4379a.mark(a.e.API_PRIORITY_OTHER);
        }

        public void r(long j3) throws IOException {
            int i3 = this.f4380b;
            if (i3 > j3) {
                this.f4380b = 0;
                this.f4379a.reset();
            } else {
                j3 -= (long) i3;
            }
            q((int) j3);
        }

        g(byte[] bArr) {
            super(bArr);
            this.f4379a.mark(a.e.API_PRIORITY_OTHER);
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f4327Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4328a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f4329b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f4330c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f4331d0 = eVarArr5;
        f4332e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f4333f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f4334g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f4335h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f4336i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f4337j0 = eVarArr10;
        f4338k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f4339l0 = new HashMap[eVarArr10.length];
        f4340m0 = new HashMap[eVarArr10.length];
        f4341n0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f4342o0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f4343p0 = charsetForName;
        f4344q0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f4345r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f4322U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f4323V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            e[][] eVarArr11 = f4337j0;
            if (i3 >= eVarArr11.length) {
                HashMap map = f4342o0;
                e[] eVarArr12 = f4338k0;
                map.put(Integer.valueOf(eVarArr12[0].f4390a), 5);
                map.put(Integer.valueOf(eVarArr12[1].f4390a), 1);
                map.put(Integer.valueOf(eVarArr12[2].f4390a), 2);
                map.put(Integer.valueOf(eVarArr12[3].f4390a), 3);
                map.put(Integer.valueOf(eVarArr12[4].f4390a), 7);
                map.put(Integer.valueOf(eVarArr12[5].f4390a), 8);
                f4346s0 = Pattern.compile(".*[1-9].*");
                f4347t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f4348u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f4350v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f4339l0[i3] = new HashMap();
            f4340m0[i3] = new HashMap();
            for (e eVar : eVarArr11[i3]) {
                f4339l0[i3].put(Integer.valueOf(eVar.f4390a), eVar);
                f4340m0[i3].put(eVar.f4391b, eVar);
            }
            i3++;
        }
    }

    public a(String str) throws Throwable {
        e[][] eVarArr = f4337j0;
        this.f4360f = new HashMap[eVarArr.length];
        this.f4361g = new HashSet(eVarArr.length);
        this.f4362h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        u(str);
    }

    private boolean A(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderJ = J(bVar2);
                this.f4362h = byteOrderJ;
                bVar2.l(byteOrderJ);
                boolean z2 = bVar2.readShort() == 85;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean B(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f4349v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean C(HashMap map) {
        d dVar;
        int iM;
        d dVar2 = (d) map.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f4362h);
            int[] iArr2 = f4353y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f4358d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((iM = dVar.m(this.f4362h)) == 1 && Arrays.equals(iArr, f4302A)) || (iM == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f4349v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean D(int i3) {
        return i3 == 4 || i3 == 13 || i3 == 14;
    }

    private boolean E(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f4362h) <= 512 && dVar2.m(this.f4362h) <= 512;
    }

    private boolean F(byte[] bArr) {
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f4313L;
            if (i3 >= bArr2.length) {
                int i4 = 0;
                while (true) {
                    byte[] bArr3 = f4314M;
                    if (i4 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f4313L.length + i4 + 4] != bArr3[i4]) {
                        return false;
                    }
                    i4++;
                }
            } else {
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
                i3++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void G(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = r0
        L4:
            androidx.exifinterface.media.a$e[][] r2 = androidx.exifinterface.media.a.f4337j0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap[] r2 = r4.f4360f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f4359e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.h(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f4358d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f4358d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = V(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            androidx.exifinterface.media.a$g r0 = new androidx.exifinterface.media.a$g     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f4359e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.n(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f4358d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.f(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.i(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.m(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.l(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f4370p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.r(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.U(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f4358d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.g(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.k(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.q(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = androidx.exifinterface.media.a.f4349v
            if (r5 == 0) goto Lac
        L97:
            r4.I()
            goto Lac
        L9b:
            boolean r0 = androidx.exifinterface.media.a.f4349v     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.a()
            boolean r0 = androidx.exifinterface.media.a.f4349v
            if (r0 == 0) goto Lb7
            r4.I()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.G(java.io.InputStream):void");
    }

    private void H(b bVar) throws IOException {
        ByteOrder byteOrderJ = J(bVar);
        this.f4362h = byteOrderJ;
        bVar.l(byteOrderJ);
        int unsignedShort = bVar.readUnsignedShort();
        int i3 = this.f4358d;
        if (i3 != 7 && i3 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i4 = bVar.readInt();
        if (i4 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i4);
        }
        int i5 = i4 - 8;
        if (i5 > 0) {
            bVar.q(i5);
        }
    }

    private void I() {
        for (int i3 = 0; i3 < this.f4360f.length; i3++) {
            Log.d("ExifInterface", "The size of tag group[" + i3 + "]: " + this.f4360f[i3].size());
            for (Map.Entry entry : this.f4360f[i3].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f4362h) + "'");
            }
        }
    }

    private ByteOrder J(b bVar) throws IOException {
        short s2 = bVar.readShort();
        if (s2 == 18761) {
            if (f4349v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            if (f4349v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    private void K(byte[] bArr, int i3) throws IOException {
        g gVar = new g(bArr);
        H(gVar);
        L(gVar, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void L(androidx.exifinterface.media.a.g r28, int r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.L(androidx.exifinterface.media.a$g, int):void");
    }

    private void M(String str) {
        for (int i3 = 0; i3 < f4337j0.length; i3++) {
            this.f4360f[i3].remove(str);
        }
    }

    private void N(int i3, String str, String str2) {
        if (this.f4360f[i3].isEmpty() || this.f4360f[i3].get(str) == null) {
            return;
        }
        HashMap map = this.f4360f[i3];
        map.put(str2, map.get(str));
        this.f4360f[i3].remove(str);
    }

    private void O(g gVar, int i3) throws Throwable {
        d dVar = (d) this.f4360f[i3].get("ImageLength");
        d dVar2 = (d) this.f4360f[i3].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f4360f[i3].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f4360f[i3].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iM = dVar3.m(this.f4362h);
            int iM2 = dVar3.m(this.f4362h);
            gVar.r(iM);
            byte[] bArr = new byte[iM2];
            gVar.readFully(bArr);
            g(new b(bArr), iM, i3);
        }
    }

    private void Q(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f4349v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.c(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.c(-40);
        d dVar = (d("Xmp") == null || !this.f4375u) ? null : (d) this.f4360f[0].remove("Xmp");
        cVar.c(-1);
        cVar.c(-31);
        Z(cVar);
        if (dVar != null) {
            this.f4360f[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b3 = bVar.readByte();
            if (b3 == -39 || b3 == -38) {
                cVar.c(-1);
                cVar.c(b3);
                androidx.exifinterface.media.b.d(bVar, cVar);
                return;
            }
            if (b3 != -31) {
                cVar.c(-1);
                cVar.c(b3);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.r(unsignedShort);
                int i3 = unsignedShort - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i3 > 0) {
                    int i4 = bVar.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 >= 0) {
                        cVar.write(bArr, 0, i4);
                        i3 -= i4;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i5 = unsignedShort2 - 2;
                if (i5 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i5 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f4344q0)) {
                        bVar.q(unsignedShort2 - 8);
                    }
                }
                cVar.c(-1);
                cVar.c(b3);
                cVar.r(unsignedShort2);
                if (i5 >= 6) {
                    i5 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i5 > 0) {
                    int i6 = bVar.read(bArr, 0, Math.min(i5, 4096));
                    if (i6 >= 0) {
                        cVar.write(bArr, 0, i6);
                        i5 -= i6;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void R(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f4349v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        androidx.exifinterface.media.b.e(bVar, cVar, f4309H.length);
        if (this.f4370p == 0) {
            int i3 = bVar.readInt();
            cVar.f(i3);
            androidx.exifinterface.media.b.e(bVar, cVar, i3 + 8);
        } else {
            androidx.exifinterface.media.b.e(bVar, cVar, (r2 - r7.length) - 8);
            bVar.q(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            Z(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f4384a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.f((int) crc32.getValue());
            androidx.exifinterface.media.b.b(byteArrayOutputStream);
            androidx.exifinterface.media.b.d(bVar, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.b(byteArrayOutputStream2);
            throw th;
        }
    }

    private void S(InputStream inputStream, OutputStream outputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        int i4;
        int i5;
        if (f4349v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f4313L;
        androidx.exifinterface.media.b.e(bVar, cVar, bArr.length);
        byte[] bArr2 = f4314M;
        bVar.q(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e3) {
            e = e3;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i6 = this.f4370p;
            if (i6 != 0) {
                androidx.exifinterface.media.b.e(bVar, cVar2, (i6 - ((bArr.length + 4) + bArr2.length)) - 8);
                bVar.q(4);
                int i7 = bVar.readInt();
                if (i7 % 2 != 0) {
                    i7++;
                }
                bVar.q(i7);
            } else {
                byte[] bArr3 = new byte[4];
                bVar.readFully(bArr3);
                byte[] bArr4 = f4317P;
                boolean z2 = true;
                if (!Arrays.equals(bArr3, bArr4)) {
                    byte[] bArr5 = f4319R;
                    if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, f4318Q)) {
                        int i8 = bVar.readInt();
                        int i9 = i8 % 2 == 1 ? i8 + 1 : i8;
                        byte[] bArr6 = new byte[3];
                        if (Arrays.equals(bArr3, bArr5)) {
                            bVar.readFully(bArr6);
                            byte[] bArr7 = new byte[3];
                            bVar.readFully(bArr7);
                            if (!Arrays.equals(f4316O, bArr7)) {
                                throw new IOException("Error checking VP8 signature");
                            }
                            int i10 = bVar.readInt();
                            i5 = (i10 << 2) >> 18;
                            i9 -= 10;
                            i3 = (i10 << 18) >> 18;
                            i4 = i10;
                            z2 = false;
                        } else if (!Arrays.equals(bArr3, f4318Q)) {
                            i3 = 0;
                            z2 = false;
                            i4 = 0;
                            i5 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Error checking VP8L signature");
                            }
                            i4 = bVar.readInt();
                            i3 = (i4 & 16383) + 1;
                            i5 = ((i4 & 268419072) >>> 14) + 1;
                            if ((i4 & 268435456) == 0) {
                                z2 = false;
                            }
                            i9 -= 5;
                        }
                        cVar2.write(bArr4);
                        cVar2.f(10);
                        byte[] bArr8 = new byte[10];
                        if (z2) {
                            bArr8[0] = (byte) (bArr8[0] | 16);
                        }
                        bArr8[0] = (byte) (bArr8[0] | 8);
                        int i11 = i3 - 1;
                        int i12 = i5 - 1;
                        bArr8[4] = (byte) i11;
                        bArr8[5] = (byte) (i11 >> 8);
                        bArr8[6] = (byte) (i11 >> 16);
                        bArr8[7] = (byte) i12;
                        bArr8[8] = (byte) (i12 >> 8);
                        bArr8[9] = (byte) (i12 >> 16);
                        cVar2.write(bArr8);
                        cVar2.write(bArr3);
                        cVar2.f(i8);
                        if (Arrays.equals(bArr3, bArr5)) {
                            cVar2.write(bArr6);
                            cVar2.write(f4316O);
                        } else {
                            if (Arrays.equals(bArr3, f4318Q)) {
                                cVar2.write(47);
                            }
                            androidx.exifinterface.media.b.e(bVar, cVar2, i9);
                        }
                        cVar2.f(i4);
                        androidx.exifinterface.media.b.e(bVar, cVar2, i9);
                    }
                    androidx.exifinterface.media.b.d(bVar, cVar2);
                    int size = byteArrayOutputStream.size();
                    byte[] bArr9 = f4314M;
                    cVar.f(size + bArr9.length);
                    cVar.write(bArr9);
                    byteArrayOutputStream.writeTo(cVar);
                    androidx.exifinterface.media.b.b(byteArrayOutputStream);
                }
                int i13 = bVar.readInt();
                byte[] bArr10 = new byte[i13 % 2 == 1 ? i13 + 1 : i13];
                bVar.readFully(bArr10);
                byte b3 = (byte) (8 | bArr10[0]);
                bArr10[0] = b3;
                boolean z3 = ((b3 >> 1) & 1) == 1;
                cVar2.write(bArr4);
                cVar2.f(i13);
                cVar2.write(bArr10);
                if (z3) {
                    b(bVar, cVar2, f4320S, null);
                    while (true) {
                        byte[] bArr11 = new byte[4];
                        try {
                            bVar.readFully(bArr11);
                            if (!Arrays.equals(bArr11, f4321T)) {
                                break;
                            } else {
                                c(bVar, cVar2, bArr11);
                            }
                        } catch (EOFException unused) {
                        }
                    }
                } else {
                    b(bVar, cVar2, f4319R, f4318Q);
                }
            }
            Z(cVar2);
            androidx.exifinterface.media.b.d(bVar, cVar2);
            int size2 = byteArrayOutputStream.size();
            byte[] bArr92 = f4314M;
            cVar.f(size2 + bArr92.length);
            cVar.write(bArr92);
            byteArrayOutputStream.writeTo(cVar);
            androidx.exifinterface.media.b.b(byteArrayOutputStream);
        } catch (Exception e4) {
            e = e4;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.b(byteArrayOutputStream2);
            throw th;
        }
    }

    private void U(b bVar) throws Throwable {
        HashMap map = this.f4360f[4];
        d dVar = (d) map.get("Compression");
        if (dVar != null) {
            int iM = dVar.m(this.f4362h);
            this.f4369o = iM;
            if (iM != 1) {
                if (iM != 6) {
                    if (iM != 7) {
                        return;
                    }
                }
            }
            if (C(map)) {
                t(bVar, map);
                return;
            }
            return;
        }
        this.f4369o = 6;
        s(bVar, map);
    }

    private static boolean V(int i3) {
        return (i3 == 4 || i3 == 9 || i3 == 13 || i3 == 14) ? false : true;
    }

    private void W(int i3, int i4) throws Throwable {
        String str;
        if (this.f4360f[i3].isEmpty() || this.f4360f[i4].isEmpty()) {
            if (f4349v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) this.f4360f[i3].get("ImageLength");
        d dVar2 = (d) this.f4360f[i3].get("ImageWidth");
        d dVar3 = (d) this.f4360f[i4].get("ImageLength");
        d dVar4 = (d) this.f4360f[i4].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (!f4349v) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (dVar3 != null && dVar4 != null) {
                int iM = dVar.m(this.f4362h);
                int iM2 = dVar2.m(this.f4362h);
                int iM3 = dVar3.m(this.f4362h);
                int iM4 = dVar4.m(this.f4362h);
                if (iM >= iM3 || iM2 >= iM4) {
                    return;
                }
                HashMap[] mapArr = this.f4360f;
                HashMap map = mapArr[i3];
                mapArr[i3] = mapArr[i4];
                mapArr[i4] = map;
                return;
            }
            if (!f4349v) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    private void X(g gVar, int i3) throws Throwable {
        StringBuilder sb;
        String string;
        d dVarJ;
        d dVarJ2;
        d dVar = (d) this.f4360f[i3].get("DefaultCropSize");
        d dVar2 = (d) this.f4360f[i3].get("SensorTopBorder");
        d dVar3 = (d) this.f4360f[i3].get("SensorLeftBorder");
        d dVar4 = (d) this.f4360f[i3].get("SensorBottomBorder");
        d dVar5 = (d) this.f4360f[i3].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                O(gVar, i3);
                return;
            }
            int iM = dVar2.m(this.f4362h);
            int iM2 = dVar4.m(this.f4362h);
            int iM3 = dVar5.m(this.f4362h);
            int iM4 = dVar3.m(this.f4362h);
            if (iM2 <= iM || iM3 <= iM4) {
                return;
            }
            d dVarJ3 = d.j(iM2 - iM, this.f4362h);
            d dVarJ4 = d.j(iM3 - iM4, this.f4362h);
            this.f4360f[i3].put("ImageLength", dVarJ3);
            this.f4360f[i3].put("ImageWidth", dVarJ4);
            return;
        }
        if (dVar.f4386a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f4362h);
            if (fVarArr != null && fVarArr.length == 2) {
                dVarJ = d.h(fVarArr[0], this.f4362h);
                dVarJ2 = d.h(fVarArr[1], this.f4362h);
                this.f4360f[i3].put("ImageWidth", dVarJ);
                this.f4360f[i3].put("ImageLength", dVarJ2);
                return;
            }
            sb = new StringBuilder();
            sb.append("Invalid crop size values. cropSize=");
            string = Arrays.toString(fVarArr);
            sb.append(string);
            Log.w("ExifInterface", sb.toString());
        }
        int[] iArr = (int[]) dVar.o(this.f4362h);
        if (iArr != null && iArr.length == 2) {
            dVarJ = d.j(iArr[0], this.f4362h);
            dVarJ2 = d.j(iArr[1], this.f4362h);
            this.f4360f[i3].put("ImageWidth", dVarJ);
            this.f4360f[i3].put("ImageLength", dVarJ2);
            return;
        }
        sb = new StringBuilder();
        sb.append("Invalid crop size values. cropSize=");
        string = Arrays.toString(iArr);
        sb.append(string);
        Log.w("ExifInterface", sb.toString());
    }

    private void Y() throws Throwable {
        W(0, 5);
        W(0, 4);
        W(5, 4);
        d dVar = (d) this.f4360f[1].get("PixelXDimension");
        d dVar2 = (d) this.f4360f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f4360f[0].put("ImageWidth", dVar);
            this.f4360f[0].put("ImageLength", dVar2);
        }
        if (this.f4360f[4].isEmpty() && E(this.f4360f[5])) {
            HashMap[] mapArr = this.f4360f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!E(this.f4360f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        N(0, "ThumbnailOrientation", "Orientation");
        N(0, "ThumbnailImageLength", "ImageLength");
        N(0, "ThumbnailImageWidth", "ImageWidth");
        N(5, "ThumbnailOrientation", "Orientation");
        N(5, "ThumbnailImageLength", "ImageLength");
        N(5, "ThumbnailImageWidth", "ImageWidth");
        N(4, "Orientation", "ThumbnailOrientation");
        N(4, "ImageLength", "ThumbnailImageLength");
        N(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int Z(c cVar) throws IOException {
        e[][] eVarArr = f4337j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f4338k0) {
            M(eVar.f4391b);
        }
        if (this.f4363i) {
            if (this.f4364j) {
                M("StripOffsets");
                M("StripByteCounts");
            } else {
                M("JPEGInterchangeFormat");
                M("JPEGInterchangeFormatLength");
            }
        }
        for (int i3 = 0; i3 < f4337j0.length; i3++) {
            for (Object obj : this.f4360f[i3].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f4360f[i3].remove(entry.getKey());
                }
            }
        }
        if (!this.f4360f[1].isEmpty()) {
            this.f4360f[0].put(f4338k0[1].f4391b, d.f(0L, this.f4362h));
        }
        if (!this.f4360f[2].isEmpty()) {
            this.f4360f[0].put(f4338k0[2].f4391b, d.f(0L, this.f4362h));
        }
        if (!this.f4360f[3].isEmpty()) {
            this.f4360f[1].put(f4338k0[3].f4391b, d.f(0L, this.f4362h));
        }
        if (this.f4363i) {
            if (this.f4364j) {
                this.f4360f[4].put("StripOffsets", d.j(0, this.f4362h));
                this.f4360f[4].put("StripByteCounts", d.j(this.f4367m, this.f4362h));
            } else {
                this.f4360f[4].put("JPEGInterchangeFormat", d.f(0L, this.f4362h));
                this.f4360f[4].put("JPEGInterchangeFormatLength", d.f(this.f4367m, this.f4362h));
            }
        }
        for (int i4 = 0; i4 < f4337j0.length; i4++) {
            Iterator it = this.f4360f[i4].entrySet().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                int iP = ((d) ((Map.Entry) it.next()).getValue()).p();
                if (iP > 4) {
                    i5 += iP;
                }
            }
            iArr2[i4] = iArr2[i4] + i5;
        }
        int size = 8;
        for (int i6 = 0; i6 < f4337j0.length; i6++) {
            if (!this.f4360f[i6].isEmpty()) {
                iArr[i6] = size;
                size += (this.f4360f[i6].size() * 12) + 6 + iArr2[i6];
            }
        }
        if (this.f4363i) {
            if (this.f4364j) {
                this.f4360f[4].put("StripOffsets", d.j(size, this.f4362h));
            } else {
                this.f4360f[4].put("JPEGInterchangeFormat", d.f(size, this.f4362h));
            }
            this.f4366l = size;
            size += this.f4367m;
        }
        if (this.f4358d == 4) {
            size += 8;
        }
        if (f4349v) {
            for (int i7 = 0; i7 < f4337j0.length; i7++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i7), Integer.valueOf(iArr[i7]), Integer.valueOf(this.f4360f[i7].size()), Integer.valueOf(iArr2[i7]), Integer.valueOf(size)));
            }
        }
        if (!this.f4360f[1].isEmpty()) {
            this.f4360f[0].put(f4338k0[1].f4391b, d.f(iArr[1], this.f4362h));
        }
        if (!this.f4360f[2].isEmpty()) {
            this.f4360f[0].put(f4338k0[2].f4391b, d.f(iArr[2], this.f4362h));
        }
        if (!this.f4360f[3].isEmpty()) {
            this.f4360f[1].put(f4338k0[3].f4391b, d.f(iArr[3], this.f4362h));
        }
        int i8 = this.f4358d;
        if (i8 == 4) {
            if (size > 65535) {
                throw new IllegalStateException("Size of exif data (" + size + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.r(size);
            cVar.write(f4344q0);
        } else if (i8 == 13) {
            cVar.f(size);
            cVar.write(f4310I);
        } else if (i8 == 14) {
            cVar.write(f4315N);
            cVar.f(size);
        }
        cVar.l(this.f4362h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.b(this.f4362h);
        cVar.r(42);
        cVar.q(8L);
        for (int i9 = 0; i9 < f4337j0.length; i9++) {
            if (!this.f4360f[i9].isEmpty()) {
                cVar.r(this.f4360f[i9].size());
                int size2 = iArr[i9] + 2 + (this.f4360f[i9].size() * 12) + 4;
                for (Map.Entry entry2 : this.f4360f[i9].entrySet()) {
                    int i10 = ((e) f4340m0[i9].get(entry2.getKey())).f4390a;
                    d dVar = (d) entry2.getValue();
                    int iP2 = dVar.p();
                    cVar.r(i10);
                    cVar.r(dVar.f4386a);
                    cVar.f(dVar.f4387b);
                    if (iP2 > 4) {
                        cVar.q(size2);
                        size2 += iP2;
                    } else {
                        cVar.write(dVar.f4389d);
                        if (iP2 < 4) {
                            while (iP2 < 4) {
                                cVar.c(0);
                                iP2++;
                            }
                        }
                    }
                }
                if (i9 != 0 || this.f4360f[4].isEmpty()) {
                    cVar.q(0L);
                } else {
                    cVar.q(iArr[4]);
                }
                Iterator it2 = this.f4360f[i9].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).f4389d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f4363i) {
            cVar.write(p());
        }
        if (this.f4358d == 14 && size % 2 == 1) {
            cVar.c(0);
        }
        cVar.b(ByteOrder.BIG_ENDIAN);
        return size;
    }

    private void a() {
        String strD = d("DateTimeOriginal");
        if (strD != null && d("DateTime") == null) {
            this.f4360f[0].put("DateTime", d.e(strD));
        }
        if (d("ImageWidth") == null) {
            this.f4360f[0].put("ImageWidth", d.f(0L, this.f4362h));
        }
        if (d("ImageLength") == null) {
            this.f4360f[0].put("ImageLength", d.f(0L, this.f4362h));
        }
        if (d("Orientation") == null) {
            this.f4360f[0].put("Orientation", d.f(0L, this.f4362h));
        }
        if (d("LightSource") == null) {
            this.f4360f[1].put("LightSource", d.f(0L, this.f4362h));
        }
    }

    private void b(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            c(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void c(b bVar, c cVar, byte[] bArr) throws IOException {
        int i3 = bVar.readInt();
        cVar.write(bArr);
        cVar.f(i3);
        if (i3 % 2 == 1) {
            i3++;
        }
        androidx.exifinterface.media.b.e(bVar, cVar, i3);
    }

    private d e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f4349v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i3 = 0; i3 < f4337j0.length; i3++) {
            d dVar = (d) this.f4360f[i3].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void f(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0089b.a(mediaMetadataRetriever, new C0088a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f4360f[0].put("ImageWidth", d.j(Integer.parseInt(strExtractMetadata), this.f4362h));
                }
                if (strExtractMetadata2 != null) {
                    this.f4360f[0].put("ImageLength", d.j(Integer.parseInt(strExtractMetadata2), this.f4362h));
                }
                if (strExtractMetadata3 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata3);
                    this.f4360f[0].put("Orientation", d.j(i3 != 90 ? i3 != 180 ? i3 != 270 ? 1 : 8 : 3 : 6, this.f4362h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata4);
                    int i5 = Integer.parseInt(strExtractMetadata5);
                    if (i5 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.r(i4);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i6 = i4 + 6;
                    int i7 = i5 - 6;
                    if (!Arrays.equals(bArr, f4344q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    gVar.readFully(bArr2);
                    this.f4370p = i6;
                    K(bArr2, 0);
                }
                if (f4349v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        r22.l(r21.f4362h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170 A[LOOP:0: B:10:0x0037->B:59:0x0170, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g(androidx.exifinterface.media.a.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.g(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int h(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (w(bArr)) {
            return 4;
        }
        if (z(bArr)) {
            return 9;
        }
        if (v(bArr)) {
            return 12;
        }
        if (x(bArr)) {
            return 7;
        }
        if (A(bArr)) {
            return 10;
        }
        if (y(bArr)) {
            return 13;
        }
        return F(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(androidx.exifinterface.media.a.g r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.i(androidx.exifinterface.media.a$g):void");
    }

    private void j(b bVar) throws Throwable {
        if (f4349v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.l(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f4309H;
        bVar.q(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i3 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i4 = length + 8;
                if (i4 == 16 && !Arrays.equals(bArr2, f4311J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f4312K)) {
                    return;
                }
                if (Arrays.equals(bArr2, f4310I)) {
                    byte[] bArr3 = new byte[i3];
                    bVar.readFully(bArr3);
                    int i5 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i5) {
                        this.f4370p = i4;
                        K(bArr3, 0);
                        Y();
                        U(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i5 + ", calculated CRC value: " + crc32.getValue());
                }
                int i6 = i3 + 4;
                bVar.q(i6);
                length = i4 + i6;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void k(b bVar) throws Throwable {
        boolean z2 = f4349v;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.q(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i5 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        bVar.q(i3 - bVar.c());
        bVar.readFully(bArr4);
        g(new b(bArr4), i3, 5);
        bVar.q(i5 - bVar.c());
        bVar.l(ByteOrder.BIG_ENDIAN);
        int i6 = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i6);
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f4332e0.f4390a) {
                short s2 = bVar.readShort();
                short s3 = bVar.readShort();
                d dVarJ = d.j(s2, this.f4362h);
                d dVarJ2 = d.j(s3, this.f4362h);
                this.f4360f[0].put("ImageLength", dVarJ);
                this.f4360f[0].put("ImageWidth", dVarJ2);
                if (f4349v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            bVar.q(unsignedShort2);
        }
    }

    private void l(g gVar) throws Throwable {
        d dVar;
        H(gVar);
        L(gVar, 0);
        X(gVar, 0);
        X(gVar, 5);
        X(gVar, 4);
        Y();
        if (this.f4358d != 8 || (dVar = (d) this.f4360f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f4389d);
        gVar2.l(this.f4362h);
        gVar2.q(6);
        L(gVar2, 9);
        d dVar2 = (d) this.f4360f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f4360f[1].put("ColorSpace", dVar2);
        }
    }

    private void m(g gVar) throws Throwable {
        if (f4349v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        l(gVar);
        d dVar = (d) this.f4360f[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.f4389d), (int) dVar.f4388c, 5);
        }
        d dVar2 = (d) this.f4360f[0].get("ISO");
        d dVar3 = (d) this.f4360f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f4360f[1].put("PhotographicSensitivity", dVar2);
    }

    private void n(g gVar) throws IOException {
        byte[] bArr = f4344q0;
        gVar.q(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f4370p = bArr.length;
        K(bArr2, 0);
    }

    private void q(b bVar) throws Throwable {
        if (f4349v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.l(ByteOrder.LITTLE_ENDIAN);
        bVar.q(f4313L.length);
        int i3 = bVar.readInt() + 8;
        byte[] bArr = f4314M;
        bVar.q(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i4 = bVar.readInt();
                int i5 = length + 8;
                if (Arrays.equals(f4315N, bArr2)) {
                    byte[] bArr3 = new byte[i4];
                    bVar.readFully(bArr3);
                    this.f4370p = i5;
                    K(bArr3, 0);
                    U(new b(bArr3));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                length = i5 + i4;
                if (length == i3) {
                    return;
                }
                if (length > i3) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.q(i4);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair r(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairR = r(strArrSplit[0]);
            if (((Integer) pairR.first).intValue() == 2) {
                return pairR;
            }
            for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                Pair pairR2 = r(strArrSplit[i3]);
                int iIntValue = (((Integer) pairR2.first).equals(pairR.first) || ((Integer) pairR2.second).equals(pairR.first)) ? ((Integer) pairR.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairR.second).intValue() == -1 || !(((Integer) pairR2.first).equals(pairR.second) || ((Integer) pairR2.second).equals(pairR.second))) ? -1 : ((Integer) pairR.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairR = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairR = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairR;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j3 = Long.parseLong(str);
                    return (j3 < 0 || j3 > 65535) ? j3 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j4 = (long) Double.parseDouble(strArrSplit2[0]);
                long j5 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j4 >= 0 && j5 >= 0) {
                    if (j4 <= 2147483647L && j5 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    private void s(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iM = dVar.m(this.f4362h);
        int iM2 = dVar2.m(this.f4362h);
        if (this.f4358d == 7) {
            iM += this.f4371q;
        }
        if (iM > 0 && iM2 > 0) {
            this.f4363i = true;
            if (this.f4355a == null && this.f4357c == null && this.f4356b == null) {
                byte[] bArr = new byte[iM2];
                bVar.q(iM);
                bVar.readFully(bArr);
                this.f4368n = bArr;
            }
            this.f4366l = iM;
            this.f4367m = iM2;
        }
        if (f4349v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM + ", length: " + iM2);
        }
    }

    private void t(b bVar, HashMap map) throws IOException {
        byte[] bArr;
        d dVar = (d) map.get("StripOffsets");
        d dVar2 = (d) map.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrC = androidx.exifinterface.media.b.c(dVar.o(this.f4362h));
        long[] jArrC2 = androidx.exifinterface.media.b.c(dVar2.o(this.f4362h));
        if (jArrC == null || jArrC.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrC2 == null || jArrC2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrC.length != jArrC2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j3 = 0;
        for (long j4 : jArrC2) {
            j3 += j4;
        }
        int i3 = (int) j3;
        byte[] bArr2 = new byte[i3];
        this.f4365k = true;
        this.f4364j = true;
        this.f4363i = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < jArrC.length) {
            int i7 = (int) jArrC[i4];
            int i8 = (int) jArrC2[i4];
            if (i4 < jArrC.length - 1) {
                bArr = bArr2;
                if (i7 + i8 != jArrC[i4 + 1]) {
                    this.f4365k = false;
                }
            } else {
                bArr = bArr2;
            }
            int i9 = i7 - i5;
            if (i9 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.q(i9);
                int i10 = i5 + i9;
                byte[] bArr3 = new byte[i8];
                try {
                    bVar.readFully(bArr3);
                    i5 = i10 + i8;
                    byte[] bArr4 = bArr;
                    System.arraycopy(bArr3, 0, bArr4, i6, i8);
                    i6 += i8;
                    i4++;
                    bArr2 = bArr4;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                return;
            }
        }
        this.f4368n = bArr2;
        if (this.f4365k) {
            this.f4366l = (int) jArrC[0];
            this.f4367m = i3;
        }
    }

    private void u(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f4357c = null;
        this.f4355a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (B(fileInputStream.getFD())) {
                this.f4356b = fileInputStream.getFD();
            } else {
                this.f4356b = null;
            }
            G(fileInputStream);
            androidx.exifinterface.media.b.b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.b(fileInputStream2);
            throw th;
        }
    }

    private boolean v(byte[] bArr) throws Throwable {
        b bVar;
        long j3;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = bVar.readInt();
            byte[] bArr2 = new byte[4];
            bVar.readFully(bArr2);
            if (!Arrays.equals(bArr2, f4304C)) {
                bVar.close();
                return false;
            }
            if (length == 1) {
                length = bVar.readLong();
                j3 = 16;
                if (length < 16) {
                    bVar.close();
                    return false;
                }
            } else {
                j3 = 8;
            }
            if (length > bArr.length) {
                length = bArr.length;
            }
            long j4 = length - j3;
            if (j4 < 8) {
                bVar.close();
                return false;
            }
            byte[] bArr3 = new byte[4];
            boolean z2 = false;
            boolean z3 = false;
            for (long j5 = 0; j5 < j4 / 4; j5++) {
                try {
                    bVar.readFully(bArr3);
                    if (j5 != 1) {
                        if (Arrays.equals(bArr3, f4305D)) {
                            z2 = true;
                        } else if (Arrays.equals(bArr3, f4306E)) {
                            z3 = true;
                        }
                        if (z2 && z3) {
                            bVar.close();
                            return true;
                        }
                    }
                } catch (EOFException unused) {
                    bVar.close();
                    return false;
                }
            }
            bVar.close();
        } catch (Exception e4) {
            e = e4;
            bVar2 = bVar;
            if (f4349v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        return false;
    }

    private static boolean w(byte[] bArr) {
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f4303B;
            if (i3 >= bArr2.length) {
                return true;
            }
            if (bArr[i3] != bArr2[i3]) {
                return false;
            }
            i3++;
        }
    }

    private boolean x(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderJ = J(bVar2);
                this.f4362h = byteOrderJ;
                bVar2.l(byteOrderJ);
                short s2 = bVar2.readShort();
                boolean z2 = s2 == 20306 || s2 == 21330;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean y(byte[] bArr) {
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f4309H;
            if (i3 >= bArr2.length) {
                return true;
            }
            if (bArr[i3] != bArr2[i3]) {
                return false;
            }
            i3++;
        }
    }

    private boolean z(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i3 = 0; i3 < bytes.length; i3++) {
            if (bArr[i3] != bytes[i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.P():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x01f1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.T(java.lang.String, java.lang.String):void");
    }

    public String d(String str) {
        String str2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarE = e(str);
        if (dVarE != null) {
            if (!f4341n0.contains(str)) {
                return dVarE.n(this.f4362h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i3 = dVarE.f4386a;
                if (i3 == 5 || i3 == 10) {
                    f[] fVarArr = (f[]) dVarE.o(this.f4362h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        f fVar = fVarArr[0];
                        Integer numValueOf = Integer.valueOf((int) (fVar.f4394a / fVar.f4395b));
                        f fVar2 = fVarArr[1];
                        Integer numValueOf2 = Integer.valueOf((int) (fVar2.f4394a / fVar2.f4395b));
                        f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f4394a / fVar3.f4395b)));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + dVarE.f4386a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(dVarE.l(this.f4362h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public byte[] o() {
        int i3 = this.f4369o;
        if (i3 == 6 || i3 == 7) {
            return p();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] p() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f4363i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.f4368n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f4357c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L2f
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L26
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L58
        L1c:
            r0 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto L90
        L21:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L82
        L26:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            androidx.exifinterface.media.b.b(r1)
            return r2
        L2f:
            java.lang.String r1 = r8.f4355a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L43
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.lang.String r3 = r8.f4355a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            goto L1a
        L3b:
            r0 = move-exception
            r3 = r2
            goto L90
        L3e:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L82
        L43:
            java.io.FileDescriptor r1 = r8.f4356b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.io.FileDescriptor r1 = androidx.exifinterface.media.b.a.b(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4 = 0
            androidx.exifinterface.media.b.a.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r7 = r3
            r3 = r1
            r1 = r7
        L58:
            androidx.exifinterface.media.a$b r4 = new androidx.exifinterface.media.a$b     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.f4366l     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r6 = r8.f4370p     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r5 + r6
            r4.q(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.f4367m     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r8.f4368n = r5     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            androidx.exifinterface.media.b.b(r1)
            if (r3 == 0) goto L76
            androidx.exifinterface.media.b.a(r3)
        L76:
            return r5
        L77:
            r0 = move-exception
            goto L1e
        L79:
            r4 = move-exception
            goto L82
        L7b:
            r0 = move-exception
            r3 = r1
            goto L90
        L7e:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L82:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L77
            androidx.exifinterface.media.b.b(r1)
            if (r3 == 0) goto L8f
            androidx.exifinterface.media.b.a(r3)
        L8f:
            return r2
        L90:
            androidx.exifinterface.media.b.b(r2)
            if (r3 == 0) goto L98
            androidx.exifinterface.media.b.a(r3)
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.p():byte[]");
    }
}
