package wa.android.oaas;

import android.graphics.Color;

/**
 * Created by 夏森海
 * 16/9/23.
 */

public class PDFViewSettings {
    public static final PDFViewSettings DEFAULT = new PDFViewSettings(OAASDefine.PDFInView.EDIT, Color.RED, 8.5f);
    public static final PDFViewSettings READONLY = new PDFViewSettings(OAASDefine.PDFInView.READ, -1, -1, true);
    private int annotationColor;
    private float annotationThickness;
    private OAASDefine.PDFInView pdfInView;
    private boolean readOnly;

    public int getAnnotationColor() {
        return annotationColor;
    }

    public void setAnnotationColor(int annotationColor) {
        this.annotationColor = annotationColor;
    }

    public float getAnnotationThickness() {
        return annotationThickness;
    }

    public void setAnnotationThickness(float annotationThickness) {
        this.annotationThickness = annotationThickness;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public OAASDefine.PDFInView getPdfInView() {
        return pdfInView;
    }

    public void setPdfInView(OAASDefine.PDFInView pdfInView) {
        this.pdfInView = pdfInView;
    }

    public PDFViewSettings(OAASDefine.PDFInView pdfInView, int annotationColor, float annotationThickness) {
        this(pdfInView, annotationColor, annotationThickness, false);
    }

    public PDFViewSettings(OAASDefine.PDFInView pdfInView, int annotationColor, float annotationThickness, boolean readOnly) {
        this.annotationColor = annotationColor;
        this.annotationThickness = annotationThickness;
        this.pdfInView = pdfInView;
        this.readOnly = readOnly;
    }

    public PDFViewSettings() {
    }
}
