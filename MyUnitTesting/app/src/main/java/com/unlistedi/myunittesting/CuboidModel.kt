package com.unlistedi.myunittesting

open class CuboidModel {
    private var width : Double = 0.0
    private var length : Double = 0.0
    private var height : Double = 0.0

    fun save(width : Double, length : Double, height: Double){
        this.width = width
        this.length = length
        this.height = height
    }

    fun getVolume(): Double {
        return width * length * height
    }

    fun getSurfaceArea(): Double {
        val wl: Double = width * length
        val wh = width * height
        val lh: Double = length * height
        return 2 * (wl + wh + lh)
    }

    fun getCircumference(): Double {
        return 4 * (width * length * height)
    }

}