package com.github.samarchandra.tddpluginv00.services

import com.github.samarchandra.tddpluginv00.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
