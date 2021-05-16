package com.washup.customer.data.model

import java.io.Serializable

data class User(
    val uid: String,
    val name: String?,
    val email: String?,
    var isAuthenticated: Boolean = false,
    var isNew: Boolean? = false,
    var isCreated: Boolean = false

) : Serializable{

    constructor() : this("","","") {
    }

}