package com.fourseasonsweb.fs

import java.text.SimpleDateFormat
import java.util.*

class Helper {
    companion object {
        fun convertLongToTime(time: Long, format: String = "yyyy.MM.dd HH:mm"): String {
            val date = Date(time)
            val format = SimpleDateFormat(format)
            return format.format(date)
        }

        fun currentDateInLong(): Long {
            return System.currentTimeMillis()
        }
    }
}