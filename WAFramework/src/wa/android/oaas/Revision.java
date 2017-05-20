package wa.android.oaas;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 夏森海
 * 16/9/22.
 */
public class Revision {
    private String username;
    private boolean enabled;
    private boolean showReviewPanel;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isShowReviewPanel() {
        return showReviewPanel;
    }

    public void setShowReviewPanel(boolean showReviewPanel) {
        this.showReviewPanel = showReviewPanel;
    }

    public Revision(String username) {
        this.username = username;
        this.enabled = true;
        this.showReviewPanel = true;
    }

    public Revision() {
    }

}