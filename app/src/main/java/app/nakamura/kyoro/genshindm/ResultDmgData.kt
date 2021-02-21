package app.nakamura.kyoro.genshindm

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ResultDmgData(val resultName: String, val resultValue: String): Parcelable
//data class ResultDmgData(
//    @SerializedName("resultName")
//    var resultName: String,
//    @SerializedName("resultValue")
//    var resultValue: String,
//
//): Parcelable {
//
//    constructor(parcel: Parcel) : this(
//        parcel.readString(),
//        parcel.readString()
//    )
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    override fun writeToParcel(parcel: Parcel?, int: Int) {
//        parcel?.writeInt(resultName)
//        parcel?.writeInt(resultValue)
//    }
//
//    companion object CREATOR : Parcelable.Creator<ResultDmgData> {
//        override fun createFromParcel(parcel: Parcel): ResultDmgData {
//            return ResultDmgData(parcel)
//        }
//
//        override fun newArray(size: Int): Array<ResultDmgData?> {
//            return arrayOfNulls(size)
//        }
//    }
//}
