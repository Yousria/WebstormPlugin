package com.github.yousria.webstormplugin.services

import com.intellij.openapi.project.Project
import com.github.yousria.webstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
