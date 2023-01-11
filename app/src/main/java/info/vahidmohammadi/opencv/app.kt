package info.vahidmohammadi.opencv

import android.app.Application

class app : Application() {

    init {
        System.loadLibrary("opencv_java4")
    }

}