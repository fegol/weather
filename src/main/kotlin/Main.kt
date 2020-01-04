import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.roundToInt

val api = Retrofit.Builder()
    .baseUrl("https://openweathermap.org/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(WeatherApi::class.java)

fun main() {
    println(
        api.getWeather()
            .execute()
            .body()
            ?.main
            ?.temp
            ?.roundToInt()
    )
}