package com.example.labass5intent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee(val name:String, val gender :String, val email:String, val Salary:Int) : Parcelable   {
}