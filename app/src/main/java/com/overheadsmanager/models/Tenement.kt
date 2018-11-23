package com.overheadsmanager.models

data class Tenement(
    var address : Address,
    var tenants : MutableList<User> = mutableListOf(),
    var landlord : User
)