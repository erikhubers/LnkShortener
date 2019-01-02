package nl.one2one.linkshortener;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.webkit.WebView;
import android.widget.Button;

import de.cketti.library.changelog.ChangeLog;

public class CustomChangeLog extends ChangeLog {

    CustomChangeLog(Context context) {
        super(context);
    }

    /**
     * Create a dialog containing (parts of the) change log.
     *
     * @param full If this is {@code true} the full change log is displayed. Otherwise only changes for
     *             versions newer than the last version are displayed.
     * @return A dialog containing the (partial) change log.
     */
    protected AlertDialog getDialog(boolean full) {
        AlertDialog alertDialog = super.getDialog(full);

        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {                    //
                Button positiveButton = ((AlertDialog) dialog)
                        .getButton(AlertDialog.BUTTON_POSITIVE);

                if (positiveButton != null) {
                    positiveButton.setTextColor(Color.BLACK);
                }

            }
        });

        return alertDialog;
    }

}
