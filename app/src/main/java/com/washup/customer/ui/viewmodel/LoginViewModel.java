package com.washup.customer.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.firebase.auth.AuthCredential;
import com.washup.customer.data.model.User;
import com.washup.customer.data.repository.AuthRepo;

class LoginViewModel {
     constructor(
            private val authRepository:AuthRepo):

     ViewModel() {

        private var _authenticateUserLiveData:MutableLiveData<ResponseState<User>>=MutableLiveData()
        val authenticateUserLiveData:LiveData<ResponseState<User>> get
        () = _authenticateUserLiveData

        fun signInWithGoogle (googleAuthCredential:AuthCredential){
            _authenticateUserLiveData = authRepository.firebaseSignInWithGoogle(googleAuthCredential)
        }


    }
}
