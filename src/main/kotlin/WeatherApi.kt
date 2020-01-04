import retrofit2.Call
import retrofit2.http.GET

interface WeatherApi {
    @GET("data/2.5/weather?id=524901&appid=b6907d289e10d714a6e88b30761fae22")
    fun getWeather(): Call<WeatherResponse>
}