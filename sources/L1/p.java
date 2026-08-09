package l1;

import b1.AbstractC0525b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l1.o;

/* JADX INFO: loaded from: classes.dex */
public final class p implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f9793b = new p(o.f9790a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9794a;

    public p(o oVar) {
        this.f9794a = oVar;
    }

    @Override // l1.l
    public ByteBuffer a(Object obj) throws IOException {
        o.a aVar = new o.a();
        aVar.write(0);
        this.f9794a.p(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.b(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // l1.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) throws IOException {
        o.a aVar = new o.a();
        aVar.write(1);
        this.f9794a.p(aVar, str);
        this.f9794a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f9794a.p(aVar, AbstractC0525b.d((Throwable) obj));
        } else {
            this.f9794a.p(aVar, obj);
        }
        this.f9794a.p(aVar, str3);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.b(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // l1.l
    public ByteBuffer c(String str, String str2, Object obj) throws IOException {
        o.a aVar = new o.a();
        aVar.write(1);
        this.f9794a.p(aVar, str);
        this.f9794a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f9794a.p(aVar, AbstractC0525b.d((Throwable) obj));
        } else {
            this.f9794a.p(aVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.b(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // l1.l
    public ByteBuffer d(j jVar) {
        o.a aVar = new o.a();
        this.f9794a.p(aVar, jVar.f9778a);
        this.f9794a.p(aVar, jVar.f9779b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.b(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // l1.l
    public j e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objF = this.f9794a.f(byteBuffer);
        Object objF2 = this.f9794a.f(byteBuffer);
        if (!(objF instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new j((String) objF, objF2);
    }

    @Override // l1.l
    public Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b3 = byteBuffer.get();
        if (b3 != 0) {
            if (b3 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objF = this.f9794a.f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objF;
        }
        Object objF2 = this.f9794a.f(byteBuffer);
        Object objF3 = this.f9794a.f(byteBuffer);
        Object objF4 = this.f9794a.f(byteBuffer);
        if ((objF2 instanceof String) && ((objF3 == null || (objF3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new e((String) objF2, (String) objF3, objF4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
