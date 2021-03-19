package com.example.smartspaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sensorberg.smartspaces.sdk.SmartSpacesSdk

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sdk = SmartSpacesSdk
            .Builder(
                application,
                "https://beyondbuild.sensorberg.com",
                "",
                "sha256/"
            )
            .build()
    }
}