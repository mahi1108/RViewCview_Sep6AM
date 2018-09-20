package cubex.mahesh.rviewcview_sep6am

import cubex.mahesh.rviewcview_sep6am.beans.IimPOJO
import retrofit2.Call
import retrofit2.http.GET

interface IimAPI {
    @GET("testapi/member.html")
    fun getIimDetails( ):Call<IimPOJO>
}