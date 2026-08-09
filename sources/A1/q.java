package A1;

import io.grpc.internal.W0;
import io.grpc.internal.X0;

/* JADX INFO: loaded from: classes.dex */
class q implements X0 {
    q() {
    }

    @Override // io.grpc.internal.X0
    public W0 a(int i3) {
        return new p(new m2.d(), Math.min(1048576, Math.max(4096, i3)));
    }
}
