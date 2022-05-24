package com.github.qizhuocai.armstemplatetest.services

import com.intellij.openapi.project.Project
import com.github.qizhuocai.armstemplatetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
