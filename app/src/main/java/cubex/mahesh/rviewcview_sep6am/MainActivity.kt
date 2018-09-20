package cubex.mahesh.rviewcview_sep6am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import cubex.mahesh.rviewcview_sep6am.beans.IimPOJO
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lManager = LinearLayoutManager(
                this@MainActivity,
                LinearLayoutManager.VERTICAL,false)
        rview.layoutManager = lManager

        var r = Retrofit.Builder().
                addConverterFactory(GsonConverterFactory.create()).
                baseUrl("http://bhaveshpatel.in/").
                build()

        var api = r.create(IimAPI::class.java)
        var call = api.getIimDetails()
        call.enqueue(object : Callback<IimPOJO> {
            override fun onFailure(call: Call<IimPOJO>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<IimPOJO>?,
                                    response: Response<IimPOJO>?) {
                var main_pojo = response!!.body()
                var iims_list = main_pojo!!.members
          /*      for(item in iims_list!!){
      Log.i("msg","${item.iiimId} \n ${item.iimTitle} \n ${item.directorName}\n **********************")
                } */
            }
        })

    }
}
