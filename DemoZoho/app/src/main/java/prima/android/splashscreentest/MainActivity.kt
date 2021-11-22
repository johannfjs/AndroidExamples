package prima.android.splashscreentest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zoho.salesiqembed.ZohoSalesIQ

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ZohoSalesIQ.showLauncher(true)
    }
}