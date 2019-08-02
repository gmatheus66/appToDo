package com.example.testklotin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var fb = FirebaseAuth.getInstance()


        var account = fb.currentUser

        text1.setText(account?.displayName);

        text2.setText(account?.email);

        text3.setText(account?.uid)



        setupUI();
    }


    private fun setupUI() {
        sign_out_button.setOnClickListener {
            signOut()
        }
    }
    private fun signOut() {
        startActivity(Main.getLaunchIntent(this))
        FirebaseAuth.getInstance().signOut();
    }
    companion object {
        fun getLaunchIntent(from: Context) = Intent(from, HomeActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }
}
