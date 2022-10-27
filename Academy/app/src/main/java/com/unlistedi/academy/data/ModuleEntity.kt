package com.unlistedi.academy.data

class ModuleEntity(
    var moduleId : String,
    var courseId : String,
    var title : String,
    var position : Int,
    var read : Boolean? = false) {

    lateinit var contentEntity: ContentEntity
    init {
        if (read == null){
            read = false
        }
    }
}