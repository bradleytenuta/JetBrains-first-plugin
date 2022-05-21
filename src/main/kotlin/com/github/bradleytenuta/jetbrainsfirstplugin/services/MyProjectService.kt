package com.github.bradleytenuta.jetbrainsfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.bradleytenuta.jetbrainsfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
