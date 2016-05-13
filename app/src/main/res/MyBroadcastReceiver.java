import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by 453472 on 2016/5/13.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {

    public void onReceive (Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){

            Intent serviceIntent = new Intent(context, BootService.class);
            context.startService(serviceIntent);

        }
    }
}
