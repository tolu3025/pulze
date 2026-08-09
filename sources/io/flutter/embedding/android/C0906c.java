package io.flutter.embedding.android;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.flutter.embedding.android.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0906c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Matrix f7622f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterRenderer f7623a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7625c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7627e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7626d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N f7624b = N.a();

    public C0906c(FlutterRenderer flutterRenderer, boolean z2) {
        this.f7623a = flutterRenderer;
        this.f7625c = z2;
    }

    private void a(MotionEvent motionEvent, int i3, int i4, int i5, Matrix matrix, ByteBuffer byteBuffer) {
        b(motionEvent, i3, i4, i5, matrix, byteBuffer, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(android.view.MotionEvent r26, int r27, int r28, int r29, android.graphics.Matrix r30, java.nio.ByteBuffer r31, android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.C0906c.b(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    private float c(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? ViewConfiguration.get(context).getScaledHorizontalScrollFactor() : i(context);
    }

    private int d(int i3) {
        if (i3 == 0) {
            return 4;
        }
        if (i3 == 1) {
            return 6;
        }
        if (i3 == 5) {
            return 4;
        }
        if (i3 == 6) {
            return 6;
        }
        if (i3 == 2) {
            return 5;
        }
        if (i3 == 7) {
            return 3;
        }
        if (i3 == 3) {
            return 0;
        }
        return i3 == 8 ? 3 : -1;
    }

    private int e(int i3) {
        if (i3 == 4) {
            return 7;
        }
        if (i3 == 5) {
            return 8;
        }
        return (i3 == 6 || i3 == 0) ? 9 : -1;
    }

    private int f(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 != 3) {
            return i3 != 4 ? 5 : 3;
        }
        return 1;
    }

    private float g(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? h(context) : i(context);
    }

    private float h(Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }

    private int i(Context context) {
        if (this.f7627e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f7627e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f7627e;
    }

    public boolean j(MotionEvent motionEvent, Context context) {
        boolean zIsFromSource = motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!zIsFromSource || !z2) {
            return false;
        }
        int iD = d(motionEvent.getActionMasked());
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        b(motionEvent, motionEvent.getActionIndex(), iD, 0, f7622f, byteBufferAllocateDirect, context);
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f7623a.g(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return l(motionEvent, f7622f);
    }

    public boolean l(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(pointerCount * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int iD = d(motionEvent.getActionMasked());
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        if (z2) {
            a(motionEvent, motionEvent.getActionIndex(), iD, 0, matrix, byteBufferAllocateDirect);
        } else {
            int i3 = 0;
            if (z3) {
                while (i3 < pointerCount) {
                    if (i3 != motionEvent.getActionIndex() && motionEvent.getToolType(i3) == 1) {
                        a(motionEvent, i3, 5, 1, matrix, byteBufferAllocateDirect);
                    }
                    i3++;
                }
                a(motionEvent, motionEvent.getActionIndex(), iD, 0, matrix, byteBufferAllocateDirect);
            } else {
                while (i3 < pointerCount) {
                    a(motionEvent, i3, iD, 0, matrix, byteBufferAllocateDirect);
                    i3++;
                }
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f7623a.g(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }
}
