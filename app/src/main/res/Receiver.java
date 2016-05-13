import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.a453472.broadcast.MainActivity;

/**
 * Created by 453472 on 2016/5/13.
 */
public class Receiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            // service
            Intent serviceIntent = new Intent(context, BootService.class);
            context.startService(serviceIntent);

            //activity
            Intent activityIntent = new Intent(context, MainActivity.class);
            activityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startService(activityIntent);
        }
    }
}
