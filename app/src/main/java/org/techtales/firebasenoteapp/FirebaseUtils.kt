package org.techtales.firebasenoteapp

import android.provider.ContactsContract.CommonDataKinds.Note
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import javax.security.auth.callback.Callback

class FirebaseUtils {
    private val database = FirebaseDatabase.getInstance()
    private val noteRef = database.getReference("Notes")


    fun addNote(note: Note,callback: (Boolean)->Unit){
        val currentUser = FirebaseAuth.getInstance().currentUser
        if (currentUser!=null){
            val noteRef = noteRef.child(currentUser.uid).push()
            noteRef
        }

    }
}