package cz.muni.consumption.ui.util

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("ConstantLocale")
object DateUtil {

    val dateFormat = SimpleDateFormat("dd. MM. yyyy", Locale.getDefault())
    val yearMonthFormat = SimpleDateFormat("MMM yyyy", Locale.getDefault())
    val apiFormat = SimpleDateFormat("yyyy-MM-DD", Locale.getDefault())
}