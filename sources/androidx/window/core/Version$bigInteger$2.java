package androidx.window.core;

import U1.a;
import java.math.BigInteger;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
final class Version$bigInteger$2 extends n implements a {
    final /* synthetic */ Version this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    @Override // U1.a
    public final BigInteger invoke() {
        return BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getPatch()));
    }
}
