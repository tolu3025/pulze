package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Matrix f7738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Rect f7739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f7740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f7741d;

        public a(Matrix matrix) {
            this.f7741d = b.TRANSFORM;
            this.f7738a = matrix;
        }

        public Matrix a() {
            return this.f7738a;
        }

        public a(Rect rect) {
            this.f7741d = b.CLIP_RECT;
            this.f7739b = rect;
        }

        public a(Rect rect, float[] fArr) {
            this.f7741d = b.CLIP_RRECT;
            this.f7739b = rect;
            this.f7740c = fArr;
        }
    }

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i3, int i4, int i5, int i6, float[] fArr) {
        Rect rect = new Rect(i3, i4, i5, i6);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i3, int i4, int i5, int i6) {
        Rect rect = new Rect(i3, i4, i5, i6);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }
}
