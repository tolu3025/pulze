package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import b1.AbstractC0525b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f8115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f8116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f8117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f8118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Field f8119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Method f8120f;

        /* JADX WARN: Multi-variable type inference failed */
        private b() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                AbstractC0525b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                AbstractC0525b.g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT <= 26) {
                try {
                    method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
                } catch (NoSuchMethodException unused3) {
                    AbstractC0525b.g(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                    method3 = null;
                }
                try {
                    method4 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                    field = null;
                } catch (NoSuchMethodException unused4) {
                    AbstractC0525b.g(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                    method4 = null;
                    field = null;
                }
                method5 = field;
                method6 = method3;
            } else {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method5 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    field = declaredField;
                    method4 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                    AbstractC0525b.g(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method4 = null;
                    field = null;
                    method5 = 0;
                }
            }
            this.f8115a = method;
            this.f8116b = method6;
            this.f8117c = method2;
            this.f8118d = method4;
            this.f8119e = field;
            this.f8120f = method5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long f(AccessibilityNodeInfo accessibilityNodeInfo, int i3) {
            String str;
            Method method = this.f8118d;
            if (method == null && (this.f8119e == null || this.f8120f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i3));
                } catch (IllegalAccessException e3) {
                    e = e3;
                    str = "Failed to access getChildId method.";
                } catch (InvocationTargetException e4) {
                    e = e4;
                    str = "The getChildId method threw an exception when invoked.";
                }
            } else {
                try {
                    Long l3 = (Long) this.f8120f.invoke(this.f8119e.get(accessibilityNodeInfo), Integer.valueOf(i3));
                    l3.longValue();
                    return l3;
                } catch (ArrayIndexOutOfBoundsException e5) {
                    e = e5;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (IllegalAccessException e6) {
                    e = e6;
                    str = "Failed to access longArrayGetIndex method or the childNodeId field.";
                } catch (InvocationTargetException e7) {
                    e = e7;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            }
            AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f8116b;
            if (method != null) {
                try {
                    Long l3 = (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
                    l3.longValue();
                    return l3;
                } catch (IllegalAccessException e3) {
                    e = e3;
                    str = "Failed to access getParentNodeId method.";
                    AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                } catch (InvocationTargetException e4) {
                    e = e4;
                    str = "The getParentNodeId method threw an exception when invoked.";
                    AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                }
            }
            return l(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long h(AccessibilityRecord accessibilityRecord) {
            String str;
            Method method = this.f8117c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e3) {
                e = e3;
                str = "Failed to access the getRecordSourceNodeId method.";
                AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e4) {
                e = e4;
                str = "The getRecordSourceNodeId method threw an exception when invoked.";
                AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f8115a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e3) {
                e = e3;
                str = "Failed to access getSourceNodeId method.";
                AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e4) {
                e = e4;
                str = "The getSourceNodeId method threw an exception when invoked.";
                AbstractC0525b.h(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int j(long j3) {
            return (int) (j3 >> 32);
        }

        private static boolean k(long j3, int i3) {
            return (j3 & (1 << i3)) != 0;
        }

        private static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                AbstractC0525b.g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.setDataPosition(0);
            accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            long j3 = parcelObtain.readLong();
            if (k(j3, 0)) {
                parcelObtain.readInt();
            }
            if (k(j3, 1)) {
                parcelObtain.readLong();
            }
            if (k(j3, 2)) {
                parcelObtain.readInt();
            }
            Long lValueOf = k(j3, 3) ? Long.valueOf(parcelObtain.readLong()) : null;
            parcelObtain.recycle();
            return lValueOf;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f8121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f8122b;

        private c(View view, int i3) {
            this.f8121a = view;
            this.f8122b = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8122b == cVar.f8122b && this.f8121a.equals(cVar.f8121a);
        }

        public int hashCode() {
            return ((this.f8121a.hashCode() + 31) * 31) + this.f8122b;
        }
    }

    AccessibilityViewEmbedder(View view, int i3) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i3;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int iIntValue;
        for (int i3 = 0; i3 < accessibilityNodeInfo.getChildCount(); i3++) {
            Long lF = this.reflectionAccessors.f(accessibilityNodeInfo, i3);
            if (lF != null) {
                int iJ = b.j(lF.longValue());
                c cVar = new c(view, iJ);
                if (this.originToFlutterId.containsKey(cVar)) {
                    iIntValue = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int i4 = this.nextFlutterId;
                    this.nextFlutterId = i4 + 1;
                    cacheVirtualIdMappings(view, iJ, i4);
                    iIntValue = i4;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i3, int i4) {
        c cVar = new c(view, i3);
        this.originToFlutterId.put(cVar, Integer.valueOf(i4));
        this.flutterIdToOrigin.put(i4, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i3, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i3);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i3);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i3 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (i3 >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (i3 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long lG = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (lG == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new c(view, b.j(lG.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(i3);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f8121a) || cVar.f8121a.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = cVar.f8121a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f8122b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i3, cVar.f8121a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long lH = this.reflectionAccessors.h(accessibilityRecord);
        if (lH == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(lH.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i3, Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long lI = this.reflectionAccessors.i(accessibilityNodeInfoCreateAccessibilityNodeInfo);
        if (lI == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(lI.longValue()), i3);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i3, view);
    }

    public boolean onAccessibilityHoverEvent(int i3, MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(i3);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f8121a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i4] = pointerProperties;
            motionEvent.getPointerProperties(i4, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i4, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i4] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return cVar.f8121a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i3, int i4, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(i3);
        if (cVar == null || (accessibilityNodeProvider = cVar.f8121a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f8122b, i4, bundle);
    }

    public View platformViewOfNode(int i3) {
        c cVar = this.flutterIdToOrigin.get(i3);
        if (cVar == null) {
            return null;
        }
        return cVar.f8121a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lH = this.reflectionAccessors.h(accessibilityEvent);
        if (lH == null) {
            return false;
        }
        int iJ = b.j(lH.longValue());
        Integer num = this.originToFlutterId.get(new c(view, iJ));
        if (num == null) {
            int i3 = this.nextFlutterId;
            this.nextFlutterId = i3 + 1;
            Integer numValueOf = Integer.valueOf(i3);
            cacheVirtualIdMappings(view, iJ, i3);
            num = numValueOf;
        }
        accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
        accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
        accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i4 = 0; i4 < accessibilityEventObtain.getRecordCount(); i4++) {
            AccessibilityRecord record = accessibilityEventObtain.getRecord(i4);
            Long lH2 = this.reflectionAccessors.h(record);
            if (lH2 == null) {
                return false;
            }
            c cVar = new c(view, b.j(lH2.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
    }
}
