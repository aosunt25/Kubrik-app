package edu.itesm.stanley

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Actors(val name:String, val description:String): Parcelable
