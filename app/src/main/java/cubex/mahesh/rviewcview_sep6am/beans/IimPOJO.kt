package cubex.mahesh.rviewcview_sep6am.beans

import com.google.gson.annotations.SerializedName

data class IimPOJO(@SerializedName("totRecords")
                   val totRecords: Int = 0,
                   @SerializedName("success")
                   val success: Int = 0,
                   @SerializedName("members")
                   val members: List<MembersItem>?,
                   @SerializedName("IIMPhotoURL")
                   val iIMPhotoURL: String = "",
                   @SerializedName("NoImageURL")
                   val noImageURL: String = "")